
public class TestaFlutuante {
	public static void main(String[] args) {
		double peso = 90.7;
		double altura = 1.82;
		double imc = peso / (altura*altura);
		System.out.println("O IMC é: " + imc);
		
		int testDivisao = 5 / 2;
		System.out.println("testDivisao: " + testDivisao);
		
		double testDivisaoDouble = 5.0 / 2;
		System.out.println("testDivisaoDouble: " + testDivisaoDouble);
	}
}
