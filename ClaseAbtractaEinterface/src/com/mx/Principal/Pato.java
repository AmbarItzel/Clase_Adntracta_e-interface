package com.mx.Principal;

import com.mx.Abstractra.Animal;
import com.mx.Interface.IMetodos;

public class Pato extends Animal implements IMetodos{

	public Pato(String nombre) {
		super(nombre);
	}

	@Override
	public void volar() {
		System.out.println(nombre + " esta volando");
		
	}

	@Override
	public void nadar() {
		System.out.println(nombre + " esta nadando");		
	}

	@Override
	public void jugar() {
		System.err.println(nombre + " esta jugando");
		
	}
}
