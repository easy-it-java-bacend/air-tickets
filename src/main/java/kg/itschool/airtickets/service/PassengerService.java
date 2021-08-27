package kg.itschool.airtickets.service;

import kg.itschool.airtickets.dto.PassengerDTO;
import org.springframework.stereotype.Service;

@Service
public interface PassengerService {

    void register(PassengerDTO passengerDTO);

}
