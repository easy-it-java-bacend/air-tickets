package kg.itschool.airtickets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class PassengerDTO {
    //Refactor //Controller
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String passportDetails;
    private Date dateOfBirth;
    private String userName;
    private String userRole;
}
