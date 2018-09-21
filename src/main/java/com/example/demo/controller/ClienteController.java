package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.clases.ClienteDao;
import com.example.demo.model.Cliente;

@Service
public class ClienteController {

	@Autowired
	ClienteDao dao;

	public List<Cliente> findAll() {
		try {
			return dao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Cliente findById(Long id) {
		try {
			return dao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void save(Cliente cliente) {
		try {
			dao.save(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Cliente currentCliente) {
		try {
			dao.delete(currentCliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Cliente update(Long id, Cliente clienteM) {
		Cliente cliente = null;
		try {
			cliente = dao.findById(id);
			cliente.setApellido(clienteM.getApellido());
			cliente.setNombre(clienteM.getNombre());
			cliente.setEmail(clienteM.getEmail());
			dao.save(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cliente;
	}

}
