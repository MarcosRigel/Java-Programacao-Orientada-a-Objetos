package application;

import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		Pensionato[] pensionato = new Pensionato[n];
		
		System.out.println();
		
		for(int i=0; i<pensionato.length; i++) {
			System.out.println("Rent #" + (i+1) +":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.next();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			pensionato[i] = new Pensionato(nome, email, quarto);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<pensionato.length; i++) {
			if(pensionato[i] != null) {
				System.out.println(pensionato[i]);
			}
		}
		
		sc.close();
		
	}

}
