package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Question;

@Service
public interface IQuestionService {
	List<Question> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Question question) throws Exception;
	void update(Question question) throws Exception;

}
