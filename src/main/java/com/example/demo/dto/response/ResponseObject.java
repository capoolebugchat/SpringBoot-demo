package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
@AllArgsConstructor
@Getter
@Setter
public class ResponseObject {
    private String userIsdn;
    private String userRecommendation;
}
