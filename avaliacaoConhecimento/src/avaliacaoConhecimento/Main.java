package avaliacaoConhecimento;

import java.util.InputMismatchException;
import java.util.Scanner;

import questao1.Questao1;
import questao2.Questao2;
import questao3.Questao3;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("----- Primeira Quest�o -----");
		Questao1.questao1();
		System.out.println("----- Fim Primeira Quest�o -----");
		System.out.println("----- Segunda Quest�o -----");
		Questao2.questao2();
		System.out.println("----- Fim Segunda Quest�o -----");
		System.out.println("----- Segunda Quest�o em Spring API feito tambem -----");
		System.out.println("----- Fim Segunda Quest�o Spring -----");
		System.out.println("----- Terceira Quest�o -----");
		Questao3.questao3();
		System.out.println("\n----- Fim Terceira Quest�o -----");
	}

}
