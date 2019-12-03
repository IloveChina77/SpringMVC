package com.zr.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadFileController {

    @RequestMapping("/uploadFile")
    public String uploadFile( MultipartFile file, HttpServletRequest request) throws IOException {
        System.err.println("文件上传.....");
        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.err.println(path);
        // 判断，该路径是否存在
        File file1 = new File(path);
        if(!file1.exists()) {
            // 创建该文件夹
            file1.mkdirs();
        }

        // 说明上传文件项
        // 获取上传文件的名称
        String fileName =  file.getOriginalFilename();
        // 把文件的名称设置唯一值，uuid
        String uuid =  UUID.randomUUID().toString().replace("-","");
        fileName = uuid + "_" + fileName;
        // 完成文件上传
        file.transferTo(new File(path, fileName));
        return "uploadSuccess";
    }
}
