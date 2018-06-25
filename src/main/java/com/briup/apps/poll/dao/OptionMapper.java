package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Option;

public interface OptionMapper {
	List<Option> findAll();
	void deleteById(long id);
	void save(Option option);
	void update(Option option);

}
