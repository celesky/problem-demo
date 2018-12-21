package com.problem.smsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @desc:
 * @author: celesky
 * @date: 2018-12-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestDto {
    private String content;
}
