package com.sandrogallina.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandrogallina.cursomc.domain.Categoria;
import com.sandrogallina.cursomc.repositories.CategoriaRepository;
import com.sandrogallina.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id){
		Categoria obj = repo.findOne(id);
		
		if( obj == null ) {
			throw new ObjectNotFoundException("Objecto não encontrado! Id: " + id 
					+ ", Tipo: " + Categoria.class.getName()
			);
		}
		
		return obj;
		
	}

}
