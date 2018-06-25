package com.briup.apps.poll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Option;

@Service

public interface IOptionService {
	List<Option> findAll() throws Exception;
	void deleteById(long id) throws Exception;
	void save(Option option) throws Exception;
	void update(Option option) throws Exception;

}
