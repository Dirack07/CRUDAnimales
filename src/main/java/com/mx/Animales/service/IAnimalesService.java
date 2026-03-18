package com.mx.Animales.service;

import java.util.List;

import com.mx.Animales.dominio.Animales;

public interface IAnimalesService {

	Animales guardar(Animales a);
	Animales editar(Animales a);
	Animales buscar(int id);
	void eliminar(int id);
	List<Animales> listar();
	
}
