package com.example.vscoreapi.mapper;


import com.example.vscoreapi.mapper.base.BaseRequestMapper;
import com.example.vscoreapi.mapper.base.BaseResponseMapper;
import com.example.vscoreapi.model.FraudScoreDetectionRequest;
import com.example.vscoreapi.model.FraudScoreDetectionResponse;
import com.example.vscoreapi.model.PhoneScoreDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring" ,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ScoreMapper extends BaseRequestMapper<PhoneScoreDto, FraudScoreDetectionRequest>, BaseResponseMapper<PhoneScoreDto, FraudScoreDetectionResponse> {
    @Mapping(target = "phone.phone", source = "value" )
    PhoneScoreDto requestToDto(FraudScoreDetectionRequest request);
}
