package services;

public class PaypalService implements ServicoPagamentoOnline {

	public static final double TAXA_PAGAMENTO =	0.02;
	public static final double JUROS = 0.01;
	
	@Override
	public Double taxaPagemento(Double valor) {		
		return TAXA_PAGAMENTO * valor;
	}

	@Override
	public Double juros(Double valor, Integer meses) {		
		return JUROS * valor * meses;
	}

}
