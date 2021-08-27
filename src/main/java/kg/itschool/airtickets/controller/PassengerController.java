package kg.itschool.airtickets.controller;

import kg.itschool.airtickets.dto.PassengerDTO;
import kg.itschool.airtickets.service.PassengerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

@Controller
@RequestMapping("/api/v1/passenger")
@RequiredArgsConstructor
public class PassengerController {

    // Where is @Autowired?
    private final PassengerService passengerService;

    //https://loalhost:8081/api/v1/passenger/main
    @RequestMapping("/main")
    public String getMainMenu() {
        return "main";
    }

    @RequestMapping("/register")
    public String registerPassenger() {
        return "register";
    }

    @RequestMapping("/confiramtion-page")
    public String confirmRegistration(HttpServletRequest request, Model model) {
        PassengerDTO passengerDTO = new PassengerDTO();

        passengerDTO.setEmail(request.getParameter("email"));
        passengerDTO.setPassword(request.getParameter("password"));

        model.addAttribute("email", passengerDTO.getEmail());
        model.addAttribute("password", passengerDTO.getPassword());

        passengerService.register(passengerDTO);

        return "confirmation";
    }
}
