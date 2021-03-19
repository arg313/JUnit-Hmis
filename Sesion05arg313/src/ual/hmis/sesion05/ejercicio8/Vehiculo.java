package ual.hmis.sesion05.ejercicio8;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private double peso;
	
	public Vehiculo(int numPasajeros, int numRuedas, double peso) {
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
}
