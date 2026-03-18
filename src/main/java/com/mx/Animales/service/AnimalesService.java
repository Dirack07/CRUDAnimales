package com.mx.Animales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Animales.dao.IAnimalesDao;
import com.mx.Animales.dominio.Animales;

@Service
public class AnimalesService implements IAnimalesService{

	@Autowired
	private IAnimalesDao dao;
	
	@Override
	public Animales guardar(Animales a) {
		return dao.save(a);
	}

	@Override
	public Animales editar(Animales a) {
		return dao.save(a);
	}

	@Override
	public Animales buscar(int id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Animales> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
	
	public Animales buscarPorNombre(String nombre) {
		return dao.findByNombreIgnoreCase(nombre);
	}
	
	public List<Animales> buscarPorTipo(String tipo){
		return dao.findByTipoIgnoreCase(tipo);
	}
	
}
