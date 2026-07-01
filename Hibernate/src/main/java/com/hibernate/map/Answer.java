package com.hibernate.map;

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
	private int ansId;
	private String answer;
	@OneToOne
	@JoinColumn(name="quesId") 
	Question ques;
}
