package kg.itschool.airtickets.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "planes")
@NoArgsConstructor
@Data
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long Id;

    @Column
    private String company;

    @Column
    private String model;

    @Column
    private int seats;
}
