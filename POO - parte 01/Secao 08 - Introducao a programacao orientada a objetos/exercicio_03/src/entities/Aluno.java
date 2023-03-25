package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void notaFinal() {
		double result = nota1 + nota2 + nota3;
		
		if (result > 60) {
			System.out.printf("FINAL GRADE = %.2f%n", result);
			System.out.println("PASS");
		}
		else {
			System.out.printf("FINAL GRADE = %.2f%n", result);
			System.out.println("FAILED");
			double falta = 60 - result;
			System.out.printf("MISSING %.2f POINTS", falta);
		}
	}
}
