package com.example.sms.service;

import java.util.List;
import com.example.sms.Model.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentByID(Long id);

	Student updateStudent(Student student);

	String deleteStudent(Long id);
}
