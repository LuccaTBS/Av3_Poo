package entidades;

public abstract class Produto {
	private Double preco;
	private Integer codigo;
	private String nome;
	private Integer quantidade;

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return ", Preco - " + preco + ", Codigo - " + codigo + ", Quantidade - " + quantidade+", ";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto(Double preco, Integer codigo, String nome, Integer quantidade) {
		super();
		this.preco = preco;
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;

	}

}
