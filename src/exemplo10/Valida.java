package exemplo10;

/**
 * Classe reponsavel para armazenar os metodos de validação de dados
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class Valida {

	// Método para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espaços da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// Fim do método

	// método para verificar String válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {// matches = verifica se não existe o parametro informado [] (* = parametro
										// de rejcts)
			return true;
		} else {
			return false;

		}
	}// fim do metodo

	// método para verificar String válida
	public static boolean isNumber(String args) {
		try {
			@SuppressWarnings("unused")
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}

	}// fim do metodo

}
