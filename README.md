# Controle de Estoque 🛒

Este projeto Java simula um sistema simples de controle de estoque, permitindo ao usuário:

* Cadastrar produtos
* Listar todos os produtos cadastrados
* Adicionar e remover unidades do estoque de um produto específico
* Sair do sistema

## 💻 Tecnologias utilizadas

* Java 17
* Eclipse IDE
* Paradigmas OOP

## 📄 Funcionalidades

* Cadastro de produtos com código, nome, preço e quantidade em estoque.
* Listagem de todos os produtos com informações completas.
* Adição e remoção de unidades do estoque com verificação de disponibilidade.
* Menu interativo com as opções:

  1. Listar produtos: mostra todos os produtos cadastrados, seus valores no estoque e o valor total geral.
  2. Adicionar estoque: localiza um produto pelo código e adiciona a quantidade informada.
  3. Remover estoque: localiza um produto pelo código e remove a quantidade informada (com validação para não ultrapassar o disponível).
  4. Sair: encerra o programa.

## 📦 Estrutura do projeto

* `Main.java`: classe principal com menu interativo e controle de fluxo.
* `Produto.java`: classe com atributos e métodos relacionados à gestão de produtos.

## ✅ Exemplo de execução

```
Entre com o número de produtos a ser cadastrados: 2

Digite os dados do produto:
Código: 101
Nome: Notebook
Preço: 3500.00
Quantidade: 5

Digite os dados do produto:
Código: 102
Nome: Mouse
Preço: 150.00
Quantidade: 10

Menu:
1 - Listar todos os produtos
2 - Adicionar estoque
3 - Remover estoque
0 - Sair
Escolha uma opção: 1

---Lista de produtos---
Código do produto: 101
Nome: Notebook
Preço: R$ 3500.00
Quantidade: 5 unidades
Valor total no estoque: R$ 17500.00

Código do produto: 102
Nome: Mouse
Preço: R$ 150.00
Quantidade: 10 unidades
Valor total no estoque: R$ 1500.00

Valor total geral no estoque: R$ 19000.00
```

## 🔑 Conceitos Praticados

* Encapsulamento (atributos privados + getters e setters)
* Construtores
* Métodos de instância
* Sobrescrita do método `toString`
* Estruturas de decisão e repetição
* Boas práticas de versionamento com Git (commits pequenos e descritivos)

## 📌 Próximos Passos (melhorias possíveis)

* Persistência dos dados em arquivo ou banco de dados.
* Implementar atualização de nome e preço dos produtos.
* Adicionar tratamento de exceções para entradas inválidas.
* Criar interface gráfica ou API para integração.

## About

Sistema simples de controle de estoque em Java, desenvolvido para praticar conceitos fundamentais de programação orientada a objetos, incluindo encapsulamento, construtores, getters e setters, e manipulação de listas (`ArrayList`). Projeto com funcionalidades básicas de cadastro, atualização, remoção e relatório de produtos.

