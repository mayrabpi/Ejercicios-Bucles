package main;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// encontrar el máximo entre tres números
  Scanner entrada=new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		
		System.out.println("ingresa el primer número:");
		
		numero1 = entrada.nextInt();
		
		System.out.println("ingresa el segundo número");
	
		numero2 = entrada.nextInt();
		
		System.out.println("ingresa el tercer número");
		
		numero3 = entrada.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("el maximo número es "+ numero1);
			}
			
			if (numero2 > numero1 && numero2 > numero3) {
				System.out.println("el maximo número es " + numero2);
				}
				
				if (numero3 > numero2 && numero3 > numero1) {
					System.out.println("el maximo número es " + numero3);
					}
				

	}

}
