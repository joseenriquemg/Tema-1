package tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su edad");
		numero = sc.nextInt();
		
        System.out.println("Su edad el año que viene sera:" + (numero + 1));
		
		sc.close();

	}

}
