package atividade04;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if (num1>num2) {
			int maior = num1;
			System.out.println("O maior número é "+maior);
		} else if (num2>num1) {
			int maior = num2;
			System.out.println("O maior número é "+maior);
		} else {
			System.out.println("Os números são iguais.");
		}
	}

}
