package exemplo09;

/**
 * Classe para armazanar os atributos e m�todos do objeto secretaria e herdar de
 * funcionario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class Secretaria extends Funcionario {

	// Atributos de secretaria
	private int ramal;

	// M�todo para acessar os atributos
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	// M�todo simples para exibir os dados
	public void mostrarDados() {
		super.mostrarDados();// super referencia a classe herdada (metodo que esta em Funcionario)
		System.out.println("Ranmal: " + ramal);
	}// Fim do metodo

}
