package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.models.Model;

public interface ModelRepo extends JpaRepository<Model, Integer>{

}
