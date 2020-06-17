package Funciones;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Funcion4 extends PruebasFunciones{

	@Test
	@DisplayName("primera prueba de la caja negra de la lista de los numeros es nula")
	void Prueba1(){
		int[] notas = new int[1];
		notas[0] = 13;
		assertNull(null, Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("Segunda prueba de la caja negra con la lista de notas de varios valores")
	void Prueba2(){
	/*Notas de mi segunda evalucion*/
		int[] notas = new int[5];
		notas[0] = 3;
		notas[1] = 3;
		notas[2] = 2;
		notas[3] = 1;
		notas[4] = 7;
		assertEquals("insuficiente", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("Tercera prueba de la caja negra con la lista de notas con el valor")
	void Prueba3(){
		int[] notas = new int[1];
		notas[0] = 5;
		assertEquals("suficiente", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("Cuarta prueba de la caja negra al limite del superior es insuficiente")
	void Prueba4(){
		int[] notas = new int[4];
		notas[0] = 4;
		notas[1] = 4;
		notas[2] = 4;
		notas[3] = 4;
		assertEquals("insuficiente", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("la primera prueba de la caja blanca con cobertura de los primeros caminos")
	void Prueba5(){
	/*1º camino de las notas es 0 y 4.9 sera insuficiente*/
		int[] notas = new int[5];
		notas[0] = 0;
		notas[1] = 1;
		notas[2] = 2;
		notas[3] = 3;
		notas[4] = 4;
		assertEquals("insuficiente", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("la segunda prueba de la caja blanca con cobertura de los segundos caminos")
	void Prueba6(){
	/*2º camino son las notas media entre el 5y 5.9 sera suficiente*/
		int[] notas = new int[2];
		notas[0] = 5;
		notas[1] = 6;
		assertEquals("suficiente", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("la tercera prueba de la caja blanca con cobertura de los terceros caminos")
	void Prueba7(){
	/*3º camino son las notas media entre el 6y 6.9 sera bien*/
		int[] notas = new int[2];
		notas[0] = 6;
		notas[1] = 7;
		assertEquals("bien", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("la cuarta prueba de la caja blanca con cobertura de los cuatros caminos")
	void Prueba8(){
	/*4º camino son las notas media entre el 7 y 8.9 sera notable*/
		int[] notas = new int[2];
		notas[0] = 7;
		notas[1] = 9;
		assertEquals("notable", Pruebas.Funcion4(notas));
	}
	@Test
	@DisplayName("Quinta prueba de la caja blanca con cobertura de los ultimos caminos")
	void Prueba9(){
	/*ultimo camino son las notas medias entre 9 y 10 que seran Sobresalinetes*/
		int[] notas = new int[2];
		notas[0] = 9;
		notas[1] = 10;
		assertEquals("sobresaliente", Pruebas.Funcion4(notas));
	}
}
