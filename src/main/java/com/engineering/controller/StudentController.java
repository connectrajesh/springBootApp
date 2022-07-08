package com.engineering.controller;

import com.engineering.entity.Student;
import com.engineering.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private studentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
