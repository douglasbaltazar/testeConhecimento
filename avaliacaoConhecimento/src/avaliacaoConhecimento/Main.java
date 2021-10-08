package avaliacaoConhecimento;

import java.util.InputMismatchException;
import java.util.Scanner;

import questao1.Questao1;
import questao2.Questao2;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("----- Primeira Questão -----");
		Questao1.questao1();
		System.out.println("----- Fim Primeira Questão -----");
		System.out.println("----- Segunda Questão -----");
		Questao2.questao2();
		System.out.println("----- Fim Segunda Questão -----");
	}

}
