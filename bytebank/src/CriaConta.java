
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 200;

		primeiraConta.titular = "André";

		primeiraConta.agencia = 17;

		primeiraConta.numero = 5578;

		System.out.println("a primeira conta tem " + primeiraConta.saldo);

		Conta segundaConta = new Conta();

		segundaConta.saldo = 50;

		segundaConta.titular = "Pedro";

		System.out.println("a segunda conta tem " + segundaConta.saldo);

		System.out.println("O titular dessa conta é o " + segundaConta.titular);

	}

}
