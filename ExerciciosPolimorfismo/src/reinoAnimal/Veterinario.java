package reinoAnimal;

import java.util.Scanner;

public class Veterinario {
	
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		int n = 0;
		System.out.println("Digite 1, 2 ou 3 para escolher um animal: ");
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		
		n = entrada.nextInt();
			System.out.println();
		
		switch (n) {
		case 1: 
			animal = cachorro; 
			animal.fazSom("Au! Au! Au!");
			break;
		case 2: 
			animal = cavalo; 
			animal.fazSom("Ihhhriri!");
			break;
		case 3: 
			animal = preguica; 
			animal.fazSom("Zzzzz...");
			break;
		default: 
			System.out.println("Número inválido. Digite novamente.");
			break;
		}

	}

}
