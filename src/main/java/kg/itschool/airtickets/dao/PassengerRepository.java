package kg.itschool.airtickets.dao;

import kg.itschool.airtickets.entity.Passenger;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository {

    void insertPassenger(Passenger passenger);

}