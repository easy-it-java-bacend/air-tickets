package kg.itschool.airtickets.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "passengers")
@NoArgsConstructor
@Data
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String gender;

    @Column
    private String phoneNumber;

    @Column
    private Date dateOfBirth;

    @Column
    private String userName;

    @Column
    private String userRole;

    @Column
    private String passportDetails;
}
