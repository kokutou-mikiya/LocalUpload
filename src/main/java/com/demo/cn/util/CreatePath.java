package com.demo.cn.util;

import java.io.File;

/**
 * @Author: ZPT
 * @Description:    构建路径
 * @Date: 2019-11-12 16:32
 **/
public class CreatePath {

    // 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认）
    public final static String PATH_PREFIX = "static/upload/";

    public static File getImgDirFile(){

        // 构建上传文件的存放 "文件夹" 路径
        String fileDirPath = new String("src/main/resources/" + PATH_PREFIX);

        File fileDir = new File(fileDirPath);
        if(!fileDir.exists()){
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }
}
