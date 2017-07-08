package net.wjd.controller;

import javax.annotation.Resource;

import net.wjd.model.Student;
import net.wjd.service.IBaseService;
import net.wjd.service.impl.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Resource(type=StudentService.class)
	private IBaseService<Student, String> stuService;
	
	@RequestMapping("/save")
	public void save(){
		Student zhangsan = new Student();
		zhangsan.setName("zhangsan");
		
		stuService.save(zhangsan);
		
	}
	
	

}
