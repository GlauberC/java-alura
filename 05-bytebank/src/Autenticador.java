
public class Autenticador {
	private String senha;
	
	public boolean autentica(String senhaSistema){
		return this.senha == senhaSistema;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
