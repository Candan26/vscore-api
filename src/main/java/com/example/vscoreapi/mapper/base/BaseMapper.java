package com.example.vscoreapi.mapper.base;

import java.util.List;

public interface BaseMapper<E,D> {
    D entityToDto(E entity);
    E dtoToEntity(D dto);
    List<E>entitiesToDtos(List<D> dtos);
    List<D>dtosToEntities(List<E> entities);
}
