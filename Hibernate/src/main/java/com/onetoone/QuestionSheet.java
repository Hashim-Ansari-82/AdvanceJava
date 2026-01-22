package com.onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
 
@Entity
public class QuestionSheet {

	@Id
	@Column(name = "QuestionId")
	private int quesNo;
	private String question; 
    @OneToOne(mappedBy = "qs",fetch = FetchType.EAGER)
    @JoinColumn(name = "AnswerNo")
	private AnswerSheet as;
	
	public QuestionSheet(int quesNo, String question, AnswerSheet as) {
		super();
		this.quesNo = quesNo;
		this.question = question;
		this.as = as;
	}

	public QuestionSheet() {
		super(); 
	}

	public int getQuesNo() {
		return quesNo;
	}

	public void setQuesNo(int quesNo) {
		this.quesNo = quesNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public AnswerSheet getAs() {
		return as;
	}

	public void setAs(AnswerSheet as) {
		this.as = as;
	}
	
}
