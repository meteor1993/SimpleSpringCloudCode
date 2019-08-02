package com.springcloud.book.ch5_3_hystrix_exception.service;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Date: 2019/8/2 13:43
 * @Version: 1.0
 * @Desc:
 */
@Component
public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            if (response.status() >= 400 && response.status() <= 499) {
                String error = Util.toString(response.body().asReader());
                return new HystrixBadRequestException(error);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FeignException.errorStatus(methodKey, response);
    }
}
