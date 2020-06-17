package Funciones;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

class Funcion3 extends PruebasFunciones{

	@Test
	@DisplayName("primera prueba de la caja negra de lista de numeros vacia")
	void Prueba1(){
		int[] num = new int[0];
		assertEquals(0, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Segunda prueba de la caja negra de limite superior")
	void Prueba2(){
		int[] num =new int [1];
		num[0] = 24;
		assertEquals(24, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Tercera prueba de la caja negra de valor limiter inferior")
	void Prueba3(){
		int[] num =new int [1];
		num[0] = 10;
		assertEquals(10, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Cuarta prueba de la caja negra lista de numeros a un valor fuera de este rango")
	void Prueba4(){
		int[] num = new int[4];
		num[0] = 7;
		num[1] = 10;
		num[2] = 12;
		num[3] = 15;
		assertEquals(37, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Primera prueba de la caja blanca cobertura de las setencias")
	/* En la prueba se podra comprobar que los numeros 4 de la siguiente lista esten entre el rango 
	10 y 19, puesto que todas las condiciones son verdad */
	void Prueba5(){
		int[] num = new int[4];
		num[0] = 11;
		num[1] = 13;
		num[2] = 18;
		num[3] = 19;
		assertEquals(61, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Segunda prueba de la caja blanca de cobestura de los primeros caminos")
	/*Primer camino es el numero de solo rango*/
	void Prueba6(){
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 23;
		num[2] = 2;
		num[3] = 4;
		assertEquals(33, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Tercera prueba de la caja blanca de cobertura de los segundos caminos")
	/* Segundo camino son dos numeros en el rango y los otros fuera*/
	void Prueba7(){
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 11;
		num[2] = 2;
		num[3] = 4;
		assertEquals(21, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Cuarta prueba de la caja blanca con cobertura de tercer camino")
	/* Tercer camino son los tres numeros en el rango y uno fuera*/
	void Prueba8(){
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 15;
		num[2] = 12;
		num[3] = 4;
		assertEquals(37, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Quinta prueba de la caja blanca con cobertura del cuarto")
	/*Cuarto camino son los cuatros numeros en el rango*/
	void Prueba9() {
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 15;
		num[2] = 12;
		num[3] = 14;
		assertEquals(51, Pruebas.Funcion3(num));
	}
	@Test
	@DisplayName("Sexta prueba de la caja blanca con cobertura de los ultimos caminos")
	/*Ultimo camino son todos los numeros del rango fuera de este*/
	void Prueba10() {
		int[] num = new int[4];
		num[0] = 0;
		num[1] = 5;
		num[2] = 32;
		num[3] = 43;
		assertEquals(0, Pruebas.Funcion3(num));
	}
}
