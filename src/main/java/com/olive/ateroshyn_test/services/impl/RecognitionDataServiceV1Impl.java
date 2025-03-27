package com.olive.ateroshyn_test.services.impl;

import com.olive.ateroshyn_test.services.RecognitionDataServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class RecognitionDataServiceV1Impl implements RecognitionDataServiceV1 {

    public static final String TOPIC = "recognitions";
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public CompletableFuture<SendResult<String, Object>> sendRecognitionData() {
        return kafkaTemplate.send(TOPIC, UUID.randomUUID().toString(), Map.of("test", "value111"));
    }

}
