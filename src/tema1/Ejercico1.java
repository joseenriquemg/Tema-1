package tema1;

import java.util.Scanner;

public class Ejercico1 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		
		System.out.println("Su numero es:" + numero);
		
		sc.close();

	}

}
