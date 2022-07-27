package com.example.vscoreapi.mapper.base;

import java.util.List;

public interface BaseResponseMapper<D,R> {
    D responseToDto(R response);
    R dtoToResponse(D dto);
    List<R> dtosToResponses(List<D> dtos);
    List<D> responsesToDtos(List<R> responses);
}
