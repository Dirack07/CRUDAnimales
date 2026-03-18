package com.mx.Animales.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Animales.dominio.Animales;

@Repository
public interface IAnimalesDao extends JpaRepository<Animales, Integer>{
	
	/*
	 * Estos metodos pertenecen a Spring Data JPA. Son query methods que generan
	 * una consulta automatica directamente la bd a partir del nombre del metodo
	 */
	
	//SELECT * FROM ANIMALES WHERE NOMBRE = nombre;
	Animales findByNombreIgnoreCase(String nombre);
	
	//SELECT * FROM ANIMALES WHERE TIPO = tipo;
	List<Animales> findByTipoIgnoreCase(String tipo);
	
	
}
