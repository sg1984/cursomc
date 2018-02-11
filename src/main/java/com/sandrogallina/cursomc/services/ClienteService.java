package com.sandrogallina.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandrogallina.cursomc.domain.Cliente;
import com.sandrogallina.cursomc.repositories.ClienteRepository;
import com.sandrogallina.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id){
		Cliente obj = repo.findOne(id);
		
		if( obj == null ) {
			throw new ObjectNotFoundException("Objecto não encontrado! Id: " + id 
					+ ", Tipo: " + Cliente.class.getName()
			);
		}
		
		return obj;
		
	}

}
