package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.service.ICourseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(description="课程相关接口")
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	@ApiOperation(value="保存课程信息",notes="保存课程信息的时候无需输入id")
	@PostMapping("saveCourse")
	public String save(Course course){
		try {
			courseService.save(course);
			return ("保存成功");
			
		} catch (Exception e) {
		
		e.printStackTrace();
			// TODO: handle exception
			return "保存失败"+e.getMessage();
		}
		}
	@ApiOperation("删除课程信息")
	@GetMapping("deleteCourseById")
	public String deleteCourseById(long id){
		//调用service层代码完成对课程信息的删除
		try{
			courseService.deleteById(id);
			return "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			return "删除失败,"+e.getMessage();
		}		
		}
	@ApiOperation("更新课程信息")
	@PostMapping("updateCourse")
	public String update(Course course){
		try {
			courseService.update(course);
			return ("更新成功");
			
		} catch (Exception e) {
		
		e.printStackTrace();
			// TODO: handle exception
			return "更新失败"+e.getMessage();
		}
		}
	@ApiOperation("查询所有课程信息")
	@GetMapping("findAllCourse")
	public List<Course> findAllCourse(){
		List<Course> list=new ArrayList<>();
		try {
			list = courseService.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}
	

}
