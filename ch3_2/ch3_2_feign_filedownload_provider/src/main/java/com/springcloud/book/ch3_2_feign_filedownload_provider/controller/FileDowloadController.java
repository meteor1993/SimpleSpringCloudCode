package com.springcloud.book.ch3_2_feign_filedownload_provider.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URLEncoder;

/**
 * Created by daixueyun on 2019/8/7 0007.
 */
@RestController
@RequestMapping(value = "/file")
public class FileDowloadController {

    @RequestMapping(value = "/download")
    public ResponseEntity<byte[]> downloadFile(String fileType, HttpServletRequest request){

        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<byte[]> entity = null;
        InputStream in = null;

        try {
            in = new FileInputStream(new File("d:/aaa/001.png"));
            byte[] bytes = new byte[in.available()];
            String imageName = "001.png";

            //处理IE下载文件的中文名称乱码问题
            String header = request.getHeader("User-Agent").toUpperCase();
            if(header.contains("MSIE") || header.contains("TRIDENT") || header.contains("EDGE")){
                imageName = URLEncoder.encode(imageName, "utf-8");
                imageName = imageName.replace("+", "%20");    //IE下载文件名空格变+号问题
            }else{
                imageName = new String(imageName.getBytes(), "iso-8859-1");
            }

            in.read(bytes);
            headers.add("Content-Disposition", "attachment;filename="+imageName);
            entity = new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in!=null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return entity;
    }
}
