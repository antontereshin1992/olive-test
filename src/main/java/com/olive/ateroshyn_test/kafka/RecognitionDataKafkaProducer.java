package com.olive.ateroshyn_test.kafka;

import com.olive.ateroshyn_test.services.dto.RawRecognitionDataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class RecognitionDataKafkaProducer {

    public static final String TOPIC = "recognitions";
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public CompletableFuture<SendResult<String, Object>> sendRecognitionData(RawRecognitionDataDto dto) {
        return kafkaTemplate.send(TOPIC, dto.getUniqueId(), dto);
    }

}