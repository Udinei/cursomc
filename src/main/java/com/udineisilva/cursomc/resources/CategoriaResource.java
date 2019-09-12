package com.udineisilva.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udineisilva.cursomc.domain.Categoria;
import com.udineisilva.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	CategoriaService categoriaService;
	
	
	//@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@GetMapping(value="/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		Categoria obj = categoriaService.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
