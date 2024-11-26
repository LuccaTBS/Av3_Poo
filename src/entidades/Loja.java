package entidades;

import java.util.ArrayList;

//Classe Loja, ela gerencia os produtos, o dinheiro. Alem das operacoes de compra e venda
public class Loja {

	//Lista de produtos disponiveis na loja
	private ArrayList<Produto> produtos = new ArrayList<>();

	//Atributos da loja
	private String nome;
	private Double dinheiro;

	//Construtor da classe Loja
	public Loja(ArrayList<Produto> produtos, String nome, Double dinheiro) {
		super();
		this.produtos = produtos;
		this.nome = nome;
		this.dinheiro = dinheiro;
	}
	

	//Metodo para comprar um produto e adicionar ele a lista do usuario
	public boolean comprarItem(Produto prod) {

		//Verifica se o usuario tem dinheiro para fazer a compra
		if (prod.getPreco() * prod.getQuantidade() > dinheiro) {
			return false; //Compra nao realizada pela falta de dinheiro
		}
		dinheiro -= prod.getPreco()*prod.getQuantidade();
		produtos.add(prod); //Adiciona o produto comprado a lista
		
		return true; //Compra foi realizada
	}

	//Metodo que encontra o produto na lista, dado o codigo
	public int encontrarProduto(int codigo) {
		int counter = 0;

		//Itera pela lista de produtos
		for (Produto produto : produtos) {
			if (codigo == produto.getCodigo()) {
				return counter; //Vai retornar o indice do produto
			}
			counter += 1;
		}
		return -1; //Significa produto nao encontrado 	
	}

	//Metodo para vender um item para a loja
	public boolean venderItem(int codigo, int quantidade) {
		int itemIndex = encontrarProduto(codigo); //Encontra o índice do produto pelo código

		// Verifica se há estoque suficiente e se o produto foi encontrado
		if (produtos.get(itemIndex).getQuantidade() >= quantidade && itemIndex != -1) {

			Produto produtoVenda = produtos.get(itemIndex); // Obtém o produto para a venda

			dinheiro += quantidade * produtoVenda.getPreco(); // Atualiza o dinheiro da loja     

			produtoVenda.setQuantidade(produtoVenda.getQuantidade() - quantidade); // Atualiza o estoque

			//Vai remover o produto da lista, caso a quantidade for zero
			if (produtoVenda.getQuantidade() == 0) {
				produtos.remove(produtoVenda);
			}
			return true; //Significa que a venda foi bem sucedida
		}
		return false; //Significa que a venda foi mal sucedida
	}

	 //Metodo que mostra o produto, dado o codigo dele
	public String mostrarProdutos() {
		int counter = 1;
		String produtosAtuais = "----Lista De Produtos----\n\n\n";
		for(Produto produto: produtos){
			produtosAtuais+="#"+counter+" "+ produto.toString()+"\n\n";
			counter +=1; 
			
		}
		return produtosAtuais; //Retorna a lista de produtos
	}

	//Metodo que mostra o produto, dado o codigo dele
	public String mostrarProduto(int codigoProduto) {
		return produtos.get(encontrarProduto(codigoProduto)).toString(); //Retorna o produto encontrado como string
	}

	//Metodo para comprar mais unidades do produto 
	public boolean comprarItem(int codigoProduto, int quantidade) {
		int indexProduto = encontrarProduto(codigoProduto); //Encontra o índice do produto pelo código

		//Verifica se o produto foi encontrado e se ha dinheiro suficiente
		if(indexProduto != -1 && quantidade * produtos.get(indexProduto).getPreco() <= dinheiro) {
			produtos.get(indexProduto).setQuantidade(produtos.get(indexProduto).getQuantidade() + quantidade); //Atualiza a quatidade no estoque
			dinheiro -= quantidade * produtos.get(indexProduto).getPreco();  //Atualiza o dinheiro apos a compra
			return true; //Compra realizada com sucesso
		}
		return false; //Falha na compra 
	}

	//Metodo para adicionar dinheiro à loja
	public void addDinheiro(double valor) {
		dinheiro += valor;
	}

	//Metodos Getters e Setters
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(Double dinheiro) {
		this.dinheiro = dinheiro;
	}

}
