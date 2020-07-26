package listawhile;

public class Questao13 {
	public static void main(String[] args) {
		double paisA = 5000000.0;
		double paisB = 7000000.0;
		int t = 0;
		
		while(paisA <= paisB) {
			paisA += paisA * 0.03;
			paisB += paisB * 0.02;
			t += 1;
			System.out.println(paisA);
			System.out.println(paisB);		
		}


		System.out.println("O pais A passará o pais B quando fizer  "+t+" anos");
		
	}
}
