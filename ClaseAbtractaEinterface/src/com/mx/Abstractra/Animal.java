package com.mx.Abstractra;

public abstract class Animal {
	
	protected String nombre;

	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodo abstracto 
	public abstract void jugar();
	
	//Metodo concreto, instancia, implementacion
	
	public void dormir() {
		System.out.println(nombre + " esta durmiendo....");
	}

}
