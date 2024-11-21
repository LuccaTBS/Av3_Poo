package serviços;

import entidades.Produto;
import entidades.Acessorios;
import entidades.Console;
import entidades.Jogos;

public class ServicoImposto {
	private imposto servicoImposto;

	public ServicoImposto(imposto servicoImposto) {
		this.servicoImposto = servicoImposto;
	}

	public double processarImposto(Produto produto) {
		double valor=0;
		valor = servicoImposto.calculaImposto(produto.getPreco()); 
		return valor;
	}
}
