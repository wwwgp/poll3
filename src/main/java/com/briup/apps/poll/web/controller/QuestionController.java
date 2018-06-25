package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.service.IQuestionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api(description="问题接口")
@RestController
@RequestMapping("/question")

public class QuestionController {
	@Autowired
	
	private IQuestionService questionService;
	
	@ApiModelProperty("查询所有问题信息")
	@GetMapping("findAllQuestion")
	public List<Question> findAllQuestion(){
		List<Question> list=new ArrayList<>();
		try {
			 list=questionService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@ApiModelProperty("删除问题信息")
	@GetMapping("deleteQuestionById")
	public String deleteQuestionById(long id){
		try {
			 questionService.deleteById(id);
			 return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@ApiModelProperty("保存问题信息")
	@PostMapping("saveQuestion")
	public String saveQuestion(Question question){
		try {
			 questionService.save(question);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@ApiModelProperty("更新问题信息")
	@PostMapping("updateQuestion")
	public String updateQuestion(Question question){
		try {
			 questionService.update(question);
			 return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
