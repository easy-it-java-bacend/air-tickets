package kg.itschool.airtickets.dao;

import kg.itschool.airtickets.entity.Plane;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository {

    void insertPlane(Plane plane);
}
