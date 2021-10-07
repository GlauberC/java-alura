
public class SistemaInterno {
	private String senhaSistema;
	
	public SistemaInterno(String senhaSistema) {
		this.senhaSistema = senhaSistema;
	}
	
	public void validarLogin(Autenticavel autenticavel){
		if(autenticavel.autentica(this.senhaSistema)) {
			System.out.println("Entrou no sistema");
		}else {
			System.out.println("Acesso negado");
		}
	}

}
