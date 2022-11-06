package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
		
		
		System.out.println("\nImprimindo valores após saques e depósitos");
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(c1);
		lista.add(c2);
		
		for (Conta apelido: lista) {
			System.out.println(apelido);
		}
		
		
				
		
	}

}
