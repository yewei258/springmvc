package com.ye.web.controller;

import com.ye.service.OrderService;
import com.ye.service.impl.OrderDTO;
import com.ye.utils.ResultBean;
import com.ye.domain.Student;
import com.ye.service.StudentService;
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


    @Autowired
    private OrderService orderService;

    @GetMapping("listStudent")
    public ResultBean listStudent() {
        List<Student> students = studentService.listStudent();

        OrderDTO dto = new OrderDTO();
        dto.setOrderType("3");
        dto.setCode("code....");

        String s = orderService.handle(dto);
        System.out.println(s);

        return ResultBean.Ok(students);
    }
}
