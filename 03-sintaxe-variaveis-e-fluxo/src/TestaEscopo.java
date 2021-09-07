
public class TestaEscopo {
	public static void main(String[] args) {
		int numero = 3;
		String message;
		if (numero % 2 == 0) {
			message = numero + " é par";
		} else {
			message = numero + " é impar";
		}
		System.out.println(message);
	}
}
