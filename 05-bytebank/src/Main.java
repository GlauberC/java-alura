
public class Main {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno("1234");
		
		Autenticavel user1 = new Gerente();
		user1.setSenha("1234");
		
		Autenticavel user2 = new Cliente();
		user2.setSenha("123456");
		
		si.validarLogin(user1);
		si.validarLogin(user2);
		
		
	}

}
