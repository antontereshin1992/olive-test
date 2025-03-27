package com.olive.ateroshyn_test.services.impl;

import com.olive.ateroshyn_test.kafka.RecognitionDataKafkaProducer;
import com.olive.ateroshyn_test.services.RecognitionDataServiceV1;
import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecognitionDataServiceV1Impl implements RecognitionDataServiceV1 {

    private final RecognitionDataKafkaProducer recognitionDataKafkaProducer;

    @Override
    public void sendBatch(List<RecognitionDataRequest> requests) {
        System.out.println(requests.size());
    }
}
