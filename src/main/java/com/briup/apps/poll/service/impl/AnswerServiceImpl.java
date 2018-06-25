package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Answer;
import com.briup.apps.poll.dao.AnswerMapper;
import com.briup.apps.poll.service.IAnswerService;

@Service

public class AnswerServiceImpl implements IAnswerService{
	@Autowired
	private AnswerMapper answerMapper;
	
	@Override
	public List<Answer> findAll() throws Exception{
		return answerMapper.findAll();
	}
	
	@Override
	public void deleteById(long id) throws Exception{
		answerMapper.deleteById(id);
	}
	
	@Override
	public void save(Answer answer) throws Exception{
		answerMapper.save(answer);
	}
	
	@Override
	public void update(Answer answer) throws Exception{
		answerMapper.update(answer);
	}
 
}
