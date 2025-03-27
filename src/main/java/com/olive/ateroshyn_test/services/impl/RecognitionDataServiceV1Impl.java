package com.olive.ateroshyn_test.services.impl;

import com.olive.ateroshyn_test.kafka.RecognitionDataKafkaProducer;
import com.olive.ateroshyn_test.mappers.RecognitionDataMapper;
import com.olive.ateroshyn_test.services.RecognitionDataServiceV1;
import com.olive.ateroshyn_test.services.dto.RawRecognitionDataDto;
import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecognitionDataServiceV1Impl implements RecognitionDataServiceV1 {

    private final RecognitionDataKafkaProducer recognitionDataKafkaProducer;
    private final RecognitionDataMapper recognitionDataMapper;

    @Override
    public void sendBatch(List<RecognitionDataRequest> requests) {
        log.trace("received recognitionDataRequests.size: {}", requests.size());
        requests.forEach(this::sendRecognitionData);
    }

    private void sendRecognitionData(RecognitionDataRequest detection) {
        RawRecognitionDataDto dto = recognitionDataMapper.toDto(detection);

        recognitionDataKafkaProducer.sendRecognitionData(dto);
    }
}
