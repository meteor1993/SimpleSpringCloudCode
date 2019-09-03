package com.springcloud.book.ch3_2_feign_fileupload_client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by daixueyun on 2019/8/7 0007.
 */
@FeignClient(name = "spring-cloud-feign-fileupload-provider", url = "http://localhost:9000")
public interface UploadService {

    @RequestMapping(value = "/file/uploadfile", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uplodFile(@RequestPart(value = "file")MultipartFile file);
}
