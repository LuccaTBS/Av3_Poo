package serviços;

public class impostoJogosBr implements imposto{

	@Override
	public Double calculaImposto(Double valor) {
		return valor*(0.15);
	}

}
