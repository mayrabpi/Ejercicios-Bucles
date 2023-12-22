package main;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// programa para comprobar si un triángulo es equilátero, isóceles o escaleno
		Scanner entrada=new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;
		
		
		System.out.println("meta el numero del primer lado");
		
		lado1 = entrada.nextInt();
		
		System.out.println("meta el numero del segundo lado");
		
		lado2 = entrada.nextInt();
		
		System.out.println("meta el numero del tercer lado");
		
		lado3 = entrada.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3) {
			
			System.out.println("el tirangulo es equilatero");
			
			}
			
		else if ((lado1 == lado2 && lado2 != lado3) || (lado1 == lado3 && lado3 != lado2 ) || (lado1 != lado2 && lado2 == lado3)) {
				
			System.out.println("el triangulo es isósceles");
			
			
			
			}
			
		else {
				System.out.println("el triangulo es escaleno");
			}
			


	}

}
