package questao2;

import java.util.ArrayList;

import questao2.model.Cliente;
import questao2.model.Cliente.Tipo;

public class Questao2 {
	public static void questao2() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes = povoarClientes();
		for(int i = 0; i < clientes.size(); i++) {
			Cliente aux = clientes.get(i);
			if(aux.getTipo().equals(Tipo.VIP)) {
				System.out.println("Cliente " + aux.getNome() + " é " + aux.getTipo().toString());
			}
		}
	}
	
	public static ArrayList<Cliente> povoarClientes() {
		ArrayList<Cliente> listaAux = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Diego", Tipo.NORMAL);
		Cliente cliente2 = new Cliente("Diogo", Tipo.VIP);
		Cliente cliente3 = new Cliente("Douglas", Tipo.NORMAL);
		Cliente cliente4 = new Cliente("Joaquim", Tipo.VIP);
		Cliente cliente5 = new Cliente("Odete", Tipo.VIP);
		listaAux.add(cliente1);
		listaAux.add(cliente2);
		listaAux.add(cliente3);
		listaAux.add(cliente4);
		listaAux.add(cliente5);
		return listaAux;
	}
}
