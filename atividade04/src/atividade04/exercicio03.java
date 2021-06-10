package atividade04;

import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (num1<num2) {
			int i = num1;
			while (i>=num1 && i<=num2) {
				System.out.print(" "+i+ ", ");
				i++; 
			}
		} else {
			int i = num2;
			while (i>=num2 && i<=num1) {
				System.out.print(" "+i+ ", ");
				i++; 
			}
		}
	}
}
