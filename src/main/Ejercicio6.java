package main;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// compruebe si los números están en orden creciente o decreciente
	
		Scanner entrada=new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		 
		System.out.println("ingresa el primer números");
		
		numero1 = entrada.nextInt();
		
        System.out.println("ingresa el segundo números");
		
		numero2 = entrada.nextInt();
		
        System.out.println("ingresa el tercer números");
		
		numero3 = entrada.nextInt();
		
		if (( numero1 < numero2) && (numero1 < numero3) && (numero2 < numero3)) {
			
			System.out.println(" los números estan en orden creciente");
		}
		
		else if ( (numero1 > numero2)&& (numero1 > numero3) && (numero2 > numero3)) {
			
			System.out.println(" los númeron estan en orden decreciente");
		}
		else {
			 System.out.println(" los números no estan en orden creciente ni decreciente");
		}
		

	}

}
