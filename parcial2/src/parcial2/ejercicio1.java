package parcial2;

import java.util.Scanner;

public class ejercicio1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		
		
		char[] caracteres = frase.toCharArray();
		
		
		System.out.println("Los elementos son: ");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
		
		sc.close();
				
	}

}
