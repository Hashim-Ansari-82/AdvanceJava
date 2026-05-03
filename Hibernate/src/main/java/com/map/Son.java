package com.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Son {

	@Id
	private int Son_Id;
	private String Son_Name;
	@ManyToOne
	@JoinColumn(name="Father_ID")
	Father father;
}
