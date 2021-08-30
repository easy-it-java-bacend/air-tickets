package kg.itschool.airtickets.mapper;

import kg.itschool.airtickets.dto.PassengerDTO;
import kg.itschool.airtickets.entity.Passenger;
import org.springframework.stereotype.Component;

@Component
public interface PassengerMapper extends BaseMapper<Passenger, PassengerDTO>{
}
