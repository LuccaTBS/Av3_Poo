package entidades;

public class Acessorios extends Produto {
	private String cor;

	private String tipo;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Acessorios(Double preco, Integer codigo, String nome, Integer quantidade, String cor, String tipo) {
		super(preco, codigo, nome, quantidade);
		this.cor = cor;
		this.tipo = tipo;
	}
	

}
