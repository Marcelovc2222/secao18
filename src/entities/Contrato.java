package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	Integer numeroContrato;
	Date dataContrato;
	Double valorTotalContrato;
	
	List<Prestacao> prestacoes = new ArrayList<Prestacao>();
	
	public Contrato() {		
	}

	public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}
	
	public void adicionaPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}
	
	public void removePrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}
	
	

}
