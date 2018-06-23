package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * pojo类是java中最简单的类，这种类也被称为模型类，用于对应数据库中的表
 *1.私有的属性
 *2.公共的setter方法和getter方法
 *3.属性的数据类型应该是引用数据类型（int Integer）
 *4.实现序列号接口
 **/

@ApiModel(value="课程类")
public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="课程编号")
	private Long id;
	@ApiModelProperty(value="课程名称")
	private String name;
	@ApiModelProperty(value="课程描述")
	private String description;
	@ApiModelProperty(value="课程周期")
	private Integer period;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
}
