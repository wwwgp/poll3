package com.briup.apps.poll.bean;

import java.io.Serializable;

public class Qq implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private long questionnaire_id;
	private long question_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(long questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(long question_id) {
		this.question_id = question_id;
	}
	

}
