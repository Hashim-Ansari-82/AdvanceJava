package com.mapping.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Manufactures {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String manfecture_name;
	
	@OneToMany(mappedBy = "manufacturs",cascade = CascadeType.ALL)
	private List<Model> models;

	public Manufactures(String manfecture_name) {
		super();
		this.manfecture_name = manfecture_name;
	}
	
}
