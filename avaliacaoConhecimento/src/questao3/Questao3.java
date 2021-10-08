package questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao3 {
	public static void questao3() {
		// Dado a seguinte lista de Inteiros [2, 3, 4, 5, 6, 2, 7, 7, 11] crie duas listas,
		// uma com apenas os números pares e outra com apenas os números impares, ambas listas em ordem crescente e sem números repetidos.
		int[] lista = {2, 3, 4, 5, 6, 2, 7, 7, 11};
		System.out.println(" --- Primeira Maneira de Solucionar Questão 3 --- ");
		System.out.println(" --- Usando Java hardcoded --- ");
		maneira1(lista);
		System.out.println("\n --- Fim Primeira Maneira --- ");
		System.out.println(" --- Segunda Maneira de Solucionar Questão 3 --- ");
		System.out.println(" --- Usando Java 8 --- ");
		maneira2(lista);
		System.out.println("\n --- Fim Segunda Maneira --- ");
	}
	static void maneira1(int[] lista) {
		System.out.println("  Removendo Repetidos...");
		System.out.println("  Ordenando Array...");
		lista = removerRepetidos(lista);
		lista = ordenarArray(lista);
		System.out.print("  Resultado: ");
		for(int i : lista) 
			System.out.print(i + " ");
		
		listarParImpar(lista);
		
	}
	
	static int[] removerRepetidos(int[] array) {
        int[] aux = new int[ array.length ];
        int qtd = 0;
        for( int i = 0 ; i < array.length ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < qtd ; j++ ) {
                if( aux[ j ] == array[ i ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                aux[ qtd++ ] = array[ i ];
            }
        }
        aux = Arrays.copyOf( aux , qtd );
		return aux;
	}
	static int[] ordenarArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] < array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		return array;
	}

	static void listarParImpar(int[] array) {
		List<Integer> par = new ArrayList<Integer>();
		List<Integer> impar = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				par.add(array[i]);
			} else {
				impar.add(array[i]);
			}
		}
		System.out.print("\n  Lista de Pares: ");
		for(int i : par) 
			System.out.print(i + " ");
		System.out.print("\n  Lista de Impares: ");
		for(int i : impar) 
			System.out.print(i + " ");
	}
	static void maneira2(int[] lista) {
		lista = Arrays.stream(lista).sorted().distinct().toArray();
		int[] pares = Arrays.stream(lista).filter(i -> i % 2 == 0).toArray();
		int[] impares = Arrays.stream(lista).filter(i -> i % 2 != 0).toArray();
		System.out.print("  Lista de Pares: ");
		for(int i : pares) 
			System.out.print(i + " ");
		System.out.print("\n  Lista de Impares: ");
		for(int i : impares) 
			System.out.print(i + " ");
		
	}
}
