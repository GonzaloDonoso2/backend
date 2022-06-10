package com.valposystems.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valposystems.repositorios.RepositorioUsuario;
import com.valposystems.modelos.Usuario;

@Service
public class ServiciosImplementadosUsuario implements ServiciosUsuario  {
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;

	@Override
	public List<Usuario> listarUsuarios() {
		
		return repositorioUsuario.findAll();
	}

	@Override
	public Usuario listarUsuario(Long id) {
		
		return repositorioUsuario.findById(id);
	}

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		
		return repositorioUsuario.save(usuario);
	}

	@Override
	public Usuario corregirUsuario(Usuario usuario) {

		return repositorioUsuario.save(usuario);
	}

	@Override
	public Usuario borrarUsuario(Long id) {

		Usuario usuario = repositorioUsuario.findById(id);
		
		if (usuario != null) {
			
			repositorioUsuario.delete(usuario);				
		}
		
		return usuario;
	}

}
