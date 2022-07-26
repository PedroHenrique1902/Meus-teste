
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPedro = new Conta();

		contaDoPedro.saldo = 200;
		contaDoPedro.deposita(50);

		System.out.println(contaDoPedro.saldo);

		contaDoPedro.saca(30);
		System.out.println(contaDoPedro.saldo);

		Conta contaDoPaulo = new Conta();

		contaDoPaulo.saldo = 10000;

		if (contaDoPaulo.trasfere(200, contaDoPedro)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Saldo insuficente");
		}
		System.out.println(contaDoPedro.saldo);
		System.out.println(contaDoPaulo.saldo);
	

	}

}
