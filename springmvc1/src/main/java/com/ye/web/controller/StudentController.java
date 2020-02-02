package com.ye.web.controller;

import com.ye.utils.ResultBean;
import com.ye.domain.Student;
import com.ye.service.StudentService;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("listStudent")
    public ResultBean listStudent() {
        List<Student> students = studentService.listStudent();
        return ResultBean.Ok(students);
    }
}
