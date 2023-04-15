package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20; // variável tipo valor, fica localizada na area stack da memória!
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		// classe Wrapper class são classes equivalentes aos tipos primitivos
		// por exemplo a classe Integer ela é uma classe wrapper de int, Double para double e assim por diante
		
		Integer objeto = x * 2;
		
		y = objeto;
		
		System.out.println(y); 
		
		
	}

}
