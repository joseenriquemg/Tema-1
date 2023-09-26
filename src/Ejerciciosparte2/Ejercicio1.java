package Ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos las constantes kpera y kmanzana
		final float PRECIO_MANZANA = 2.35f;
		final float PRECIO_PERA = 1.95f;
	   //Creamos las variables 
		float kmanzana;
		float kpera;
		//Creamos el Scanner
		Scanner sc = new Scanner (System.in);
		//Le pedimos kilos de peras comprados al usuario 
		System.out.println("Introduzca los kilos de peras que desea comprar");
		//Se lee el kilo de peras del teclado
		kpera = sc.nextFloat();
		//Le pedimos kilos de manzanas comprados al usuario 
		System.out.println("Introduzca los kilos de manzanas que desea comprar");
		//Se lee el kilo de manzanas del teclado
		kmanzana = sc.nextFloat();
		//Le donamos su precio final al usuario
        System.out.println("Su precio final sera:" + (kpera * PRECIO_PERA + kmanzana * PRECIO_MANZANA) + "€");
		//Cerramos el scanner
		sc.close();
		
	}

}
