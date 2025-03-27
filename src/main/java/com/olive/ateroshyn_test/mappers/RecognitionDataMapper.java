package com.olive.ateroshyn_test.mappers;

import com.olive.ateroshyn_test.services.dto.RawRecognitionDataDto;
import com.olive.ateroshyn_test.web.requests.RecognitionDataRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RecognitionDataMapper {

    @Mapping(source = "geoLocation.lat", target = "lat")
    @Mapping(source = "geoLocation.lon", target = "lon")
    RawRecognitionDataDto toDto(RecognitionDataRequest request);
}