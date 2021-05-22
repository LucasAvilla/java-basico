package exercicios;

/**
 * Classe responsável por validar os dados inputados pelo usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 25 de fev. de 2021
 */
public class Valida {

	// verificando se o valor informado é valido
	public static boolean isIntValido(int args) {
		return (args <= 0);
	}

	// verificando se o valor digitado é nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string.trim().equals("") || string == null);
	}

	// verificando se 
	public static boolean isString(String args) {
		if (args.matches("[A-Z a-z\u00C0-\u00FF]*") && args.length() > 1) {
			return false;
		} else {
			return true;
		}
	
	}
}
