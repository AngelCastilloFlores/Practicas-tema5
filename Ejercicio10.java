//Escribe un programa que calcule la media de un conjunto de n�meros positivos introducidos por teclado.
//A priori, el programa no sabe cu�ntos n�meros se introducir�n. 
//El usuario indicar� que ha terminado de introducir los datos cuando meta un n�mero negativo.
//positivos introducidos por teclado. A priori, el programa no sabe
//cu�ntos n�meros se introducir�n. El usuario indicar� que ha terminado
//de introducir los datos cuando meta un n�mero negativo

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		

		
	    double numeros = 0;
	    double numeroIntroducido = 0;
	    double suma = 0;

		System.out.println("A continuaci�n se le pedir� que introduzca n�meros por teclado. ");
		System.out.println("Cuando desee parar, introduzca un n�mero negativo.");

	    while (numeroIntroducido >= 0) {
	      numeroIntroducido = teclado.nextInt();
	      numeros++;
	      suma += numeroIntroducido;
	    }
	    
	    System.out.println("La media de los n�meros positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

	  }
	}