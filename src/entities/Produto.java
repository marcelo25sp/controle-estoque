package entities;

public class Produto {

	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

}
