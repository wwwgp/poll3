package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Answer;

public interface AnswerMapper {
	List<Answer> findAll();
	void deleteById(long id);
	void save(Answer answer);
	void update(Answer answer);

}
