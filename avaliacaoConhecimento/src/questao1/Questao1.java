package questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

	public static void questao1() {
		Scanner scanner = new Scanner(System.in);
		try {
			int numero = 1;
			while(numero <= 1){
				System.out.print("Digite um n�mero: ");
				numero = scanner.nextInt();
				if(numero <= 1) {
					System.out.println("O n�mero deve ser Inteiro e maior que 1.");
				}
			}
			if(isPrimo(numero))
				System.out.println("N�mero " + numero + " � primo.");
			else 
				System.out.println("N�mero " + numero + " n�o � um n�mero primo.");
		} catch(InputMismatchException ime) {
			System.out.println("Digite um n�mero valido");
		}
	}
	public static boolean isPrimo(int numero) {
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
