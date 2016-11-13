import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado.
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número del que quiera saber su tabla de multiplicar: ");
		int numeroIntroducido = teclado.nextInt();
		
		for (int i = 0; i <= 10; i++){
			System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
		}
	}

}
