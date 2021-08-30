package kg.itschool.airtickets.mapper.impl;

import kg.itschool.airtickets.dto.PassengerDTO;
import kg.itschool.airtickets.entity.Passenger;
import kg.itschool.airtickets.mapper.PassengerMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PassengerMapperImpl implements PassengerMapper {

    public Passenger toEntity(PassengerDTO passengerDTO) {
        Passenger passenger = new Passenger();
        passenger.setId(passengerDTO.getId());
        passenger.setFirstName(passengerDTO.getFirstName());
        passenger.setLastName(passengerDTO.getLastName());
        passenger.setEmail(passengerDTO.getEmail());
        passenger.setDateOfBirth(passengerDTO.getDateOfBirth());
        passenger.setGender(passengerDTO.getGender());
        passenger.setPassport(passengerDTO.getPassport());
        passenger.setPhoneNumber(passengerDTO.getPhoneNumber());
        passenger.setPassword(passengerDTO.getPassword());
        return passenger;
    }

    public List<Passenger> toEntityList(List<PassengerDTO> passengerDTOList) {
        return Stream
                .of(passengerDTOList.toArray(new PassengerDTO[0]))
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    public PassengerDTO toDTO(Passenger passenger) {
        PassengerDTO passengerDTO = new PassengerDTO();
        passengerDTO.setId(passenger.getId());
        passengerDTO.setFirstName(passenger.getFirstName());
        passengerDTO.setLastName(passenger.getLastName());
        passengerDTO.setEmail(passenger.getEmail());
        passengerDTO.setPassport(passenger.getPassword());
        passengerDTO.setPhoneNumber(passenger.getPhoneNumber());
        passengerDTO.setPassword(passenger.getPassword());
        passengerDTO.setDateOfBirth(passenger.getDateOfBirth());
        passengerDTO.setGender(passenger.getGender());
        return passengerDTO;
    }

    public List<PassengerDTO> toDTOList(List<Passenger> passengerList) {
        List<PassengerDTO> dtoList = new ArrayList<>();
        for (Passenger passenger : passengerList) {
            dtoList.add(toDTO(passenger));
        }
        return dtoList;
    }

}
