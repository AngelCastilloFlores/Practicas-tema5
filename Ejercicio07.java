import java.util.Scanner;

//Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4cifras.
//El programa nos pedir� la combinaci�n para abrirla. Sino acertamos, se nos mostrar� el mensaje �Losiento,esa no es la combinaci�n� 
//y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�. Tendremos cuatro oportunidades para abrir la caja fuerte.

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;
		
		System.out.println("ACCESO AL INTERIOR DE LA CAJA FUERTE.");
		System.out.println("-------------------------------------");
		
		do{
			System.out.println("A continuaci�n, introduzca la clave de su caja fuerte: ");
			numeroIntroducido = teclado.nextInt();
			
			if (numeroIntroducido == 7496){
				acertado = true;
			}else{
				System.out.println("Clave incorrecta.");
			}
			
			intentos --;
			
		}while ((intentos) > 0 && (!acertado));
		
		if (acertado){
			System.out.println("�Ha abierto la caja fuerte!");
		}else{
			System.out.println("Ha agotado todos sus intentos.");
			
			
			
		}

	}

}
