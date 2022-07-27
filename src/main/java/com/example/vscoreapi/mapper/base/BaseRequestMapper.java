package com.example.vscoreapi.mapper.base;

import java.util.List;

public interface BaseRequestMapper<D,R> {
    D requestToDto(R request);
    R dtoToRequest(D dto);
    List<D> requestsToDtos(List<R> requests);
    List<R> dtosToRequests(List<D> dtos);
}
