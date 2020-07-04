package com.jmu.springbootdemo.service.impl;

import com.jmu.springbootdemo.dao.studentMapper;
import com.jmu.springbootdemo.entity.student;
import com.jmu.springbootdemo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    private studentMapper stumap;

    @Override
    public student findByid(int id) {
        return stumap.findByid(id);
    }
}
