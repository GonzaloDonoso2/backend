package com.valposystems.repositorios;

import com.valposystems.modelos.Usuario;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface RepositorioUsuario extends Repository<Usuario, Long> {
	
	List<Usuario>findAll();
	Usuario findById(Long id);
	Usuario save(Usuario usuario);
	void delete(Usuario usuario);	
}