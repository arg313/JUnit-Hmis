package ual.hmis.sesion05.ejercicio8;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private double peso;

	public Vehiculo(final int numPasajeros,
			final int numRuedas, final double peso) {
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
		this.peso = peso;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
