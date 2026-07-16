package com.mapping.models;

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
public class Model {
	
	@Id
	private Integer model_id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "manfacture_id")
	private Manufactures manufacturs;

}
