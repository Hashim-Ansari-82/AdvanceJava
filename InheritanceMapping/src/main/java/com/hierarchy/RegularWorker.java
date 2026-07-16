package com.hierarchy;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RegularWorker extends Worker{

	private Double salary;
	private Integer addtionalBenefits;
}
