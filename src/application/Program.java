package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

/*
 * Classe principal que executa o controle de estoque
 * Apresenta um menu interativo para a manipulação de produtos
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número de produtos a ser cadastrados: ");
		int n = sc.nextInt();

		// Lista para armazenar os produtos cadastrados
		List<Produto> produtos = new ArrayList<>();

		// Loop para o cadastro dos dados do produto
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do produto:");
			System.out.print("Código: ");
			int codigo = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			System.out.println();
			produtos.add(new Produto(codigo, nome, preco, quantidade));
		}

		// Loop do menu
		int opcao;
		do {
			System.out.println("Menu:");
			System.out.println("1 - Listar todos os produtos:");
			System.out.println("2 - Adicionar estoque:");
			System.out.println("3 - Remover estoque:");
			System.out.println("0 - Sair:");
			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				// Exibe a lista de produtos,seus valores no estoque e o valor total geral
				System.out.println("---Lista de produtos---");
				double totalGeral = 0.0;
				for (Produto p : produtos) {
					System.out.println(p);
					System.out.printf("Valor total no estoque: R$ %.2f%n", p.valorTotalNoEstoque());
					System.out.println("---------------------------------");
					totalGeral += p.valorTotalNoEstoque();
				}
				System.out.printf("Valor total geral no estoque: R$ %.2f%n", totalGeral);
				break;

			case 2:
				// Adiciona quantidade ao estoque
				System.out.println("---Adicionar estoque---");
				System.out.print("Informe o código do produto: ");
				int codAdd = sc.nextInt();
				System.out.print("Informe a quantidade a ser adicionada: ");
				int qtdAdd = sc.nextInt();
				boolean encontrado = false;
				for (Produto p : produtos) {
					if (p.getCodigo() == codAdd) {
						p.adicionarEstoque(qtdAdd);
						System.out.println("Estoque atualizado com sucesso!");
						encontrado = true;
					}
					if (encontrado == false) {
						System.out.println("Produto não encontrado");
					}
				}
				break;

			case 3:
				// Remove quantidade do estoque
				System.out.println("---Remover estoque---");
				System.out.print("Informe o código de produto: ");
				int codRemove = sc.nextInt();
				System.out.print("Informe a quantidade a ser removida: ");
				int qtdRemove = sc.nextInt();
				for (Produto p : produtos) {
					if (p.getCodigo() == codRemove) {
						p.removerEstoque(qtdRemove);
						System.out.println("Estoque atualizado com sucesso!");
					}
				}
				break;
				
			case 0:
				// comando para o encerramento do programa
				System.out.println("Encerrando o programa...");
				break;
			}
		} while (opcao != 0);

		sc.close();

	}

}
