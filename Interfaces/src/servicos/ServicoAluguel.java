package servicos;

import entidades.AlugaCarro;

public class ServicoAluguel {
	private Double precoDia;
	private Double precoHora;
	
	private TaxaServicos taxaServ;

	public ServicoAluguel(Double precoDia, Double precoHora, TaxaServicos taxaServ) {
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.taxaServ = taxaServ;
	}
	
	public void processaFatura(AlugaCarro alugaCarro) {
		long dtInicio = alugaCarro.getDataInicial().getTime();
		long dtFinal = alugaCarro.getDataFinal().getTime();	//Acessa a hora em milissegundos
		
		double horas = (double) (dtFinal - dtInicio) / 1000 / 60 / 60; //Transforma de milissegundo para minutos e horas
		
		
		double pagamentoBase;
		if (horas <= 12) {
			pagamentoBase = Math.ceil(horas) * precoHora;
		}
		else {
			pagamentoBase = Math.ceil(horas/24) * precoDia;
		}
		
		
		double taxa = taxaServ.taxa(pagamentoBase);
		
		
		
	}
	
	
	

}
