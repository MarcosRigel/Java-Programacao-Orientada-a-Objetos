/* Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos.
 * Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 * 
 * =======================================
 * Input			Output
 * =======================================
 * 3				AVERAGE PRICE = 700.00
 * TV
 * 900.00
 * Fryer
 * 400.00
 * Stove
 * 800.00
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i =0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
