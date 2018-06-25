package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.dao.OptionMapper;
import com.briup.apps.poll.service.IOptionService;

@Service
public class OptionServiceImpl implements IOptionService{
	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public List<Option> findAll() throws Exception{
		return optionMapper.findAll();
	}
	
	@Override
	public void deleteById(long id) throws Exception{
		optionMapper.deleteById(id);
	}
	
	@Override
	public void save(Option option ) throws Exception{
		optionMapper.save(option);
	}
	
	@Override
	public void update(Option option) throws Exception{
		optionMapper.update(option);
	}

}
