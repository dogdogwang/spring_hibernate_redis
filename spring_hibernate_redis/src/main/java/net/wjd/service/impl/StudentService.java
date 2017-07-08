package net.wjd.service.impl;

import javax.annotation.Resource;

import net.wjd.dao.IBaseDao;
import net.wjd.dao.impl.StudentDao;
import net.wjd.model.Student;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class StudentService extends BaseServiceImpl<Student, String> {
	
	 @Resource(type=StudentDao.class)
	 private IBaseDao<Student, String> dao;
	 
	 public String save(Student entity){
		return dao.save(entity);
	 }
	 
	 

}
