package entidades;

public class jogos extends Produto{
	
	private String tipoDeMidia;

	public String getTipoDeMidia() {
		return tipoDeMidia;
	}

	public void setTipoDeMidia(String tipoDeMidia) {
		this.tipoDeMidia = tipoDeMidia;
	}

	public jogos(Double preco, Integer codigo, String nome, Integer quantidade, Double imposto, String tipoDeMidia) {
		super(preco, codigo, nome, quantidade, imposto);
		this.tipoDeMidia = tipoDeMidia;
	}




}
