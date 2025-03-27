package com.olive.ateroshyn_test.web.controllers;

import com.olive.ateroshyn_test.services.RecognitionDataServiceV1;
import com.olive.ateroshyn_test.web.controllers.api.RecognitionDataApiV1;
import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class RecognitionDataControllerV1 implements RecognitionDataApiV1 {
    private final RecognitionDataServiceV1 recognitionDataServiceV1;

    @Override
    public ResponseEntity<Void> batchRecognitionData(@RequestBody List<RecognitionDataRequest> requests) {
        recognitionDataServiceV1.sendBatch(requests);
        return ResponseEntity.ok().build();
    }

}
