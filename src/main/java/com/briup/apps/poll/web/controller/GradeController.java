package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.service.IGradeService;

@RestController
@RequestMapping("/grade")

public class GradeController {
	@Autowired
	private IGradeService gradeService;
	@GetMapping("findAllGrade")
	public List<Grade> findAllGrade(){
		List<Grade> list=new ArrayList<>();
		try {
			list=gradeService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@PostMapping("deleteGradeById")
	public String deleteById(long id){
		try {
			gradeService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@PostMapping("saveGrade")
	public String save(Grade grade){
		try {
			gradeService.save(grade);
			return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@PostMapping("updateGrade")
	public String update(Grade grade){
		try {
			gradeService.update(grade);
			return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
