package atividade04;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		if (num1>num2) {
			int maior = num1;
			System.out.println("O maior n�mero � "+maior);
		} else if (num2>num1) {
			int maior = num2;
			System.out.println("O maior n�mero � "+maior);
		} else {
			System.out.println("Os n�meros s�o iguais.");
		}
	}

}
