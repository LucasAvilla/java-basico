package exemplo09;

/**
 * Classe responsavel por instanciar o objeto professor e exibir os seus dados
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class TestaProfessor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// criando objeto do tipo professor e instanciando
		Professor jose = new Professor();
		jose.setNome("José Aparecido da Silva");
		jose.setCpf("123.123.123.12");
		jose.setSalario(1500.00);
		jose.setMateria("Matematica");

		jose.mostrarDados();
	}

}
