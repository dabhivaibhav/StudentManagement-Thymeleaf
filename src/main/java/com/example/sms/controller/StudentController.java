package com.example.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sms.Model.Student;
import com.example.sms.service.StudentService;

@Controller
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// List all the students
	@GetMapping
	public String listStudents(Model model) {
		List<Student> studentlist = studentService.getAllStudents();
		model.addAttribute("studentlist", studentlist);
		return "students";
	}

	@GetMapping("/create")
	public String addStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "studentadd";
	}

	@PostMapping("/add")
	public String addStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/edit/{id}")
	public String createStudentForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("student", studentService.getStudentByID(id));
		return "edit_student";
	}

	@PostMapping("{id}")
	public String updateStudent(@PathVariable("id") Long id, @ModelAttribute("Student") Student student, Model model) {

		Student existingStudent = studentService.getStudentByID(id);
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}

	@GetMapping("{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}

}
