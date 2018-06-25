package com.briup.apps.poll.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Survey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("调查编号")
	private long id;
	@ApiModelProperty("调查状态")
	private String status;
	@ApiModelProperty("调查编号")
	private String code;
	@ApiModelProperty("调查日期")
	private String surveyDate;
	@ApiModelProperty("课程编号")
	private String course_id;
	@ApiModelProperty("班级编号")
	private String clazz_id;
	@ApiModelProperty("用户编号")
	private String user_id;
	@ApiModelProperty("问卷编号")
	private String questionnaire_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(String clazz_id) {
		this.clazz_id = clazz_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(String questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	
	

}
