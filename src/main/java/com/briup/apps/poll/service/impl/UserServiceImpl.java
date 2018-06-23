package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.User;
import com.briup.apps.poll.dao.UserMapper;
import com.briup.apps.poll.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() throws Exception{
		return userMapper.findAll();
	}
	
	@Override
	public void deleteById(long id) throws Exception{
		userMapper.deleteById(id);
	}
	
	@Override
	public void save(User user) throws Exception{
		userMapper.save(user);
	}
	
	@Override
	public void update(User user) throws Exception{
		userMapper.update(user);
	}

}
