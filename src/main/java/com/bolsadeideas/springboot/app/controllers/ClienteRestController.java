package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.dao.IClienteDao;
import com.bolsadeideas.springboot.app.models.entity.Cliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {
	
	@Autowired
	private IClienteDao clienteDao;
	
	
	/**
	 * Listado de clientes JSON
	 * @param model
	 * @return List<Clientes>
	 */
	
	@GetMapping(value="/listar")
	public List<Cliente> listarRest() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	

}
