package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.redis.core.RedisHash;

@EntityScan
@RedisHash("userRec")
@Getter
@Setter
@AllArgsConstructor
public class UserRec {
    private String userIsdn;
    private String rec;
}
