package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.dao.SchoolMapper;
import com.briup.apps.poll.service.ISchoolService;

@Service

public class SchoolServiceImpl implements ISchoolService {
	@Autowired
	private SchoolMapper schoolMapper;
	
	@Override
	public List<School> findAll() throws Exception{
		return schoolMapper.findAll();
	}
	@Override
	public void deleteById(long id) throws Exception{
		schoolMapper.deleteById(id);
	}
	@Override
	public void save(School school) throws Exception{
		schoolMapper.save(school);
	}
	@Override
	public void update(School school) throws Exception{
		schoolMapper.update(school);
	}
	
}
