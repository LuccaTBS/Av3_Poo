package entidades;

//Classe abstrata Produto, ela define os atributos e os métodos comuns a todos os produtos
public abstract class Produto {

	//Atributos comuns de cada produto
	private Double preco;
	private Integer codigo;
	private String nome;
	private Integer quantidade;

	//Metodos Getters e Setters
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

	//Construtor da classe Produto
	public Produto(Double preco, Integer codigo, String nome, Integer quantidade) {
		super();
		this.preco = preco;
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;

	}

}
