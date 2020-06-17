package Funciones;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Prueba5 extends PruebasFunciones{
	
	@Test
	@DisplayName("La primera prueba de la caja negra de los numeros aleatorios")
	void Prueba1() {
		assertEquals(14, Pruebas.Funcion5("+", 5, 9));
	}
	@Test
	@DisplayName("La segunda prueba de la caja negra con valores vacios")
	void Prueba2() {
		assertEquals(0, Pruebas.Funcion5(" ",0, 0));
	}
	@Test
	@DisplayName("La tercera prueba de la caja negra con un caracter valido")
	void Prueba3() {
		assertEquals(25, Pruebas.Funcion5("*", 5, 5));
	}
	@Test
	@DisplayName("La cuarta prueba de la caja negra con un caracter invalido")
	void Prueba4() {
		assertEquals(0, Pruebas.Funcion5(";", 4, 4));
	}
	@Test
	@DisplayName("primera prueba de la caja blanca con cobertura del primer camino")
	void Prueba5(){
	/*1º prueba con mi fecha de nacimiento: 15 de Octubre// 15,10*/
		assertEquals(25, Pruebas.Funcion5("+", 15, 10));
	}
	@Test
	@DisplayName("segunda prueba de la caja blanca con cobertura de los segundos caminos")
	void Prueba6() {
	/*2º con el caracter sea un -. con mi fecha de nacimiento*/
		assertEquals(5, Pruebas.Funcion5("-", 15, 10));
	}
	@Test
	@DisplayName("Tercera prueba de la caja blanca con cobertura de los terceros caminos")
	void Prueba7() {
	/*3º con el caracter sea un *. con mi fecha de nacimiento*/
		assertEquals(150, Pruebas.Funcion5("*", 15, 10));
	}
	@Test
	@DisplayName("Cuarta prueba de la caja blanca con cobertura de los ultimos caminos")
	void Prueba8() {
	/*Ultimo camino con el caracter no corresponde que nos devuelva un 0.
	 En vez de poner (+) de suma, de resta (-), de multiplicacion (*) vamos a poner el caracter (ç)*/
		assertEquals(0, Pruebas.Funcion5("ç", 8,2));
	}
}
