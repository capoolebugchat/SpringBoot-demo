package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.dto.request.RequestObject;
import com.example.demo.dto.response.ResponseObject;
import com.example.demo.entities.UserRec;
import com.example.demo.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    private static Logger LOGGER = LoggerFactory.getLogger(WebController.class);
    @Autowired
    WebService webService;
    @PostMapping("/simpleQuery")
    public ResponseObject singleUserQuery(@RequestBody RequestObject request){
        LOGGER.debug(request.toString());
        String userIsdn = request.getUserIsdn();
        String recommendation =  webService.simpleQuery(new UserRec(request.getUserIsdn(), ""));
        if(recommendation==null){
            LOGGER.error("Not found key");
            LOGGER.error(request.toString());
            recommendation="This mf is not in our db, see some John Wick dawg its fun.";
        }
        return new ResponseObject(userIsdn, recommendation);
    }
}