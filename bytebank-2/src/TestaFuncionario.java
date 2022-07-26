
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario pedro = new Funcionario();
		pedro.setNome("Pedro");
		pedro.setCpf("333.222.000-00");
		pedro.setSalario(2000.00);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
	}

}
