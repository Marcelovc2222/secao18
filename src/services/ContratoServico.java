package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Prestacao;

public class ContratoServico {
	
	private ServicoPagamentoOnline spo;
	
	public ContratoServico() {		
	}

	public ContratoServico(ServicoPagamentoOnline spo) {
		this.spo = spo;
	}
	
	public void processandoContrato(Contrato contrato, Integer meses) {
		Double valorTotalContrato = contrato.getValorTotalContrato() / meses;
		for (int i = 1; i <= meses; i++) {
			Date data = adicionaMes(contrato.getDataContrato(), i);
			Double valorComJuros = valorTotalContrato + spo.juros(valorTotalContrato, i);
			Double valorComTaxa = valorComJuros + spo.taxaPagemento(valorComJuros);
			Prestacao prestacao = new Prestacao(data, valorComTaxa);
			contrato.adicionaPrestacao(prestacao);
		}
		
	}
	
	private Date adicionaMes(Date data, int meses) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.MONTH, meses);
		return calendario.getTime();		
	}
	
	
	

}
