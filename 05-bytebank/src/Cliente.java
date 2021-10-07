
public class Cliente implements Autenticavel {
	private String nome;
	private String cpf;
	private String profissao;
	private Autenticador autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticador();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public boolean autentica(String senhaSistema){
		return this.autenticador.autentica(senhaSistema);
	}

	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}
	
}
