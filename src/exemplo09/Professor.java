package exemplo09;

/**
 * Classe para armazenar os atributos de professor herdando os dados de
 * funcionario (herança)
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class Professor extends Funcionario implements InterfaceFuncionario { // Extends + Classe = herda de funcionario
	// Impliments implemtea os metodos obrigatorio da interface ja definidos

	// Atributos do objeto professor
	private String materia;

	// Método para acessar o atributo
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// Método simples para exibir os dados
	public void mostrarDados() {
		super.mostrarDados();// super referencia a classe herdada (metodo que esta em Funcionario)
		System.out.println("Materia: " + materia);
	}// Fim do metodo

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}

}
