package kg.itschool.airtickets.service;


import kg.itschool.airtickets.dto.PlaneDTO;
import org.springframework.stereotype.Service;

@Service
public interface PlaneService {
    void planeAddition(PlaneDTO planeDTO);
}
