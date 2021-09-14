
public class Main {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setName("João");
		funcionario1.setCpf("000.000.000-00");
		funcionario1.setSalario(2200);
		
		Gerente gerente1 = new Gerente();
		gerente1.setName("Paulo");
		gerente1.setCpf("000.000.000-01");
		gerente1.setSalario(4500);
		gerente1.setSenha("123");
		
		
		System.out.println("Nome do funcionário 1: " + funcionario1.getName());
		System.out.println("Salario do funcionário 1: " +funcionario1.getSalario());
		System.out.println("Bonificação do funcionário 1: " +funcionario1.getBonificacao());
		
		System.out.println("Nome do gerente 1: " + gerente1.getName());
		System.out.println("Salario do gerente 1: " +gerente1.getSalario());
		System.out.println("Bonificação do gerente 1: " +gerente1.getBonificacao());
		System.out.println("Autenticando gerente1: " + gerente1.autentica("1234"));
		System.out.println("Autenticando gerente1: " + gerente1.autentica("123"));

	}

}
