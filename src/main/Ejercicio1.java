package main;

public class Ejercicio1 {

	public static void main(String[] args) {
		// ingrese un número N. Muestra un triangulo en consola en este caso N=7
		
		int numero = 7;
		
		for (int i =0; i<numero; i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
