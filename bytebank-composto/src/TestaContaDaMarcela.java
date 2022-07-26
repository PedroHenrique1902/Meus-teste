
public class TestaContaDaMarcela {
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.titular = new cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = new cliente();
		contaDoPaulo.titular.nome = "Paulo";
		System.out.println(contaDoPaulo.titular.nome);
		
	}

}
