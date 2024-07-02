package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Student;
import com.Service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studSer;
	
	@PostMapping("/addStud")
	public Student addStudent(@RequestBody Student student) {
		return studSer.addStudent(student);
	}
	
	@GetMapping("/getList")
	public List<Student> getList(){
		return studSer.getStudents();
	}
	
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteStud(@PathVariable int id) {
		return studSer.deleteStudent(id);
	}
	
	@PutMapping("/updateStud/{id}")
	public Student updateStud(@RequestBody Student student,@PathVariable int id) {
		return studSer.updateStud(student, id);
	}
}
