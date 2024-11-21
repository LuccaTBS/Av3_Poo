package entidades;

public class acessorios extends Produto {
	private String cor;
	private String marca;
	private String tipo;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public acessorios(Double preco, Integer codigo, String nome, Integer quantidade, Double imposto, String cor,
			String marca, String tipo) {
		super(preco, codigo, nome, quantidade, imposto);
		this.cor = cor;
		this.marca = marca;
		this.tipo = tipo;
	}
	

}
