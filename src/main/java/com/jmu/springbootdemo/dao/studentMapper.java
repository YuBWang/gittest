package com.jmu.springbootdemo.dao;

import com.jmu.springbootdemo.entity.student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper

public interface studentMapper {
    public student findByid(@PathVariable("id") int id);

}
