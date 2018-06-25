package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.service.IQuestionnaireService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api(description="问卷接口")
@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService questionService;
	
	@ApiModelProperty("保存问卷信息")
	@GetMapping("findAllQuestionnaire")
	public List<Questionnaire> findAllQuestionnaire(){
		List<Questionnaire> list=new ArrayList<>();
		try {
			 list=questionService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@ApiModelProperty("删除问卷信息")
	@GetMapping("deleteQuestionnaireById")
	public String deleteQuestionnaireById(long id){
		try {
			 questionService.deleteById(id);
			 return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@ApiModelProperty("保存问卷信息")
	@PostMapping("saveQuestionnaire")
	public String saveQuestionnaire(Questionnaire questionnaire){
		try {
			 questionService.save(questionnaire);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@ApiModelProperty("更新问卷信息")
	@PostMapping("updateQuestionnaire")
	public String updateQuestionnaire(Questionnaire questionnaire){
		try {
			 questionService.update(questionnaire);
			 return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}


}
