package com.valposystems.controladores;

import com.valposystems.modelos.Usuario;
import com.valposystems.servicios.ServiciosUsuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
@RequestMapping(path = "/backend")
@CrossOrigin("*")
public class ControladorUsuario {
	
	@Autowired
	ServiciosUsuario serviciosUsuario;
 
	@GetMapping(path = "/listar")
	public List<Usuario> listarUsuarios() {
	  
		return serviciosUsuario.listarUsuarios();      
	}
  
	@PostMapping(path = "/registrar")
	public Usuario registrarUsuario(@RequestBody Usuario usuario) {
	  
		return serviciosUsuario.registrarUsuario(usuario);	  
	}
	
	@GetMapping(path = "/listar/{id}")
	public Usuario listarUsuario(@PathVariable("id") Long id) {
	  
		return serviciosUsuario.listarUsuario(id); 
	}
	
	@PutMapping(path = "/corregir/{id}")
	public Usuario corregirUsuario(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
	  
		usuario.setId(id);
		return serviciosUsuario.corregirUsuario(usuario);  
	}
	
	@DeleteMapping(path = "/borrar/{id}")
	public Usuario borrarUsuario(@PathVariable("id") Long id) {
		
		return serviciosUsuario.borrarUsuario(id);
	};	
}
