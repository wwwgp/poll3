package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.dao.SurveyMapper;
import com.briup.apps.poll.service.ISurveyService;
@Service
public class SurveyServiceImpl implements ISurveyService{
	@Autowired
	private SurveyMapper surveyMapper;
	
	@Override
	public List<Survey> findAll() throws Exception{
		return surveyMapper.findAll();
	}
	
	@Override
	public void deleteById(long id) throws Exception{
		surveyMapper.deleteById(id);
	}
	
	@Override
	public void save(Survey survey) throws Exception{
		surveyMapper.save(survey);
	} 
	
	@Override
	public void update(Survey survey) throws Exception{
		surveyMapper.update(survey);
	}

}
