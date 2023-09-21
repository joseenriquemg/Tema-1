package tema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su año de nacimiento");
		numero1 = sc.nextInt();
		
		System.out.println("Introduzca el año actual");
		numero2 = sc.nextInt();
        
		
		System.out.println("Su edad es:" + (numero2 - numero1));
		
		sc.close();


	}

}
