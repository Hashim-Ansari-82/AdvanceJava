package com.test;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Certificate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialId;
	private int certiNo;
	private String certiName;
	private String course;
	private String studentName;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] image;
	public Certificate() {
		super();
		
	}

	public Certificate(int serialId, int certiNo, String certiName, String course, String studentName, Date date,
			byte[] image) {
		super();
		this.serialId = serialId;
		this.certiNo = certiNo;
		this.certiName = certiName;
		this.course = course;
		this.studentName = studentName;
		this.date = date;
		this.image = image;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getSerialId() {
		return serialId;
	}

	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}
	
	
}
