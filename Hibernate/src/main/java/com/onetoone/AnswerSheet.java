package com.onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AnswerSheet {

	@Id
	@Column(name = "AnswerId")
	private int AnsId;
	private String Answer;
	@OneToOne
	@JoinColumn(name = "questionNo")
	private QuestionSheet qs;
	public AnswerSheet(int ansId, String answer, QuestionSheet qs) {
		super();
		AnsId = ansId;
		Answer = answer;
		this.qs = qs;
	}
	public AnswerSheet() {
		super();
	}
	public int getAnsId() {
		return AnsId;
	}
	public void setAnsId(int ansId) {
		AnsId = ansId;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public QuestionSheet getQs() {
		return qs;
	}
	public void setQs(QuestionSheet qs) {
		this.qs = qs;
	}
	
}
