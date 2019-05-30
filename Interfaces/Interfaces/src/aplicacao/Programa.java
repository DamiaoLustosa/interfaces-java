package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.AlugaCarro;
import entidades.Veiculo;
import servicos.ServicoAluguel;
import servicos.TaxaServicos;


public class Programa {
	public static void main (String args[]) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:ss");
		System.out.println("Entre com os dados do aluguel! ");
		System.out.println("Modelo do Carro: ");
		String car = sc.nextLine();
		System.out.print("Data de aluguel (dd/MM/yyyy hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Data Retorno (dd/MM/yyyy hh:ss)");
		Date fim = sdf.parse(sc.nextLine());
		
		AlugaCarro alugCar = new AlugaCarro(inicio, fim, new Veiculo(car));
		
		System.out.print("Informe o preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Informe o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel servAlug = new ServicoAluguel(precoDia, precoHora, new TaxaServicos());
		servAlug.processaFatura(alugCar);
		
		
		System.out.print("FATURA: ");
		
		System.out.print("Pagamento Base: " + String.format("%.2f", alugCar.getFatura().getValorBase()));
		System.out.print("Taxa: " + String.format("%.2f", alugCar.getFatura().getTaxa()));
		System.out.print("Pagamento Total: " + String.format("%.2f", alugCar.getFatura().getPagamentoTotal()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
