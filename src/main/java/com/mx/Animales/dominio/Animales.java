package com.mx.Animales.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ANIMALES_DB")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Animales {	
	
	@Id
	private int id;
	private String tipo;
	private String nombre;
	private int edad;
}
