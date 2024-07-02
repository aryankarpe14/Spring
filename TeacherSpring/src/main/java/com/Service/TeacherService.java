package com.Service;

import java.util.List;

import com.Model.Teacher;

public interface TeacherService {

	Teacher addTeacher(Teacher teacher);
	List<Teacher> getTeacher();
	String deleteTeacher(int id);
	Teacher updateTeacher(Teacher teacher,int id);
	
}
