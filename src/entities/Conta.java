package entities;

public class Conta {
	
	private String numeroConta;
	private String titular;
	private double saldo;
	
	
	/* não fazer o construtor vazio, obrigado a setar um numero da conta e nome ao instanciar uma conta
	public Conta () {
		
	}
	*/
	
	// não é obrigado a fazer um deposito inicial
	public Conta (String numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.0;
		
	}

	public Conta(String numeroConta, String titular, double depositoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;		
		this.deposito(depositoInicial); //acrescentar o valor do deposito na conta
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	/* Não pode alterar o numero da conta depois de instanciar
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	*/

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void deposito(double valor) {
		this.saldo += valor;
		System.out.println("\nDepósito do valor " + valor + " realizado com sucesso na conta do titular " + this.getTitular() + ".\n"
				+ "Seu saldo agora é " + String.format("R$ %.2f", this.saldo));
	}
	
	public void saque(double valor) {
		double taxaSaque = 5.0;
		if (this.saldo > (taxaSaque + valor)) {
			this.saldo = this.saldo - taxaSaque -  valor;
			System.out.println("\nSaque do valor " + valor + " realizado com sucesso na conta do titular " + this.getTitular() + ".\n"
					+ "Seu saldo agora é " + String.format("R$ %.2f", this.saldo));
		} else {
			System.out.println("\nVocê não tem saldo para realizar essa operação de sacar " + valor 
					+ "\nA taxa de saque é " + taxaSaque + " e o seu saldo na conta é " + this.getSaldo() );
		}
		
	}

	@Override
	public String toString() {
		return "Conta [numeroConta =" + numeroConta 
				+ ", titular =" + titular 
				+ ", saldo =" + String.format("R$ %.2f", saldo) 
				+  "]";
	}

	/* Não pode setar um novo deposito incial, ou depositou na hora de criar a conta ou não depositou
	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	*/	

}
