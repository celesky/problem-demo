package com.problem.clientservice.controller;

import com.problem.clientservice.remote.RawRemote;
import com.problem.clientservice.remote.SendRemote;
import com.problem.clientservice.util.PerformUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * @desc:
 * @author: panqiong
 * @date: 2018/11/6
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    SendRemote sendRemote;

    @Autowired
    RawRemote rawRemote;

    /**
     * @param
     * @return
     */
    @GetMapping("/send")
    public String simulateSend() {
        long start = Instant.now().toEpochMilli();
        try{
            sendRemote.send();
        }catch (Exception e){
            log.error(e.getMessage());
        }
        long end = Instant.now().toEpochMilli();
        PerformUtil.logTime("sendRemote",start,end);

        return "OK";
    }
    /**
     * @param
     * @return
     */
    @GetMapping("/rawsend")
    public String rawsend() {
        long start = Instant.now().toEpochMilli();
        try{
            rawRemote.send();
        }catch (Exception e){
            log.error(e.getMessage());
        }
        long end = Instant.now().toEpochMilli();
        PerformUtil.logTime("rawRemote",start,end);

        return "OK";
    }


}
