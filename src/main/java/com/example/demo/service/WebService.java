package com.example.demo.service;

import com.example.demo.entities.UserRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class WebService {
    @Autowired
    RedisTemplate<String, String> redisTemplate;
    ValueOperations<String, String> valueOperations;
    @PostConstruct
    private void init(){
        this.valueOperations=this.redisTemplate.opsForValue();
    }
    public String simpleQuery(UserRec userRec){
        System.out.println(userRec.getUserIsdn());
        System.out.println(userRec.getUserIsdn().getClass());
        System.out.println(this.valueOperations.get(userRec.getUserIsdn()));
        return this.valueOperations.get(userRec.getUserIsdn());
    }
}
