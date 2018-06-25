package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Answer;

@Service

public interface IAnswerService {
	List<Answer> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Answer answer) throws Exception;
	void update(Answer answer) throws Exception;

}
