
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2755);
		
		System.out.println(conta.getAgencia());
		
		System.out.println(Conta.getTotal());
		
	}

}
