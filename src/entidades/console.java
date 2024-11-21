package entidades;

public class console extends Produto {

	private Integer armazenamento;
	private String cor;
	private Double peso;
	private Integer resolucao;



	public console(Double preco, Integer codigo, String nome, Integer quantidade, Double imposto, Integer armazenamento,
			String cor, Double peso, Integer resolucao) {
		super(preco, codigo, nome, quantidade, imposto);
		this.armazenamento = armazenamento;
		this.cor = cor;
		this.peso = peso;
		this.resolucao = resolucao;
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getResolucao() {
		return resolucao;
	}

	public void setResolucao(Integer resolucao) {
		this.resolucao = resolucao;
	}

}
