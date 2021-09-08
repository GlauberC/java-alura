
public class Main {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1234, 4321);
		System.out.println("A agência e número da primeira conta é: " + primeiraConta.getAgencia() + " "
				+ primeiraConta.getNumero());
		
		Conta segundaConta = new Conta(1234, 4334);
		System.out.println("O número de contas é: " + primeiraConta.getTotalContas());
	}
}
