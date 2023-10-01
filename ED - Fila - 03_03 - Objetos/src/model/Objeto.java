package model;

public class Objeto {

	private String nome;
	private int qndRetornos;
	
	public Objeto(String nome, int qndRetornos) {
		this.nome = nome;
		this.qndRetornos = qndRetornos;
	}

	public String getNome() {
		return nome;
	}

	public int getQndRetornos() {
		return qndRetornos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQndRetornos(int qndRetornos) {
		this.qndRetornos = qndRetornos;
	}
	
	

}
