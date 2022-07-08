package com.engineering.service;
import com.engineering.entity.Student;
import com.engineering.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class studentService {
    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }
    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void deleteStudent(int id) {
        this.studentDao.deleteStudent(id);
    }

    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
