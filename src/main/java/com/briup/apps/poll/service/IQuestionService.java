package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Questionnaire;

@Service
public interface IQuestionService {
	List<Questionnaire> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Questionnaire questionnaire) throws Exception;
	void update(Questionnaire questionnaire) throws Exception;

}
