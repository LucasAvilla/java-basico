package exemplo07;

/**
 * Classe para armazenar os atributos e m�todos do objeto Pessoa
 * 
 * @author Lucas Igor A M Nogueira
 * @since 17/02/2021
 */

public class Pessoa {

	// declarando os atributos da pessoa
	private String nome;
	private Data dataNascimento;
	private double salario;

	// M�todo para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getsalariominimo() {
		if (salario > 1163.55) {
			return " Acima do sal�rio m�nimo";
		} else if (salario < 1163.55) {
			return " Abaixo do sal�rio m�nimo";
		} else {
			return " Recebe o sal�rio m�nimo";
		}

	}

}
