package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.TeacherRepository;
import com.Model.Teacher;
@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherRepository tearep;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return tearep.save(teacher);
	}

	@Override
	public List<Teacher> getTeacher() {
		// TODO Auto-generated method stub
		return tearep.findAll();
	}

	@Override
	public String deleteTeacher(int id) {
		// TODO Auto-generated method stub
		tearep.deleteById(id);
		return id+" Record Deleted";
	}

	@Override
	public Teacher updateTeacher(Teacher teacher, int id) {
		// TODO Auto-generated method stub
		Teacher exteacher=tearep.findById(id).orElse(null);
		exteacher.setTname(teacher.getTname());
		exteacher.setSalary(teacher.getSalary());
		return tearep.save(exteacher);
	}

	
}
