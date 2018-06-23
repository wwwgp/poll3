package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.User;

@Service
public interface IUserService {
	List<User> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(User user) throws Exception;
	void update(User user) throws Exception;

}
