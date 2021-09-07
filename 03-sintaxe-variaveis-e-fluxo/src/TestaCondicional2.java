
public class TestaCondicional2 {
	public static void main(String[] args) {
		boolean tenhoCarro = true;
		int numeroVagasRestantes = 0;
		boolean podeEstacionar = tenhoCarro && numeroVagasRestantes > 0;
		if (podeEstacionar) {
			System.out.println("Você pode estacionar");
		} else {
			System.out.println("Você não pode estacionar");
		}

	}
}
