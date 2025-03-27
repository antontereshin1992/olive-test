package com.olive.ateroshyn_test.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawRecognitionDataDto {
    public String timestamp;
    public String source;
    public String uniqueId;
    public double confidence;
    public String type;
    public double lat;
    public double lon;
}
