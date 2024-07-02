package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Student;
import com.dao.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studRepo;
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studRepo.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> data=studRepo.findAll();
		for(Student stu:data) {
			System.out.println(stu);
		}
		return data;
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		studRepo.deleteById(id);
		
		return id+" Record Deleted";
	}

	@Override
	public Student updateStud(Student student, int id) {
		// TODO Auto-generated method stub
		Student exstud=studRepo.findById(id).orElse(null);
		
		if(exstud!=null) {
			exstud.setName(student.getName());
			exstud.setCity(student.getCity());
		}
		
		return studRepo.save(exstud);
	}
	
	

	
}
