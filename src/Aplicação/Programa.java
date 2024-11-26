package Aplicação;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Acessorios;
import entidades.Console;
import entidades.Jogos;
import entidades.Loja;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Produto> produtos = new ArrayList<>();
		double precoAux = 250;
		int codigoAux = 123;
		String nomeAux = "Elden Ring";
		int quantidadeAux = 5;
		String tipoMidia = "Física";

		produtos.add(new Jogos(precoAux, codigoAux, nomeAux, quantidadeAux, tipoMidia));

		precoAux = 300;
		codigoAux = 360;
		nomeAux = "Xbox360";
		quantidadeAux = 5;
		int armazenamentoAux = 10;
		String corAux = "Preto";

		produtos.add(new Console(precoAux, codigoAux, nomeAux, quantidadeAux, armazenamentoAux, corAux));

		precoAux = 130;
		codigoAux = 13;
		nomeAux = "NubwoL";
		quantidadeAux = 5;
		corAux = "Preto";
		String tipoAux = "Fone";

		produtos.add(new Acessorios(precoAux, codigoAux, nomeAux, quantidadeAux, corAux, tipoAux));

		precoAux = 20;
		codigoAux = 111;
		nomeAux = "Suicide Squad";
		quantidadeAux = 10;
		tipoMidia = "Digital";

		produtos.add(new Jogos(precoAux, codigoAux, nomeAux, quantidadeAux, tipoMidia));

		precoAux = 150;
		codigoAux = 70;
		nomeAux = "CorserK70";
		quantidadeAux = 3;
		corAux = "Vermelho";
		tipoAux = "Teclado";

		produtos.add(new Acessorios(precoAux, codigoAux, nomeAux, quantidadeAux, corAux, tipoAux));

		precoAux = 400;
		codigoAux = 3;
		nomeAux = "Playstation3";
		quantidadeAux = 6;
		armazenamentoAux = 10;
		corAux = "Preto";

		produtos.add(new Console(precoAux, codigoAux, nomeAux, quantidadeAux, armazenamentoAux, corAux));

		precoAux = 100;
		codigoAux = 69;
		nomeAux = "Arkham Asylum";
		quantidadeAux = 1;
		tipoMidia = "Física";

		produtos.add(new Jogos(precoAux, codigoAux, nomeAux, quantidadeAux, tipoMidia));

		Loja loja = new Loja(produtos, "VaporGames", precoAux * 100);
		/*
		 * Mensagem de bem vindo while{ Mostrar todos os itens Possibilidades a se fazer
		 * Mostrar a lista de itens Comprar algum item vender algum item Adicionar Mais
		 * credito à loja Sair
		 */
		boolean rodarPrograma = true;
		Jogos jogoAux;
		Console consoleAux;
		Acessorios acessorioAux;
		Scanner sc = new Scanner(System.in);
		int opcaoEscolhida;
		int indexProduto;
		while (rodarPrograma) {
			System.out.println("\n\n---------Menu Principal---------\n\n");
			System.out.print(loja.mostrarProdutos());
			System.out.println("Dinheiro Total: " + loja.getDinheiro() + " R$");
			System.out.println("Informe como Deseja prosseguir:\n\nComprar Algum produto (1)\nVender algum produto (2)"
					+ "\nAdicionar Mais Créditos à loja (3)\nEncerrar o programa (4)\n Mostrar os produtos (5)");
			try {
				opcaoEscolhida = sc.nextInt();

				if (opcaoEscolhida == 1) {
					System.out.println("Comprar produto já existente(1)\nComprar Novo produto(2)");
					opcaoEscolhida = sc.nextInt();
					if (opcaoEscolhida == 1) {
						System.out.print("\nCódigo do Produto a se comprar mais: ");
						codigoAux = sc.nextInt();
						System.out.print("\nQuantidade de Produtos a se comprar: ");
						quantidadeAux = sc.nextInt();
						if (loja.comprarItem(codigoAux, quantidadeAux)) {
							System.out.println(loja.mostrarProduto(codigoAux));
							System.out.println("Produto comprado com sucesso!\n\nVoltando ao menu inicial\n");
						} else {
							System.out.println("Código de produto não encontrado ou Dinheiro Insuficiente");
						}
					} else if (opcaoEscolhida == 2) {
						System.out.print("\nCódigo do Produto a se comprar: ");
						codigoAux = sc.nextInt();
						if (loja.encontrarProduto(codigoAux) == -1) {
							System.out.println("\nInforme o Tipo de produto\n Jogo (1), Console (2), Acessorio (3)");
							opcaoEscolhida = sc.nextInt();
							System.out.print("Informe os dados do produto!\n\nNome:");
							sc.nextLine();
							nomeAux = sc.nextLine();
							System.out.print("Preço: ");
							precoAux = sc.nextDouble();
							System.out.print("Quantidade: ");
							quantidadeAux = sc.nextInt();
							if (opcaoEscolhida == 1) {
								System.out.println("Tipo de midia: Física (1), Digital (2)");
								opcaoEscolhida = sc.nextInt();
								if (opcaoEscolhida == 1) {
									tipoMidia = "Fisica";
									jogoAux = new Jogos(precoAux, codigoAux, nomeAux, quantidadeAux, tipoMidia);
									if (loja.comprarItem(jogoAux)) {
										System.out.println(jogoAux);
										System.out.println("Produto Adicionado com Sucesso!");
									} else {
										System.out.println("Dinheiro Insuficiente para Efetuar a compra!"
												+ "\nTente diminuir a Quantidade ou Adicionar mais dinheiro!");
									}

								} else if (opcaoEscolhida == 2) {
									tipoMidia = "Digital";
									jogoAux = new Jogos(precoAux, codigoAux, nomeAux, quantidadeAux, tipoMidia);
									if (loja.comprarItem(jogoAux)) {
										System.out.println(jogoAux);
										System.out.println("Produto Adicionado com Sucesso!");
									} else {
										System.out.println("Dinheiro Insuficiente para Efetuar a compra!"
												+ "\nTente diminuir a Quantidade ou Adicionar mais dinheiro!");
									}

								} else {
									System.out.println("Opcao Inválida, voltando ao menu inicial");
								}

							} else if (opcaoEscolhida == 2) {
								System.out.print("Armazenamento: ");
								armazenamentoAux = sc.nextInt();
								System.out.print("Cor: ");
								sc.nextLine();
								corAux = sc.nextLine();
								consoleAux = new Console(precoAux, codigoAux, nomeAux, quantidadeAux, armazenamentoAux,
										corAux);
								if (loja.comprarItem(consoleAux)) {
									System.out.println(consoleAux);
									System.out.println("Produto Adicionado com Sucesso!");
								} else {
									System.out.println("Opcao Inválida, voltando ao menu inicial");
								}

							} else if (opcaoEscolhida == 3) {
								System.out.print("Cor: ");
								sc.nextLine();
								corAux = sc.nextLine();
								System.out.println("Tipo de acessorio: HeadSet (1), Mouse (2), Controle (3)");
								opcaoEscolhida = sc.nextInt();
								if (opcaoEscolhida == 1) {
									tipoAux = "Headset";
									acessorioAux = new Acessorios(precoAux, codigoAux, nomeAux, quantidadeAux, corAux,
											tipoAux);
									if (loja.comprarItem(acessorioAux)) {
										System.out.println(acessorioAux);
										System.out.println("Produto Adicionado com Sucesso!");
									} else {
										System.out.println("Dinheiro Insuficiente para Efetuar a compra!"
												+ "\nTente diminuir a Quantidade ou Adicionar mais dinheiro!");
									}

								} else if (opcaoEscolhida == 2) {
									tipoAux = "Mouse";
									acessorioAux = new Acessorios(precoAux, codigoAux, nomeAux, quantidadeAux, corAux,
											tipoAux);
									if (loja.comprarItem(acessorioAux)) {
										System.out.println(acessorioAux);
										System.out.println("Produto Adicionado com Sucesso!");
									} else {
										System.out.println("Dinheiro Insuficiente para Efetuar a compra!"
												+ "\nTente diminuir a Quantidade ou Adicionar mais dinheiro!");
									}

								} else if (opcaoEscolhida == 3) {
									tipoAux = "Controle";
									acessorioAux = new Acessorios(precoAux, codigoAux, nomeAux, quantidadeAux, corAux,
											tipoAux);
									if (loja.comprarItem(acessorioAux)) {
										System.out.println(acessorioAux);
										System.out.println("Produto Adicionado com Sucesso!");
									} else {
										System.out.println("Dinheiro Insuficiente para Efetuar a compra!"
												+ "\nTente diminuir a Quantidade ou Adicionar mais dinheiro!");
									}
								} else {
									System.out.println("Opcao Inválida, voltando ao menu inicial");
								}
							}

						} else {
							System.out.println("Código Já esta no banco de dados!\nVoltando ao menu inicial");
						}

					} else {
						System.out.println("Valor Inválido, Voltando ao menu inicial");
					}

				} else if (opcaoEscolhida == 2) {
					System.out.print("Digite o Código do item que Pretende vender\nCódigo: ");
					codigoAux = sc.nextInt();
					if (loja.encontrarProduto(codigoAux) != -1) {
						System.out.print("Quantidade de produtos a serem vendidos: ");
						quantidadeAux = sc.nextInt();
						if (loja.venderItem(codigoAux, quantidadeAux)) {
							System.out.println("Venda Concluida com Sucesso!");
						} else {
							System.out.println(
									"Quantidade de produtos a serem vendidos excede a quantidade em estoque!\n\n Retornando ao menu inicial");
						}
					} else {
						System.out.println("Código inválido!\nRetornando ao menu Principal");
					}
				} else if (opcaoEscolhida == 3) {
					System.out.print("Digite quanto dinheiro deseja Investir na Loja: ");
					precoAux = sc.nextDouble();
					loja.setDinheiro(loja.getDinheiro()+precoAux);
					System.out.println("Investimento Completo!");
				} else if (opcaoEscolhida == 4) {
					rodarPrograma = false;
				} else if (opcaoEscolhida == 5) {

				} else {
					System.out.println("Essa opção não é valida. Digite uma opcão valida!");
				}
			} catch (InputMismatchException e) {

				System.out.println("Valor Inválido, Voltando ao menu inicial");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				opcaoEscolhida = -1;
				sc.next();
			}
		}

	}

}