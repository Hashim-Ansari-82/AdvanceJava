package com.hiber.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class District {

	private Integer district_Code;
	@Id
	private String district_Name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="district_village",
	joinColumns = @JoinColumn(name="district_id"),
	inverseJoinColumns = @JoinColumn(name="village_id")
			)
	private List<Village> village;
}
