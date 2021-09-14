
public class Gerente extends Funcionario{
	private String senha;
	
	public Gerente() {
		
	}
	
	public boolean autentica(String senha){
		return senha == this.senha;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
