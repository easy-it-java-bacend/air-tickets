package kg.itschool.airtickets.mapper;

import kg.itschool.airtickets.entity.Passenger;

import java.util.List;

public interface BaseMapper<ENTITY, DTO> {

    ENTITY toEntity(DTO dto);
    DTO toDTO(ENTITY entity);
    List<ENTITY> toEntityList(List<DTO> dtoList);
    List<DTO> toDTOList(List<ENTITY> entityList);

}
