package Funciones;

public class Pruebas{

	//Función 1
		/*Función que cuenta el número de vocales de una cadena y diga si es mayor que tu edad. Debe hacerse una prueba con tu nombre y aprellidos*/

	public static Boolean Funcion1 (String vocales){
		int contador = 0;
		for (int x = 0; x < vocales.length(); x++){
			if ((vocales.charAt(x) == 'a') || (vocales.charAt(x) =='o') 
				|| (vocales.charAt(x) == 'u') || (vocales.charAt(x) == 'e') || (vocales.charAt(x) == 'i')){
				contador++;
			}
		}
		if (contador >= 24){
			return true;
		} else {
			return false;
		}
	}

	//Funcion2
	/*Función que dada dos cadenas, diga cuál tiene más consonante. Debe hacerse una prueba con tu nombre y un apellido. Y otra prueba con tus dos apellidos.*/
	public static Boolean Funcion2 (String vocales, String vocales2){
		int consonante = 0;
		for (int x = 0; x < vocales.length(); x++){
			char letra = vocales.charAt(x);
			if (consonantevocales(letra)){
				consonante++;
			}
		}
		int consonante2 = 0;
		for (int x = 0; x < vocales2.length(); x++){
			char letra = vocales2.charAt(x);
			if (consonantevocales(letra)){
				consonante2++;
			}
		}
		if (consonante > consonante2){
			return true;
		} else if (consonante < consonante2){
			return false;
		} else {
			return null;
		}
	}
	public static Boolean consonantevocales(char letra){
		return "bcdfghjklmnpqrstvwxy".contains(String.valueOf(letra).toLowerCase());
	}

	//Funcion3
	/*Función que dada una lista de numeros, devuelva la suma de todos los que sean menores a tu edad pero mayores que la mitad de tu edad*/

	public static int Funcion3(int[] num){
		int suma = 0;
		for (int i = 0; i < num.length; i++){
			if (num[i] >= 10 && num[i] <=24){
				suma += num[i];
			}
		}
		return suma;
	}

	//Funcion4
	/*Función que dada una lista de notas, devuelva una cadena indicando si la nota media ha sido insuficiente(<5),suficiente(>=5 y <6),bien(>=6 y <7),
	notable(>=7 y <9) o sobresaliente(>=9 y 10).Debe hacerse una prueba con las notas obtenidas en el segundo trimestre.*/

	public static String Funcion4 (int[] notas){
		int media = 0;
		for (int i = 0; i < notas.length; i++){
			media = media + notas[i];
		}
		media = media / notas.length;

		if (media >= 0 && media <= 4){
			return "insuficiente";
		} else if (media >= 5 && media < 6){
			return "suficiente";
		} else if (media >= 6 && media < 7){
			return "bien";		
		} else if (media >= 7 && media < 9){
			return "notable";
		} else if (media >= 9 && media <10){
			return "sobresaliente";
		} else {
			return null;
		}
	}

	//Funcion5
	/*Función que dado dos números y un caracter, haga lo siguiente: Si el caracter es "+": devuelve la suma del primero con el segundo Si el
	caracter es "-": devuelve la resta del primero con el segundo Si el caracter es "*": devuelve la multiplicación del primero con el segundo Cualquier otro
	caracter, devuelve 0. Debe hacerse al menos 3 pruebas con el día y mes de tu nacimiento.*/

	public static int Funcion5 (String caracter, int n1, int n2){
		int resp = 0;
		String caractersuma = "+";
		String caracterresta = "-";
		String caractermulti = "*";

		if (caracter == caractersuma){
			resp = n1 + n2;	
		} else if (caracter == caracterresta){
			resp = n1 - n2;	
		} else if (caracter == caractermulti){
			resp = n1 * n2;	
		} else {
			resp = 0; 
		}
		return resp;
	}
}
