package com.springcloud.book.ch3_2_feign_filedownload_client.controller;

import com.springcloud.book.ch3_2_feign_filedownload_client.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by daixueyun on 2019/8/7 0007.
 */
@RestController
@RequestMapping(value = "/download")
public class DownloadController {

    @Autowired
    private DownloadService downloadService;

    @ResponseBody
    @RequestMapping("/file")
    public Object file() {
        ResponseEntity<byte[]> entity = downloadService.downloadFile();
        return entity;
    }
}
