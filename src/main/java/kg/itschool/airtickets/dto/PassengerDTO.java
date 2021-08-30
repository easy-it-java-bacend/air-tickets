package kg.itschool.airtickets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class PassengerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String passport;
    private String phoneNumber;
    private String email;
    private String password;

}
