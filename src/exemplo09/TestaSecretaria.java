package exemplo09;

/**
 * Classe responsavel por instanciar o objeto professor e exibir os seus dados
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */

public class TestaSecretaria {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Instanciando o objeto secretaria
		Secretaria maria = new Secretaria();
		maria.setNome("Maria ");
		maria.setCpf("321.321.321.32");
		maria.setSalario(900.00);
		maria.setRamal(123);

		maria.mostrarDados();
	}

}
