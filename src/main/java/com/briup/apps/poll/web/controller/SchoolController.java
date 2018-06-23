package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.service.ISchoolService;

@RestController
@RequestMapping("/school")

public class SchoolController {
	@Autowired
	private ISchoolService schoolService;
	@GetMapping("findAllSchool")
	public List<School> findAllSchool(){
		List<School> list=new ArrayList<>();
		try {
			list = schoolService.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}
	
	@PostMapping("deleteSchoolById")
	public String deleteById(long id){
		try {
			schoolService.deleteById(id);
			return "删除成功";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	@PostMapping("saveSchool")
	public String save(School school){
		try {
			schoolService.save(school);
			return "保存成功";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	@PostMapping("updateSchool")
	public String update(School school){
		try {
			schoolService.update(school);
			return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
