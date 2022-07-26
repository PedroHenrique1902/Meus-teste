
public class TestaGeteSet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 33333);
		conta.setNumero(2275);
		System.out.println(conta.getNumero());
		
		cliente paulo = new cliente();
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		 
		System.out.println(conta.getTitular().getProfissao());
		
		conta.deposita(400);
		 
		System.out.println(conta.getSaldo());
	
		
	}

}
