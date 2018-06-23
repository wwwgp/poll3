package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Clazz;

@Service

public interface IClazzService {
	List<Clazz> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Clazz clazz) throws Exception;
	void update(Clazz clazz)throws Exception;

}
