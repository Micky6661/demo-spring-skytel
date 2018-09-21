package com.example.demo.dao.interfaces;

import java.util.List;

import com.example.demo.model.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();

	public void save(Cliente cliente);

	public Cliente findById(Long id);

	public void delete(Cliente cliente);
}
