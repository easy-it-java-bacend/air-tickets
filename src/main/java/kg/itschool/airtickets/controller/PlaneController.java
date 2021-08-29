package kg.itschool.airtickets.controller;


import kg.itschool.airtickets.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/plane")
@RequiredArgsConstructor
public class PlaneController {

    private final PlaneService planeService;

    @RequestMapping("/main")
    public String getMainmenu(){return "main";}

    @RequestMapping("/plane_addition")
    public String planeAddition(){return "plane_addition";}
}
