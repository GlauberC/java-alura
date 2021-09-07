
public class TestaConversao {
	public static void main(String [] args) {
		double salario = 2700.50;
		int valor = (int) salario;
		System.out.println("valor: " + valor);
		
		long numeroGrande = 3232323232323232l;
		long numeroCurto = 3000;
		byte numeroMuitoPequeno = 126;
		System.out.println("long: " + numeroGrande);
		System.out.println("short: " + numeroCurto);
		System.out.println("byte: " + numeroMuitoPequeno);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("Total: " + total);
		
		float valorFloat1 = 0.2f;
		float valorFloat2 = 0.1f;
		float totalFloat = valorFloat1 + valorFloat2;
		System.out.println("TotalFloat: " + totalFloat);
	}
}
