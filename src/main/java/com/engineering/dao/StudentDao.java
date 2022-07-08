package com.engineering.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.engineering.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>();
        {
            students.put(1, new Student(1, "John", "Java"));
            students.put(2, new Student(2, "Jane", "Java"));
            students.put(3, new Student(3, "Jack", "Java"));
            students.put(4, new Student(4, "Jill", "Java"));
        }
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public void deleteStudent(int id) {
        students.remove(id);
    }

    public void updateStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
