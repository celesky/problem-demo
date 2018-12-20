package com.problem.clientservice.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc:
 * @author: panqiong
 * @date: 2018/11/6
 */
@FeignClient(name="raw-service",url="http://www.baidu.com:8080/")
public interface RawRemote {

    @GetMapping(value = "/sms/send",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String send();
}
