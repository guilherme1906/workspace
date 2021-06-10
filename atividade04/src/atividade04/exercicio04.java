package atividade04;

import javax.swing.JOptionPane;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavraAcesso = JOptionPane.showInputDialog("Digite a palavra de acesso: ");
		String senha = "Java2021";
		if (palavraAcesso.equals(senha)) {
			System.out.println("Permissão aprovada");
		} else {
			int i = 5;
			while (i <= 5 && i >=1) {
			System.out.println("Permissão reprovada, restam "+i+ " tentativas.");
			i--;
			palavraAcesso = JOptionPane.showInputDialog("Digite a palavra de acesso: ");
			if (palavraAcesso.equals(senha)) {
				System.out.println("Permissão aprovada");
				break;
			}
			}
		}
	}
}