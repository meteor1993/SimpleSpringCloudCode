package com.springcloud.book.ch3_2_feign_filedownload_client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by daixueyun on 2019/8/7 0007.
 */
@FeignClient(name = "spring-cloud-feign-filedownload-provider", url = "http://localhost:9000")
public interface DownloadService {

    @RequestMapping(value = "/file/download")
    ResponseEntity<byte[]> downloadFile();
}
