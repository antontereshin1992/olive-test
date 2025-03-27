package com.olive.ateroshyn_test.web.controllers.api;

import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("detection")
public interface RecognitionDataApiV1 {

    @PostMapping("batch")
    ResponseEntity<Void> batchRecognitionData(@RequestBody List<RecognitionDataRequest> requests);

}
