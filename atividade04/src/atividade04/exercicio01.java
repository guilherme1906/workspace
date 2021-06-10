package atividade04;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
		float notaFinal = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final do aluno"));
		if (notaFinal >= 7) {
			System.out.println("O aluno "+nomeAluno+ " está aprovado.");
		} else if (notaFinal >= 4 && notaFinal < 7) {
			System.out.println("O aluno "+nomeAluno+ " está de recuperação.");
		} else {
			System.out.println("O aluno "+nomeAluno+ " está reprovado.");
		}
	}

}
