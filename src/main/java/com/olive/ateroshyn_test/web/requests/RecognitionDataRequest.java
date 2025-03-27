package com.olive.ateroshyn_test.web.requests;

import com.olive.ateroshyn_test.services.dto.GeoLocationDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecognitionDataRequest {
    private String timestamp;
    private String source;
    private String uniqueId;
    private GeoLocationDto geoLocation;
    private String type;
    private double confidence;
}
