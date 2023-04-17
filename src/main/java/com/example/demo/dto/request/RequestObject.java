package com.example.demo.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

@JsonDeserialize
@Getter
@Setter
@RedisHash("request")
public class RequestObject {
    private String userIsdn;
}
