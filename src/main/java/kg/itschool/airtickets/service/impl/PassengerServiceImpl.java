package kg.itschool.airtickets.service.impl;

import kg.itschool.airtickets.dao.PassengerRepository;
import kg.itschool.airtickets.dto.PassengerDTO;
import kg.itschool.airtickets.mapper.PassengerMapper;
import kg.itschool.airtickets.service.PassengerService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public void register(PassengerDTO passengerDTO) {
        System.out.println("Service");
        passengerRepository.save(passengerMapper.toEntity(passengerDTO));
    }
}
