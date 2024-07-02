package com.Service;

import java.util.List;


import com.Model.Student;

public interface StudentService {

	public Student addStudent(Student student);
	List<Student> getStudents();
	String deleteStudent(int id);
	Student updateStud(Student student,int id);
}
