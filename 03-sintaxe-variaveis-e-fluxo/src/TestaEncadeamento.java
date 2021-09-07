
public class TestaEncadeamento {
	public static void main(String[] args) {
		for(int primeiroNumero = 1; primeiroNumero <= 10; primeiroNumero++) {
			for(int segundoNumero = 1; segundoNumero <= 10; segundoNumero++) {
				System.out.println(primeiroNumero + " x " + segundoNumero + " = " + primeiroNumero * segundoNumero);
			}
			System.out.println("");
		}
	}
}
