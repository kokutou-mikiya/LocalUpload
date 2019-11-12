package com.demo.cn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author: ZPT
 * @Description:    文件上传
 * @Date: 2019-11-12 15:40
 **/
@RestController
public class UploadController {

    @PostMapping("upload")
    public String fileUpload(MultipartFile file){
        //获取文件名
        String fileName = file.getOriginalFilename();
        System.out.println("原始文件名："+fileName);
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        System.out.println("文件后缀："+suffixName);
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;

// 一、指定本地文件夹存储-----地址固定
//        String filePath = "C:/Users/77952/桌面/上传文件存放/";

        // 二、存放上传图片的文件夹-----动态路径
        File fileDir = CreatePath.getImgDirFile();
        // 输出文件夹绝对路径
        System.out.println("fileDir="+fileDir);
        System.out.println("绝对路径"+fileDir.getAbsolutePath());

        // 构建真实的文件路径     File.separator 分隔符
        File realPath = new File(fileDir.getAbsolutePath() + File.separator + fileName);
        System.out.println(realPath.getAbsolutePath());

        try {
//            //将图片保存到本地文件夹里
//            file.transferTo(new File(filePath+fileName));

            // 上传图片到 -》 “绝对路径”
            file.transferTo(realPath);
            return "success upload";

        } catch (IOException e) {
            e.printStackTrace();
            return "fail upload";
        }
    }
}
