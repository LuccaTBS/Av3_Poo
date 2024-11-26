package entidades;

//Classe Jogos, ela estende a classe produtos
public class Jogos extends Produto{

	//Atributos específicos de Jogos
	private String tipoDeMidia;

	//Metodos Getters e Setters 
	public String getTipoDeMidia() {
		return tipoDeMidia;
	}

	public void setTipoDeMidia(String tipoDeMidia) {
		this.tipoDeMidia = tipoDeMidia;
	}

	//Construtor da classe Jogos
	public Jogos(Double preco, Integer codigo, String nome, Integer quantidade, String tipoDeMidia) {
		super(preco, codigo, nome, quantidade);
		this.tipoDeMidia = tipoDeMidia;
	}

	@Override
	public String toString() {
		return "Nome " + super.getNome() + super.toString() +"tipo De Midia - " + tipoDeMidia;
	}




}
