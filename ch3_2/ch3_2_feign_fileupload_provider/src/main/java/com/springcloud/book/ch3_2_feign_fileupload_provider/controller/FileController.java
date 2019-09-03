package com.springcloud.book.ch3_2_feign_fileupload_provider.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by daixueyun on 2019/8/7 0007.
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @RequestMapping(value = "/uploadfile", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart(value = "file")MultipartFile file){

        String orgFileName = file.getOriginalFilename();

        //后缀
        String suffix = orgFileName.substring(orgFileName.lastIndexOf("."));

        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        File dest = new File("D:/aaa/"+uuid+suffix);

        try {
            file.transferTo(dest);
            //文件绝对路径
            return dest.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "failure";
    }
}
