package com.embadable;

import jakarta.persistence.*;

@Embeddable
public class Certificate {

	private int certiNo;
	private String certiName;
	private String course;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(int certiNo, String certiName, String course) {
		super();
		this.certiNo = certiNo;
		this.certiName = certiName;
		this.course = course;
	}
	public int getCertiNo() {
		return certiNo;
	}
	public void setCertiNo(int certiNo) {
		this.certiNo = certiNo;
	}
	public String getCertiName() {
		return certiName;
	}
	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
