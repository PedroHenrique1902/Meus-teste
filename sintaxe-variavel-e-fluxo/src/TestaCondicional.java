
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 17;	
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voce não tem 18, mais pode entrar, "
						+ "pois esta acompanhado");
			} else {
			System.out.println("Infelizmente você não pode entrar");
			}
		}

	}
}
