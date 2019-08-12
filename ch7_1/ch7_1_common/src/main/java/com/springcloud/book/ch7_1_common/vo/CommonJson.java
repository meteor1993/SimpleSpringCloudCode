package com.springcloud.book.ch7_1_common.vo;

import lombok.Data;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/12
 * @Time: 22:11
 * @email: inwsy@hotmail.com
 * Description:
 */
@Data
public class CommonJson {
    private String resultCode;
    private Map<String, Object> resultData;
    private String resultMsg;
}
