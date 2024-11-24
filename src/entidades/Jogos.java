package entidades;

public class Jogos extends Produto{
	
	private String tipoDeMidia;

	public String getTipoDeMidia() {
		return tipoDeMidia;
	}

	public void setTipoDeMidia(String tipoDeMidia) {
		this.tipoDeMidia = tipoDeMidia;
	}

	public Jogos(Double preco, Integer codigo, String nome, Integer quantidade, String tipoDeMidia) {
		super(preco, codigo, nome, quantidade);
		this.tipoDeMidia = tipoDeMidia;
	}

	@Override
	public String toString() {
		return "Nome " + super.getNome() + super.toString() +"tipo De Midia - " + tipoDeMidia;
	}




}
