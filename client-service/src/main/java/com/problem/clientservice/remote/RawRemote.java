package com.problem.clientservice.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc:
 * @author: panqiong
 * @date: 2018/11/6
 */
@FeignClient(value = "sms-service")
public interface SendRemote {

    @RequestMapping("/sms/send")
    String send();
}
