package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee[] employee = new Employee[10];
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Employee #"+i+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee[i] = new Employee(name, salary, id);
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if (employee[i].getId() == id) {
				System.out.print("Enter the percentage: ");
				int porcentagem = sc.nextInt();
				
			}
		}
		
		System.out.println("List of employees: ");
		for(int i=0;i<10;i++) {
			if(employee[i] != null) {
				System.out.println(employee[i]);
			}
		}
		
		sc.close();
		
	}

}
