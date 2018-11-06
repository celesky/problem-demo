package com.problem.smsservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @desc: a restfull interface
 * @author: chrispan
 * @date: 2018/11/6
 */
@RestController
@RequestMapping("/sms")
@Slf4j
public class SmsController {


    /**
     * @param
     * @return
     */
    @GetMapping("/send")
    public String simulateSend() {
        try {
            Thread.sleep(600000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "OK";
    }
}
