package com.sandrogallina.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandrogallina.cursomc.domain.Pedido;
import com.sandrogallina.cursomc.repositories.PedidoRepository;
import com.sandrogallina.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id){
		Pedido obj = repo.findOne(id);
		
		if( obj == null ) {
			throw new ObjectNotFoundException("Objecto não encontrado! Id: " + id 
					+ ", Tipo: " + Pedido.class.getName()
			);
		}
		
		return obj;
		
	}

}
