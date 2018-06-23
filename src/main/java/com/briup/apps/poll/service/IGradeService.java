package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Grade;
@Service

public interface IGradeService {
	List<Grade> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Grade grade) throws Exception;
	void update(Grade grade) throws Exception;

}
