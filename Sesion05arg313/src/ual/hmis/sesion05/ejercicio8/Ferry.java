package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {

	private int maxPasajeros;
	private int pesoMaxVehiculos;
	private int maxVehiculos;
	private int numPasajeros;
	private int numVehiculos;
	private int pesoVehiculos;
	private ArrayList<Vehiculo> vehiculos;

	public Ferry(final int maxPasajeros, final int pesoMaxVehiculos,
			final int maxVehiculos, final int numPasajeros,
			final int numVehiculos, final int pesoVehiculos) {
		this.maxPasajeros = maxPasajeros;
		this.pesoMaxVehiculos = pesoMaxVehiculos;
		this.maxVehiculos = maxVehiculos;
		this.numPasajeros = numPasajeros;
		this.pesoVehiculos = pesoVehiculos;
		this.vehiculos = new ArrayList<Vehiculo>();
	}

	boolean embarcarVehiculo(final Vehiculo vehiculo) {
		boolean res = vehiculos.add(vehiculo);
		numVehiculos = vehiculos.size();
		return res;
	}

	int totalVehiculos() {
		return numVehiculos;
	}

	boolean vacio() {
		if (vehiculos.isEmpty()) {
			return true;
		}
		return false;
	}

	boolean superadoMaximoVehiculos() {
		if (numVehiculos > maxVehiculos) {
			return true;
		}
		return false;
	}

	boolean superadoMaximoPeso() {
		double pesoTotal = 0.0;
		for (int i = 0; i < vehiculos.size(); i++) {
			pesoTotal += vehiculos.get(i).getPeso();
		}
		if (pesoTotal > pesoMaxVehiculos) {
			return true;
		}
		return false;
	}

	public int getMaxPasajeros() {
		return maxPasajeros;
	}

	public void setMaxPasajeros(final int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}

	public int getPesoMaxVehiculos() {
		return pesoMaxVehiculos;
	}

	public void setPesoMaxVehiculos(final int pesoMaxVehiculos) {
		this.pesoMaxVehiculos = pesoMaxVehiculos;
	}

	public int getMaxVehiculos() {
		return maxVehiculos;
	}

	public void setMaxVehiculos(final int maxVehiculos) {
		this.maxVehiculos = maxVehiculos;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(final int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getNumVehiculos() {
		return numVehiculos;
	}

	public void setNumVehiculos(final int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}

	public int getPesoVehiculos() {
		return pesoVehiculos;
	}

	public void setPesoVehiculos(final int pesoVehiculos) {
		this.pesoVehiculos = pesoVehiculos;
	}

	public void setVehiculos(final ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return this.vehiculos;
	}
}
