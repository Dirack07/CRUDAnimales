package com.mx.Animales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Animales.dominio.Animales;
import com.mx.Animales.service.AnimalesService;

@RestController
@RequestMapping("api/Animales")
public class AnimalesWS {
	
	@Autowired
	private AnimalesService service;
	
	@GetMapping("listar")
	public List<Animales> listar(){
		return service.listar();
	}
	
	@PostMapping("guardar")
	public Animales guardar(@RequestBody Animales a) {
		return service.guardar(a);
	}
	
	@GetMapping("buscar/{id}")
	public Animales buscar(@PathVariable int id) {
		return service.buscar(id);
	}
	
	@PutMapping("editar")
	public Animales edittar(@RequestBody Animales a) {
		return service.editar(a);
	}
	
	@DeleteMapping("eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}
	
}
