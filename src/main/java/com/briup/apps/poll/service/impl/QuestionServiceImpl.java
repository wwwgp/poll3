package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.dao.QuestionMapper;
import com.briup.apps.poll.service.IQuestionService;

@Service
public class QuestionServiceImpl  implements IQuestionService{
	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public List<Question> findAll() throws Exception{
		return questionMapper.findAll();
	} 
	
	@Override
	public void deleteById(long id) throws Exception{
		questionMapper.deleteById(id);
	}
	
	@Override
	public void save(Question question) throws Exception{
		questionMapper.save(question);
	}
	
	@Override
	public void update(Question question) throws Exception{
		questionMapper.update(question);
	}

}
