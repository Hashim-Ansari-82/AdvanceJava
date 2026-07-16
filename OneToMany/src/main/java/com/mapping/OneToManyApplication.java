package com.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapping.models.Manufactures;
import com.mapping.models.Model;
import com.mapping.repository.ManufacturesRepo;
import com.mapping.repository.ModelRepo;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{

	@Autowired
	private ManufacturesRepo manufacturesRepo;
	
	@Autowired
	private ModelRepo modelRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Manufactures manufactures = new Manufactures("Honda");
		manufacturesRepo.save(manufactures);
		
		Model model1 = new Model(12,"AYZ",manufactures);
		Model model2 = new Model(23,"ZET",manufactures);
		Model model3 = new Model(54,"SYA",manufactures);
		
		modelRepo.save(model1);
		modelRepo.save(model2);
		modelRepo.save(model3);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
		System.err.println("Program Run Successfully");
	}

}
