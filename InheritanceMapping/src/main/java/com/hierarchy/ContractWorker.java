package com.hierarchy;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ContractWorker extends Worker{

	private float pricePerHour;
	private String contractPeriod;
}
