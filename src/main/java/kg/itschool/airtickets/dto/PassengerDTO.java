package kg.itschool.airtickets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PassengerDTO {

    private Long id;
    private String email;
    private String password;

}
