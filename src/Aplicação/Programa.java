package Aplicação;

import java.util.ArrayList;
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
		
		precoAux = 1000;
		codigoAux = 69;
		nomeAux = "Batman";
		quantidadeAux = 1;
		corAux = "Preto";
		tipoAux = "Action Figure";

		produtos.add(new Acessorios(precoAux, codigoAux, nomeAux, quantidadeAux, corAux, tipoAux));
		
		
		Loja loja = new Loja(produtos, "VaporGames", precoAux*10);
		/* Mensagem de bem vindo
		 * while{
		 * Mostrar todos os itens
		 * Possibilidades a se fazer
		 	* Mostrar a lista de itens
		 	* Comprar algum item
		 	* vender algum item
		 	* Adicionar Mais credito à loja
		 	* Sair
		 * */
		boolean rodarPrograma = true;
		Scanner sc = new Scanner(System.in);
		
		while(rodarPrograma) {
			System.out.print(loja.mostrarProdutos());
			System.out.println("Informe como Deseja prosseguir:\n\nComprar Algum produto (1)\nVender algum produto (2)"
					+ "\nAdicionar Mais Créditos à loja (3)\nEncerrar o programa (4)");
			
			rodarPrograma = false;
		}
	}

}
