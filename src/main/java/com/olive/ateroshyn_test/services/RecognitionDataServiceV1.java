package com.olive.ateroshyn_test.services;

import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;

import java.util.List;

public interface RecognitionDataServiceV1 {
    void sendBatch(List<RecognitionDataRequest> requests);
}
