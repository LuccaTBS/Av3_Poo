package entidades;

//Classe Acessorios, ela estende a classe Produto
public class Acessorios extends Produto {

	//Atributos específicos de Acessorios
	private String cor;
	private String tipo;

	//Metodos Getters e Setters
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

	//Construtor da classe Acessorios
	public Acessorios(Double preco, Integer codigo, String nome, Integer quantidade, String cor, String tipo) {
		super(preco, codigo, nome, quantidade);
		this.cor = cor;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nome - " + super.getNome() + super.toString() + "Cor - " + cor + ", Tipo - " + tipo;
	}

}
