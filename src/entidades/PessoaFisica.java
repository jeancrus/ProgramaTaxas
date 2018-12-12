package entidades;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double Imposto() {
		Double imposto = 0.0;
		if (rendaAnual < 20000.00 && gastosSaude > 0) {
			imposto = (rendaAnual * (15.0/100.0)) - (gastosSaude * (50.0/100.0));
		} else if (rendaAnual < 20000.00) {
			imposto = rendaAnual*15.0/100.0;
		} else if(rendaAnual >= 20000.00 && gastosSaude > 0) {
			imposto = (rendaAnual * (25.0/100.0)) - (gastosSaude * (50.0/100.0));
		} else {
			imposto = rendaAnual * (25.0/100.0);
		}
		return imposto;
	}

}
