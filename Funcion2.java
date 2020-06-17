package Funciones;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Funcion2 extends PruebasFunciones{

	@Test
	@DisplayName("Primera prueba de caja negra de cadenas vacias")
	void Prueba1(){
		assertEquals(null, Pruebas.Funcion2("",""));
	}
	@Test
	@DisplayName("Segunda prueba de caja negra de cadenas Aleatoreas")
	void Prueba2(){
		assertEquals(false, Pruebas.Funcion2("Me gusta la musica","los viajes son interesante"));
	}
	@Test
	@DisplayName("Tercera prueba de caja negra de particion de grupo positivo")
	void Prueba3(){
		assertEquals(null, Pruebas.Funcion2("Supercalifragilisticoespialidoso","Supercalifragilisticoespialidos"));
	}
	@Test
	@DisplayName("Cuarta prueba de caja negra con equivalentes del grupo negativo ")
	void Prueba4(){
		assertEquals(null, Pruebas.Funcion2("Enfermera","Dentista"));
	}
	@Test
	@DisplayName("Primera prueba de caja blanca de la decision primera.")
	void Prueba5(){
	/* 1º Decision: la cadena sera mayor a la segunda, en cuanto a consonantes*/
		assertEquals(true, Pruebas.Funcion2("electroencefalografista","Uno es lo que elige ser"));
	}@Test
	@DisplayName("Segunda prueba de caja blanca de la decision segunda")
	void Prueba6(){
	/* 1º Decision: la cadena sera mayor a la segunda, en cuanto a consonantes*/
		assertEquals(true, Pruebas.Funcion2("Mi perro se llama Bimbo, y no se come","Quiero salira la calle"));
	}
	@Test
	@DisplayName("Tercera prueba de caja blanca de cobertura del primer camino")
	void Prueba7(){
	/*1º camino dira si la cadena primera es mayor a la segunda en consonantes
	*/ //En esta esta mi nombre y primer apellido
		assertEquals(null, Pruebas.Funcion2("Angela","Guerado"));
	}
	@Test
	@DisplayName("Cuarta prueba de caja blanca de cobertura del segundo camino")
	void Prueba8(){
	/*2º camino dira si la cadena primera es mayor a la segunda en consonantes
	*/ //En esta esta mis apellidos
		assertEquals(false, Pruebas.Funcion2("Guerado","Carrasco"));
	}
	@Test
	@DisplayName("Quinta prueba de caja blanca de cobertura del ultimo camino")
	void Prueba9(){
	/* El ultimo camino nos dira si la primera cadena es = a la segunda en consonante*/
		assertEquals(true, Pruebas.Funcion2("por fin","aleluya"));
	}
}
