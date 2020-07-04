package com.jmu.springbootdemo.entity;

import javax.persistence.*;

//使用jpa注解配置映射关系
@Entity//告诉jpa这是一个实体类（和数据表映射的类）
//@Table(name="")//制定和哪个数据表对应，如果默认则是类名小写
public class student {
    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private int id;
    private String name;
    private int age;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
