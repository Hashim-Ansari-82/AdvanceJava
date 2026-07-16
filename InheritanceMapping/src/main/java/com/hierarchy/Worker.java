package com.hierarchy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Worker {

	@Id
	private Integer workerId;
	private String workerName;
}
