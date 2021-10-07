
public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int totalContas;
		
	public Conta(int agencia, int numero) {
		totalContas++;
		setAgencia(agencia);
		setNumero(numero);
	}
	
	public static int getTotalContas() {
		return totalContas;
	}

	private boolean possuiSaldoParaOperacao(double valor) {
		return this.saldo >= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		boolean podeSacar = this.possuiSaldoParaOperacao(valor);
		if (podeSacar) {
			this.saldo -= valor;
		}
		return podeSacar;
	}

	public boolean transfere(Conta conta, double valor) {
		boolean podeTransferir = this.possuiSaldoParaOperacao(valor);

		if (podeTransferir) {
			this.saldo -= valor;
			conta.deposita(valor);
		}
		return podeTransferir;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {

			this.numero = numero;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
