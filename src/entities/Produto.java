package entities;

/*
 * Classe que representa um produto no sistema de estoque
 * Armazena código, nome, preço e quantidade do produto
 */

public class Produto {

	// Atributos privados que representam os dados do produto
	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor para inicializar os atributos do produto
	public Produto(int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	// Métodos getters e setters para acessar e modificar os atributos do produto

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
	
	// Métodos para adicionar, remover e calcular o valor total do estoque 
	
	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}

	public void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	// Método que mostra os dados formatados do produto(código, nome, preço e quantidade)
	public String toString() {
		return "Código do produto: " + codigo
			 + "\nNome: " + nome
			 + "\nPreço: " + String.format("R$ %.2f%n", preco)
			 + "Quantidade: " + quantidade
			 + " unidades";
	}
}
