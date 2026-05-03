package com.map;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Father {

	@Id
	 private int Father_Id;
	private String Father_Name;
	@OneToMany(mappedBy = "father",fetch = FetchType.EAGER)
	private List<Son> son;
}
