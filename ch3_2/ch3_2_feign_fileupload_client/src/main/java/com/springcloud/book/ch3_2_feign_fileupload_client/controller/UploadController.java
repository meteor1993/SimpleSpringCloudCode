package com.springcloud.book.ch3_2_feign_fileupload_client.controller;

import com.springcloud.book.ch3_2_feign_fileupload_client.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by daixueyun on 2019/8/7 0007.
 */
@RestController
@RequestMapping(value = "/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/file")
    public Object uploadFile(@RequestPart(value = "file")MultipartFile file){
        return uploadService.uplodFile(file);
    }
}
