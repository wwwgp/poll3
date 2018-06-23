package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.School;

public interface ISchoolService {
	List<School> findAll() throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void save(School school) throws Exception;
	
	void update(School school) throws Exception;

}
