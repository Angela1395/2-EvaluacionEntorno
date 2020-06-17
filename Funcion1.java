package Funciones;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Funcion1 extends PruebasFunciones{

	@Test
	@DisplayName ("La prueba de Caja negra de limite inferior")
	void Prueba1(){
		assertEquals(true, Pruebas.Funcion1("Si esto sale es un milagro"));
	}

	//Prueba con mi nombre completo
	@Test
	@DisplayName ("Segunda prueba de Caja negra de limite inferior-1")
	void Prueba2(){
		assertEquals(false, Pruebas.Funcion1("Ángela Guerado Carrasco"));
	}

	@Test
	@DisplayName ("caja negra la particion equivalente del grupo positivo")
	void Prueba3(){
		assertEquals(true, Pruebas.Funcion1("esternocleidomastoideo esternocleidomastoideo"));
	}

	@Test
	@DisplayName ("La prueba de la caja negra en particion equivalentes del grupo negativo")
	void Prueba4(){
		assertEquals(false, Pruebas.Funcion1("esternocleidomastoideo"));
	}

	@Test
	@DisplayName ("Segunda prueba de Caja negra de limite inferior-1")
	void Prueba5(){
		assertEquals(false, Pruebas.Funcion1("Ángela Guerado Carrasco"));
	}

	@Test
	@DisplayName ("Test de la Caja Blanca con cobertura de las condiciones de la primera correcta")
	void Prueba6(){
	/* esta condicion cumple si >=24*/
		 assertEquals(true, Pruebas.Funcion1("Se cumple si es mayor de mis 24"));
	}

	private void assertEquals(boolean b, Boolean Funcion1){
	}


	@Test
	@DisplayName ("Test de la Caja Blanca con cobertura de las condiciones de la primera incorrecta")
	void Prueba7(){
	/* esta condicion no se cumple si >=24*/
		 assertEquals(false, Pruebas.Funcion1("no se cumple porque es menor a mis 24"));
	}

	@Test
	@DisplayName ("Test de la Caja Blanca con cobertura de los caminos 1")
	void Prueba8(){
	/* Primer camino: en cadena >=24*/
		 assertEquals(true, Pruebas.Funcion1("Se cumple si la suma de las vocales de esta cadena es > a mis 24"));
	}

	@Test
	@DisplayName ("Test de la Caja Blanca con cobertura de los caminos 2")
	void Prueba9(){
	/* Segundo camino: en cadena >=24*/
		 assertEquals(false, Pruebas.Funcion1("Se cumple si el segundo sera en cadena < 24"));
	}
}
