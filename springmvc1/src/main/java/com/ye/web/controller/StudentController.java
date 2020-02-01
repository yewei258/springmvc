package com.ye.web.controller;

import com.ye.utils.ResultBean;
import com.ye.web.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("listStudent")
    public ResultBean listStudent() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.setId("1");
        s1.setName("yw");
        s1.setAge(30);

        list.add(s1);

        Student s2 = new Student();
        s2.setId("2");
        s2.setName("stq");
        s2.setAge(25);
        list.add(s2);

        return ResultBean.Ok(list);
    }
}
