package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Prestacao;
import services.ContratoServico;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do contrato: ");
		System.out.print("Numero: ");
		Integer numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/aaaa): ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor total do Contrato: ");
		Double valorTotalContrato = sc.nextDouble();
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorTotalContrato);
		
		
		System.out.print("Numero de prestações: ");
		Integer numeroPretacoes = sc.nextInt();
		
		ContratoServico contratoservico = new ContratoServico(new PaypalService());
		contratoservico.processandoContrato(contrato, numeroPretacoes);
		
		for (Prestacao prestacao : contrato.getPrestacoes()) {
			System.out.println(prestacao);
		}
		
		
		
		
		sc.close();
	}

}
