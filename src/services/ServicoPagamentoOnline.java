package services;

public interface ServicoPagamentoOnline {
	
	public Double taxaPagemento(Double valor);
	public Double juros(Double valor, Integer meses);
}
