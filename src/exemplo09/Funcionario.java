package exemplo09;

/**
 * Classe para demonstrar o conceito de heran�a de m�todos e atributos
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public abstract class Funcionario {

	// Atributos do objeto Funcionario
	private String nome;
	private String cpf;
	private double salario;

	// M�todo para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// M�todo simples para exibir os atributos
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salario: R$ " + salario);
	}// Fim da classe

}
