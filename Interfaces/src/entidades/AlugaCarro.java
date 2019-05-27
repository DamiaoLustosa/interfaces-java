package entidades;

import java.util.Date;

public class AlugaCarro {
	private Date dataInicial;
	private Date dataFinal;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AlugaCarro() {
		
	}

	public AlugaCarro(Date dataInicial, Date dataFinal, Veiculo veiculo) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.veiculo = veiculo;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	

	
	
	
	
	
	
	

}
