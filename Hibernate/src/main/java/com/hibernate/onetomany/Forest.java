package com.hibernate.onetomany;

import java.util.List;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Forest {
 
	@Id
	private int id;
	@Column(name = "Forest_Name")
	private String forestName;
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "forest")
	@BatchSize(size = 3)
	private List<Animal> animals;
}
