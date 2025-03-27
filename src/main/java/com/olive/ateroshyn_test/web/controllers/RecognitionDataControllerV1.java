package com.olive.ateroshyn_test.web.controllers;

import com.olive.ateroshyn_test.services.RecognitionDataServiceV1;
import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("detection")

public class RecognitionDataControllerV1 {
    private final RecognitionDataServiceV1 recognitionDataServiceV1;

    @PostMapping("batch")
    public ResponseEntity<Void> batchRecognitionData(@RequestBody List<RecognitionDataRequest> requests) {
        recognitionDataServiceV1.sendBatch(requests);
        return ResponseEntity.ok().build();
    }

}
