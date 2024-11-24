package entidades;

public class Console extends Produto {

	private Integer armazenamento;
	private String cor;

	@Override
	public String toString() {
		return "Nome " + super.getNome() + super.toString() + "Cor - " + cor + ", Armazenamento - " + armazenamento;
	}

	public Console(Double preco, Integer codigo, String nome, Integer quantidade, Integer armazenamento, String cor) {
		super(preco, codigo, nome, quantidade);
		this.armazenamento = armazenamento;
		this.cor = cor;
	}

	public Integer getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(Integer armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
