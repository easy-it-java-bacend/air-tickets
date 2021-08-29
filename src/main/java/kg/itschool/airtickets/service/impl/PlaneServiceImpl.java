package kg.itschool.airtickets.service.impl;


import kg.itschool.airtickets.dao.PlaneRepository;
import kg.itschool.airtickets.dto.PlaneDTO;
import kg.itschool.airtickets.entity.Plane;
import kg.itschool.airtickets.service.PlaneService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    @Override
    public void planeAddition(PlaneDTO planeDTO) {
        Plane plane = new Plane();
        plane.setCompany(planeDTO.getCompany());
        plane.setModel(planeDTO.getModel());
        plane.setSeats(planeDTO.getSeats());

        planeRepository.insertPlane(plane);
    }
}
