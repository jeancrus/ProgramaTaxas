package entidades;

public class PessoaJuridica extends Pessoa {
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double Imposto() {
		Double imposto = 0.0;
		if (numFuncionarios > 10) {
			imposto = rendaAnual * (14.0/100.0);
		} else {
			imposto = rendaAnual * (16.0/100.0);
		}
		return imposto;
	}

}
