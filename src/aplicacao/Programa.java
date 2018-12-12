package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		System.out.print("Entre com o número de pagantes de impostos: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i + ":");
			System.out.print("Pessoa física ou jurídica (f/j)?");
			char ch = sc.next().charAt(0);
			if (ch == 'f') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		double soma = 0.0;
		System.out.println();
		System.out.println("TAXAS PAGAS:");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.Imposto()));
			soma += pessoa.Imposto();
		}
		System.out.println();
		System.out.println("TOTAL DE TAXAS: $ " + String.format("%.2f", soma));
		
		sc.close();
	}

}
