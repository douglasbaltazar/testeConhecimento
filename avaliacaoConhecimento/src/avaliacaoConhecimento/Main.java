package avaliacaoConhecimento;

import java.util.InputMismatchException;
import java.util.Scanner;

import questao1.Questao1;
import questao2.Questao2;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("----- Primeira Quest�o -----");
		Questao1.questao1();
		System.out.println("----- Fim Primeira Quest�o -----");
		System.out.println("----- Segunda Quest�o -----");
		Questao2.questao2();
		System.out.println("----- Fim Segunda Quest�o -----");
	}

}
