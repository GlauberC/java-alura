
public class ControleBonificacao {
	private double bonificacaoTotalDaEmpresa;
	
	public ControleBonificacao() {
		this.bonificacaoTotalDaEmpresa = 0;
	}
	
	public void auditar(Funcionario funcionario) {
		this.bonificacaoTotalDaEmpresa += funcionario.getBonificacao();
	}

	public double getBonificacaoTotalDaEmpresa() {
		return bonificacaoTotalDaEmpresa;
	}

	

}
