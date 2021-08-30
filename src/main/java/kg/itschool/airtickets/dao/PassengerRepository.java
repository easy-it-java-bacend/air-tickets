package kg.itschool.airtickets.dao;

import kg.itschool.airtickets.entity.Passenger;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository {

    void save(Passenger passenger);
    void getAllPassengers();
    void deletePassenger(Long id);
    void updatePassenger(Passenger passenger);
}