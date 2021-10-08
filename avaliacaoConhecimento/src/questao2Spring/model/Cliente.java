package questao2Spring.model;

public class Cliente {
	public enum Tipo {
		VIP, NORMAL
	}
	
	private String nome;
	private Tipo tipo;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
