package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Qq;

@Service

public interface IQqService {
	List<Qq> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Qq qq) throws Exception;
	void update(Qq qq) throws Exception;

}
