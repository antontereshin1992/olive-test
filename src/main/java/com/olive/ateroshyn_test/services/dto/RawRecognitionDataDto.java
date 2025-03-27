package com.olive.ateroshyn_test.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawRecognitionDataDto {
    private String timestamp;
    private String source;
    private String uniqueId;
    private double confidence;
    private String type;
    private double lat;
    private double lon;
}
