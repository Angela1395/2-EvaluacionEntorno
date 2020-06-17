package Funciones;
	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.BeforeAll;

public class PruebasFunciones{

	static Pruebas Funciones = null;
	static int PruebasRealizadas = 0;

	@BeforeAll
	static void prepararPruebas(){
		System.out.println("preparando tests");
		Funciones = new Pruebas();
	}

	@BeforeEach
	private void preparaPruebaEjecutar(){
		PruebasRealizadas++;
		System.out.println("Ejecutando el test" + PruebasRealizadas);
	}

	@AfterAll
	static void terminarPruebas(){
		System.out.println("Se ha terminado de hacer todas las pruebas y el total es" + PruebasRealizadas + "pruebas");
		Funciones = null;
	}

	@AfterEach
	private void terminadaPruebas(){
		System.out.println("se ejecuto el test:" + PruebasRealizadas);
	}
}
