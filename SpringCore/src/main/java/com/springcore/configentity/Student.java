package com.springcore.configentity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("#{'${student.id}'.split(',')}")
    private Set<Integer> id;

    @Value("#{'${student.address}'.split(',')}")
    private List<String> address;

    @Value("#{${student.course}}")
    private Map<String, String> course;

    @Value("#{${Student.property}}")
    private Properties property;

	public void getDetail() {
		System.out.println("Student [id=" + id + "]");
		System.out.println("Student [address=" + address + "]");
		System.out.println("Student [course=" + course + "]");
		System.out.println("Student [property=" + property + "]");
	}

}