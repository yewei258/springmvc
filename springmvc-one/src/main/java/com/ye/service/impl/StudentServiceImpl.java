package com.ye.service.impl;

import com.ye.domain.Student;
import com.ye.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> listStudent() {
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

        return list;
    }
}
