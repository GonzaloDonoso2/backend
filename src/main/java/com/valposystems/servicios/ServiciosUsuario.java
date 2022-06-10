package com.valposystems.servicios;

import java.util.List;

import com.valposystems.modelos.Usuario;

public interface ServiciosUsuario {	

	List<Usuario>listarUsuarios();
	Usuario listarUsuario(Long id);
	Usuario registrarUsuario(Usuario usuario);
	Usuario corregirUsuario(Usuario usurio);
	Usuario borrarUsuario(Long id);
}
