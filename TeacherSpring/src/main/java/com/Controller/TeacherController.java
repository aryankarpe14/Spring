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

import com.Model.Teacher;
import com.Service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService teaser;
	
	@PostMapping("/addTeacher")
	public Teacher add(@RequestBody Teacher teacher) {
		return teaser.addTeacher(teacher);
	}
	
	@GetMapping("/getList")
	public List<Teacher> getTeacher(){
		return teaser.getTeacher();
	}
	
	@PutMapping("/update/{id}")
	public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable int id) {
		return teaser.updateTeacher(teacher, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTeacher(@PathVariable int id) {
		return teaser.deleteTeacher(id);
	}
}
