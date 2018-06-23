package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.dao.QuestionnaireMapper;
import com.briup.apps.poll.service.IQuestionService;

@Service
public class QuestionnaireServiceImpl implements IQuestionService{
	@Autowired
	private QuestionnaireMapper  questionnaireMapper;
	
	@Override
	public List<Questionnaire> findAll() throws Exception{
		return questionnaireMapper.findAll();
	}
	
	@Override
	public void deleteById(long id) throws Exception{
		questionnaireMapper.deleteById(id);
	}
	
	 @Override
	 public void save(Questionnaire questionnaire) throws Exception{
		 questionnaireMapper.save(questionnaire);
	 }
	 
	 @Override
	 public void update(Questionnaire questionnaire) throws Exception{
		 questionnaireMapper.update(questionnaire);
	 }	

}
