package Aplicação;

import java.util.ArrayList;

import entidades.Console;
import entidades.Jogos;
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
		produtos.add(new Jogos(precoAux, codigoAux, nomeAux,quantidadeAux, tipoMidia));
		precoAux = 300;
		codigoAux = 360;
		nomeAux = "Xbox360";
		quantidadeAux = 5;
		int armazenamentoAux = 10;
		String corAux= "Preto";
		
		
		produtos.add(new Console(precoAux, codigoAux, nomeAux,quantidadeAux,armazenamentoAux,corAux ));
		
		
		precoAux = 130;
		codigoAux = 13;
		nomeAux = "NubwoL";
		quantidadeAux = 5;
		corAux= "Preto";
		String tipoAux = "Fone";
		
		
		produtos.add(new Acessorios(precoAux, codigoAux, nomeAux,quantidadeAux, corAux, tipoAux));
	}

}
