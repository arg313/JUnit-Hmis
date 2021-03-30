package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {

	public int maxPasajeros;
	public int pesoMaxVehiculos;
	public int maxVehiculos;
	public int numPasajeros;
	public int numVehiculos;
	public int pesoVehiculos;
	public ArrayList<Vehiculo> vehiculos;
	
	public Ferry(int maxPasajeros, int pesoMaxVehiculos, int maxVehiculos, int numPasajeros, int numVehiculos, int pesoVehiculos) {
		this.maxPasajeros = maxPasajeros;
		this.pesoMaxVehiculos = pesoMaxVehiculos;
		this.maxVehiculos = maxVehiculos;
		this.numPasajeros = numPasajeros;
		this.pesoVehiculos = pesoVehiculos;
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	boolean embarcarVehiculo (Vehiculo v) {
		boolean res = vehiculos.add(v);
		numVehiculos = vehiculos.size();
		return res; 
	}
	
	int totalVehiculos() {
		return numVehiculos;
	}
	
	boolean vacio() {
		if (vehiculos.isEmpty()) return true;
		else return false;
	}
	
	boolean superadoMaximoVehiculos() {
		if (numVehiculos > maxVehiculos) return true;
		else return false;
	}
	
	boolean superadoMaximoPeso() {
		double pesoTotal = 0.0;
		for (int i = 0;i<vehiculos.size();i++) {
			pesoTotal += vehiculos.get(i).getPeso();
		}
		if (pesoTotal > pesoMaxVehiculos) return true;
		else return false;
	}
	
	public ArrayList<Vehiculo> getVehiculos() {
		return this.vehiculos;
	}
	
}
