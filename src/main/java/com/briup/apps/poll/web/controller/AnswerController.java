package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Answer;
import com.briup.apps.poll.service.IAnswerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api(description="答案接口")
@RestController
@RequestMapping("/answer")

public class AnswerController {
	@Autowired
	private IAnswerService answerService;
	
	@ApiModelProperty("查询所有答案")
	@GetMapping("findAllAnswer")
	public List<Answer> findAllAnswer(){
		List<Answer> list=new ArrayList<>();
		try {
			 list=answerService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@ApiModelProperty("删除答案信息")
	@GetMapping("deleteAnswerById")
	public String deleteAnswerById(long id){
		try {
			 answerService.deleteById(id);
			 return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@ApiModelProperty("保存答案信息")
	@PostMapping("saveAnswer")
	public String saveAnswer(Answer answer){
		try {
			 answerService.save(answer);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@ApiModelProperty("更新答案信息")
	@PostMapping("updateAnswer")
	public String updateAnswer(Answer answer){
		try {
			answerService.update(answer);
			return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
