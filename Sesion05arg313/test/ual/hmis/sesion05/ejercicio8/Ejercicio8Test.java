package ual.hmis.sesion05.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Ejercicio8Test {

	@Test
	void test() {
		
		int maxPasajeros = 10, pesoMaxVehiculos = 4, maxVehiculos = 2, numPasajeros = 3, numVehiculos = 3, pesoVehiculos = 0;
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		Vehiculo v1 = new Vehiculo(5,4,2);
		Vehiculo v2 = new Vehiculo(5,4,2);
		Vehiculo v3 = new Vehiculo(5,4,2);
		
		Ferry f = new Ferry(maxPasajeros,pesoMaxVehiculos,maxVehiculos,numPasajeros,numVehiculos,pesoVehiculos,vehiculos);
		
		boolean vacio1 = f.vacio();  //El ferry esta vacio
		assertTrue(vacio1 == true);
		
		f.embarcarVehiculo(v1);
		
		boolean vacio2 = f.vacio(); //El ferry no esta vacio
		assertTrue(vacio2 == false);
		
		int totalV = f.totalVehiculos(); //El ferry tiene 1 vehiculo
		assertTrue(totalV == 1);
		
		f.embarcarVehiculo(v2);
		boolean maxSuperado1 = f.superadoMaximoVehiculos(); //No se ha superado el numero maximo
		assertTrue(maxSuperado1 == false);
		boolean pesoSuperado1 = f.superadoMaximoPeso(); //No se ha superado el peso maximo
		assertTrue(pesoSuperado1 == false);
		
		f.embarcarVehiculo(v3);
		
		boolean maxSuperado2 = f.superadoMaximoVehiculos(); //Se ha superado el numero maximo
		assertTrue(maxSuperado2 == true);
		boolean pesoSuperado2 = f.superadoMaximoPeso(); //Se ha superado el peso maximo
		assertTrue(pesoSuperado2 == true);
	}

}
