package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		int contadorIndice = 1;
		
		for (int i=0;i<pessoa.length;i++) {
			System.out.println("Dados da " + contadorIndice + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
			contadorIndice++;
		}
		System.out.println();
		
		System.out.print("Altura média: "); 
	    double soma = 0.0; 
	    for (int i=0;i<pessoa.length;i++) { 
	    	soma += pessoa[i].getAltura();
		}
	    System.out.printf("%.2f%n", soma / n);
		 
	    System.out.println("Pessoas com menos de 16 anos");
	    
	    
	    
		sc.close();
	}

}
