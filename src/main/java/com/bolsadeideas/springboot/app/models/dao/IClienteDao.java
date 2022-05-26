package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.bolsadeideas.springboot.app.models.entity.Cliente;



/**
 * El primer parametro es el modelo al que le vamos a implementar el crud
 * el segundo parametro es el del id 
 */


public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

	/**
	 * Listar todos los clientes
	 * @return
	 */
	//public List<Cliente> findAll();
	
	/**
	 * Guardar un cliente
	 * @param cliente
	 */
	//public void save(Cliente cliente);
	
	/**
	 * Edicion de un cliente
	 * @param id
	 * @return
	 */
	//public Cliente findOne(Long id);
	

	
	/**
	 * Delete a client
	 * @param id
	 */
	//public void delete(Long id);
	
	

}
