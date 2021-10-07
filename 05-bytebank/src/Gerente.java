
public class Gerente extends Funcionario implements Autenticavel{
	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

	
	public boolean autentica(String senhaSistema){
		return this.autenticador.autentica(senhaSistema);
	}

	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

}
