package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.service.ISurveyService;

import io.swagger.annotations.Api;

@Api(description="调查接口")
@RestController
@RequestMapping("/survey")

public class SurveyController {
	@Autowired
	private ISurveyService surveyService;
	
	@GetMapping("findAllSurvey")
	public List<Survey> findAllSurvey(){
		List<Survey> list=new ArrayList<>();
		try {
			 list=surveyService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping("deleteSurveyById")
	public String deleteSurveyById(long id){
		try {
			 surveyService.deleteById(id);
			 return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@PostMapping("saveSurvey")
	public String saveSurvey(Survey survey){
		try {
			 surveyService.save(survey);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@PostMapping("updateSurvey")
	public String updateSurvey(Survey survey){
		try {
			 surveyService.update(survey);
			 return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
