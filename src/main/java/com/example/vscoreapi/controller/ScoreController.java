package com.example.vscoreapi.controller;

import com.example.vscoreapi.mapper.ScoreMapper;
import com.example.vscoreapi.model.FraudScoreDetectionRequest;
import com.example.vscoreapi.model.FraudScoreDetectionResponse;
import com.example.vscoreapi.service.ScoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.vscoreapi.constant.RestPathContants.ROOT_SCORE_PATH;

@RestController
@RequestMapping(ROOT_SCORE_PATH)
@RequiredArgsConstructor
@Slf4j
public class ScoreController {

    private final ScoreService scoreService;

    private final ScoreMapper scoreMapper;


    @GetMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
    public FraudScoreDetectionResponse getScore(@RequestBody FraudScoreDetectionRequest request) throws Exception {
        return scoreMapper.dtoToResponse(scoreService.checkScore(scoreMapper.requestToDto(request)));
    }
}
