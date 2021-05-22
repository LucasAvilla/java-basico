package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as inform��es referente ao produto, quantidade e pre�o.
 * Calcular e exibir a quantidade total, o desconto e total a pagar.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio61 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis

		String nome;
		int quantidade;
		double total, desconto, totalpagar, preco;

		//Solicita as informa��es referente a compra para o usuario
		nome = JOptionPane.showInputDialog("Informe qual o produto adquirido:");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade adquirida:"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o unitario do produto: R$"));
		
		//Calcula o valor total da compra
		total = quantidade * preco;

		//Calcula o valor do desconto conforme a quantidade
		   if(quantidade <= 5){
		      desconto = (total * 2) / 100;
		   }else if	((quantidade>5) && (quantidade<=10)) {
		         desconto = (total * 3) / 100;
		   }else
		         desconto = (total * 5) / 100;
	
		   // Calcula o valor total a pagar com os descontos aplicados
		   totalpagar=total-desconto;

		   // Exibe para o usuario as informa��es sobre a compra
		   JOptionPane.showMessageDialog(null,"O valor total do "+ nome + " foi R$ " + total + "\n" +
				   							  "O desconto sobre a quantidade foi de R$ "+ desconto + "\n" +
				   							  "O valor total final a pagar foi de R$ " + totalpagar);
}

}
