package tema1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		float numero3;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su primera nota");
		numero1 = sc.nextInt();
		
		System.out.println("Introduzca su segunda nota");
		numero2 = sc.nextInt();
		
		
		numero3 = (float) (numero1 + numero2)/2;
        
		
		System.out.println("Su nota media es:" + numero3);
		
		sc.close();
}
   }
