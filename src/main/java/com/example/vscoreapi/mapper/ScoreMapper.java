package com.example.vscoreapi.mapper;


import com.example.vscoreapi.mapper.base.BaseRequestMapper;
import com.example.vscoreapi.mapper.base.BaseResponseMapper;
import com.example.vscoreapi.model.FraudScoreDetectionDto;
import com.example.vscoreapi.model.FraudScoreDetectionRequest;
import com.example.vscoreapi.model.FraudScoreDetectionResponse;
import com.example.vscoreapi.model.telesign.TelesignScoreDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring" ,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ScoreMapper extends BaseRequestMapper<FraudScoreDetectionDto, FraudScoreDetectionRequest>, BaseResponseMapper<TelesignScoreDto, FraudScoreDetectionResponse> {

    @Mapping(target = "request_uuid", source = "uuid" )
    @Mapping(target = "type", source = "phone_type.description" )
    @Mapping(target = "phone.carrier", source = "carrier.name" )
    @Mapping(target = "phone.type", source = "phone_type.code" )
    @Mapping(target = "fraud_score.label", source = "risk.level" )
    @Mapping(target = "fraud_score.risk_recommendation", source = "risk.recommendation" )
    @Mapping(target = "phone.phone", source = "numbering.original.complete_phone_number" )
    @Mapping(target = "fraud_score.risk_score",qualifiedByName = "scoreToRiskScore", source = "risk.score" )
    FraudScoreDetectionResponse dtoToResponse(TelesignScoreDto dto);

    @Named("scoreToRiskScore")
     default String  scoreToRiskScore(Long score) {
        return ""+(score / 10);
    }
}
