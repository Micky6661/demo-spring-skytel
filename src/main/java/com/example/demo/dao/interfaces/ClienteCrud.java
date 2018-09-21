package com.example.demo.dao.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Cliente;

public interface ClienteCrud extends CrudRepository<Cliente, Long> {
	
}
