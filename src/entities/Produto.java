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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}

	public void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "Código do produto: " + codigo
			 + "\nNome: " + nome
			 + "\nPreço: " + String.format("R$ %.2f%n", preco)
			 + "\nQuantidade: " + quantidade
			 + " unidades";
	}
}
