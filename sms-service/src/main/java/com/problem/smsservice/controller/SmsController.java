package com.problem.smsservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * @desc: a restfull interface
 * @author: chrispan
 * @date: 2018/11/6
 */
@RestController
@RequestMapping("/sms")
@Slf4j
public class SmsController {


    @Value("{server.port}")
    private String instanceId;

    /**
     * @param
     * @return
     */
    @GetMapping("/send")
    public String simulateSend() {
        System.out.println("接收到请求......"+instanceId);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map map = new HashMap<>();
        map.put("resultCode","0");
        map.put("resultMessage","success");
        ObjectMapper mapper = new ObjectMapper();
        String jsonlist = null;
        try {
            jsonlist = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonlist;
    }

    /**
     * @param
     * @return
     */
    @PostMapping("/send")
    public String postsend() {
        System.out.println("接收到请求......"+instanceId);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map map = new HashMap<>();
        map.put("resultCode","0");
        map.put("resultMessage","success");
        ObjectMapper mapper = new ObjectMapper();
        String jsonlist = null;
        try {
            jsonlist = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonlist;
    }
}
