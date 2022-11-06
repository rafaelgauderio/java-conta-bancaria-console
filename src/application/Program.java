package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Conta c1 = new Conta("corrente25465", "Rafael de Luca",400.50);
		Conta c2 = new Conta("corrente94876","Juliana da Silva");
		
		System.out.println("\nImprimindo dados das contas\n");
		System.out.println(c1);
		System.out.println(c2);
		
		c1.deposito(900);
		c2.deposito(600.50);
		c1.saque(60.50);
		c2.saque(599.00);
		
		
		Scanner input = new Scanner(System.in);
		Conta c3 = new Conta("poupança25109", null);
		System.out.print("\nConfirme o seu nome como correntistas: ");
		String nome = input.nextLine();		
		c3.setTitular(nome);
		System.out.print("Deseja fazer um depósito inicial: (s/n)");
		char resposta = input.next().charAt(0);
		if (resposta =='s' || resposta =='S') {
			System.out.print("Informe o valor do Deposito: ");
			double depositoInicial = input.nextDouble();
			c3.deposito(depositoInicial);
		}
		
		
		System.out.println("\nImprimindo valores após saques e depósitos");
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		for (Conta apelido: lista) {
			System.out.println(apelido);
		}
		
		input.close();
				
		
	}

}
