package exemplo10;

/**
 * Classe reponsavel para armazenar os metodos de valida��o de dados
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class Valida {

	// M�todo para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espa�os da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// Fim do m�todo

	// m�todo para verificar String v�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {// matches = verifica se n�o existe o parametro informado [] (* = parametro
										// de rejcts)
			return true;
		} else {
			return false;

		}
	}// fim do metodo

	// m�todo para verificar String v�lida
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
