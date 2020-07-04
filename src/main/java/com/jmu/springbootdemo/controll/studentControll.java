package com.jmu.springbootdemo.controll;

import com.jmu.springbootdemo.dao.studentMapper;
import com.jmu.springbootdemo.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class studentControll {
    @Autowired
    private studentMapper stu;

    @RequestMapping("/index")
    public String login() {
        return "index";
    }


}
