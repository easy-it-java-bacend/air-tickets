package kg.itschool.airtickets.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PlaneDTO {

    private long Id;
    private String company;
    private String model;
    private int seats;

}
