
public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Pedro");
		g1.setCpf("223242455");
		g1.setSalario(499999);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(190222);
		boolean autenticou = g1.autentica(190222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	
		
	}

}
