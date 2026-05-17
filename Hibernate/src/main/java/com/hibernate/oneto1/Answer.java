package com.hibernate.oneto1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {

	@Id
	@Column(name = "Answer_ID")
	private int ansId;
	@Column(name = "Answer")
	private String answer;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Question_Id")
	private Question question;
}
