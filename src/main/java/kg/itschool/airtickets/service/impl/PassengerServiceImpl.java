package kg.itschool.airtickets.service.impl;

import kg.itschool.airtickets.dao.PassengerRepository;
import kg.itschool.airtickets.dto.PassengerDTO;
import kg.itschool.airtickets.entity.Passenger;
import kg.itschool.airtickets.mapper.PassengerMapper;
import kg.itschool.airtickets.service.PassengerService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    private PassengerMapper passengerMapper;

    @Override
    public void register(PassengerDTO passengerDTO) {
        System.out.println("Service");
        Passenger passenger = new Passenger();
        passenger.setEmail(passengerDTO.getEmail());
        passenger.setPassword(passengerDTO.getPassword());

        passengerRepository.insertPassenger(passenger);
    }



}
