package com.briup.apps.poll.dao;

import java.util.List;

import com.briup.apps.poll.bean.Course;

public interface CourseMapper {
	/**
	 * 查询所有课程
	**/
	List<Course> findAll();
	/**
	 * 通过id删除课程信息
	 **/
	void deleteById(long id);
	 /**
	  * 保存课程信息
	  */
	void save(Course course);
	/**
	 * 更新课程信息
	 */
	void update(Course course);
}
