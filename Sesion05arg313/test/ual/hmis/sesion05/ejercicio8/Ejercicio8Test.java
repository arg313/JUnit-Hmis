package ual.hmis.sesion05.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio8Test {
	
	@ParameterizedTest(name = "{index} => Se embarca {0}")
    @MethodSource("vehiculoProvider")
	void testEmbarcarVehiculo(Vehiculo v1) {
		Ferry f = new Ferry(10, 5000, 3, 5, 4, 0);
		assertTrue(f.embarcarVehiculo(v1));
	}
	
	static Stream<Arguments> vehiculoProvider() {
        return Stream.of(
                Arguments.of(new Vehiculo(5, 4,1000)),
                Arguments.of(new Vehiculo(5, 4,1500)),
                Arguments.of(new Vehiculo(5, 4,2000)));
    }
	
	
	@ParameterizedTest(name = "{index} => El ferry tiene {1} vehiculos")
    @MethodSource("arrayProvider")
	void testTotalVehiculos(ArrayList<Vehiculo> a, int expected) {
		Ferry f = new Ferry(10, 5000, 3, 5, 4, 0);
		for (int i = 0;i<a.size();i++) f.embarcarVehiculo(a.get(i));
		assertEquals(expected, f.totalVehiculos());
	}
	
	static Stream<Arguments> arrayProvider() {
		ArrayList<Vehiculo> a1 = new ArrayList<Vehiculo>();
		ArrayList<Vehiculo> a2 = new ArrayList<Vehiculo>();
		Vehiculo v1 = new Vehiculo (5,4,1000);
		Vehiculo v2 = new Vehiculo (5,4,1000);
		a1.add(v1);
		a2.add(v1);
		a2.add(v2);
        return Stream.of(
                Arguments.of(a1,1),
                Arguments.of(a2,2));
    }
	
	@ParameterizedTest(name = "{index} => El ferry esta vacio: {1}")
    @MethodSource("vacioProvider")
	void testVacio(Ferry f, boolean expected) {
		assertEquals(expected, f.vacio());
	}
	
	static Stream<Arguments> vacioProvider() {
		Ferry vacio = new Ferry(10, 5000, 3, 5, 4, 0);
		Ferry lleno = new Ferry(10, 5000, 3, 5, 4, 0);
		Vehiculo v1 = new Vehiculo (5,4,1000);
		lleno.embarcarVehiculo(v1);
        return Stream.of(
                Arguments.of(vacio,true),
                Arguments.of(lleno,false));
    }
	
	@ParameterizedTest(name = "{index} => Se ha superado el maximo de vehiculos: {1}")
    @MethodSource("maxVehiculosProvider")
	void testSuperadoMaximoVehiculos(ArrayList<Vehiculo> a, boolean expected) {
		Ferry f = new Ferry(0,0,1,0,0,0);
		for (int i = 0;i<a.size();i++) f.embarcarVehiculo(a.get(i));
		assertEquals(expected, f.superadoMaximoVehiculos());
	}
	
	static Stream<Arguments> maxVehiculosProvider() {
		ArrayList<Vehiculo> a1 = new ArrayList<Vehiculo>();
		ArrayList<Vehiculo> a2 = new ArrayList<Vehiculo>();
		Vehiculo v1 = new Vehiculo (5,4,1000);
		Vehiculo v2 = new Vehiculo (5,4,1000);
		a1.add(v1);
		a2.add(v1);
		a2.add(v2);
        return Stream.of(
                Arguments.of(a1,false),
                Arguments.of(a2,true));
    }
	
	
	@ParameterizedTest(name = "{index} => Se ha superado el peso maximo de vehiculos: {1}")
    @MethodSource("maxVehiculosProvider")
	void testSuperadoMaximoPeso(ArrayList<Vehiculo> a, boolean expected) {
		Ferry f = new Ferry(0,1500,3,0,0,0);
		for (int i = 0;i<a.size();i++) f.embarcarVehiculo(a.get(i));
		assertEquals(expected, f.superadoMaximoPeso());
	}

}
