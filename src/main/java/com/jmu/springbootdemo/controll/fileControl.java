package com.jmu.springbootdemo.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class fileControl {
    @GetMapping(value = "/file")
    public String file() {
        return "file";
    }

    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file1") MultipartFile file1, @RequestParam(value = "file2") MultipartFile file2, @RequestParam(value = "file3") MultipartFile file3, Model model, HttpServletRequest request) {
        if (file1.isEmpty()) {
            System.out.println("文件1为空空");
        }
        String fileName1 = file1.getOriginalFilename();  // 文件名
        String suffixName1 = fileName1.substring(fileName1.lastIndexOf("."));  // 后缀名
        String filePath = "D://temp-rainy//"; // 上传后的路径
        // String filePath = "/root/temp-rainy/"; // 上传后的路径
        fileName1 = UUID.randomUUID() + suffixName1; // 新文件名
        File dest1 = new File(filePath + fileName1);
        if (!dest1.getParentFile().exists()) {
            dest1.getParentFile().mkdirs();
        }
        try {
            file1.transferTo(dest1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename1 = "/temp-rainy/" + fileName1;
        // String filename1 = "/temp-rainy/" + fileName1;
        model.addAttribute("filename1", filename1);

        if (file2.isEmpty()) {
            System.out.println("文件2为空空");
        }
        String fileName2 = file2.getOriginalFilename();  // 文件名
        String suffixName2 = fileName2.substring(fileName2.lastIndexOf("."));  // 后缀名
        // String filePath = "D://temp-rainy//"; // 上传后的路径
        fileName2 = UUID.randomUUID() + suffixName2; // 新文件名
        File dest2 = new File(filePath + fileName2);
        if (!dest2.getParentFile().exists()) {
            dest2.getParentFile().mkdirs();
        }
        try {
            file2.transferTo(dest2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename2 = "/temp-rainy/" + fileName2;
        // String filename2 = "/temp-rainy/" + fileName2;
        model.addAttribute("filename2", filename2);


        if (file3.isEmpty()) {
            System.out.println("文件1为空空");
        }
        String fileName3 = file3.getOriginalFilename();  // 文件名
        String suffixName3 = fileName3.substring(fileName3.lastIndexOf("."));  // 后缀名
        // String filePath = "/root/temp-rainy/"; // 上传后的路径
        fileName3 = UUID.randomUUID() + suffixName3; // 新文件名
        File dest3 = new File(filePath + fileName3);
        if (!dest3.getParentFile().exists()) {
            dest3.getParentFile().mkdirs();
        }
        try {
            file3.transferTo(dest3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename3 = "/temp-rainy/" + fileName3;
        // String filename1 = "/temp-rainy/" + fileName1;
        model.addAttribute("filename3", filename3);

        return "file";
    }

}
