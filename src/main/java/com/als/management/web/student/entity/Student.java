package com.als.management.web.student.entity;


import com.als.management.base.BaseEntity;
import lombok.Data;

/**
 * @author ljj
 * @description 学生信息类
 * @date 2020-12-07
 */
@Data
public class Student extends BaseEntity {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄 暂时不要，没有用处
     */
//    private Integer age;

    /**
     * 学校
     */
    private String school;

    /**
     * 年级
     */
    private String grade;

    /**
     * 性别
     */
    private Integer gender;
}
