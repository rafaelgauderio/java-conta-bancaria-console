package entities;

public class Conta {
	
	private String numeroConta;
	private String titular;
	private double saldo;
	private double depositoInicial=0; //inicia com zero se não houver deposito
	
	/* não fazer o construtor vazio, obrigado a setar um numero da conta e nome ao instanciar uma conta
	public Conta () {
		
	}
	*/
	
	// não é obrigado a fazer um deposito inicial
	public Conta (String numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.0;
		depositoInicial = 0.0;
	}

	public Conta(String numeroConta, String titular, double depositoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;		
		this.depositoInicial = depositoInicial;
		this.saldo = depositoInicial;
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

	/* não pode setar o saldo da conta, só movimentar por deposito ou por saque
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
		System.out.println("\nDepósito do valor " + valor + " realizado com sucesso na conta do titular " + this.getTitular());
	}
	
	public void saque(double valor) {
		double taxaSaque = 5.0;
		if (this.saldo > (taxaSaque + valor)) {
			this.saldo = this.saldo - taxaSaque -  valor;
			System.out.println("\nSaque do valor " + valor + " realizado com sucesso na conta do titular " + this.getTitular());
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
				+ ", depositoInicial =" + String.format("R$ %.2f", depositoInicial) + "]";
	}

	/* Não pode setar um novo deposito incial, ou depositou na hora de criar a conta ou não depositou
	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	*/	
	
	
	
	
	
	

}
