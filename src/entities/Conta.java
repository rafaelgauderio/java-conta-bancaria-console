package entities;

public class Conta {
	
	private String numeroConta;
	private String titular;
	private double saldo;
	private double depositoInicial=0; //inicia com zero se n�o houver deposito
	
	/* n�o fazer o construtor vazio, obrigado a setar um numero da conta e nome ao instanciar uma conta
	public Conta () {
		
	}
	*/
	
	// n�o � obrigado a fazer um deposito inicial
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
	
	/* N�o pode alterar o numero da conta depois de instanciar
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

	/* n�o pode setar o saldo da conta, s� movimentar por deposito ou por saque
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
		System.out.println("\nDep�sito do valor " + valor + " realizado com sucesso na conta do titular " + this.getTitular());
	}
	
	public void saque(double valor) {
		double taxaSaque = 5.0;
		if (this.saldo > (taxaSaque + valor)) {
			this.saldo = this.saldo - taxaSaque -  valor;
			System.out.println("\nSaque do valor " + valor + " realizado com sucesso na conta do titular " + this.getTitular());
		} else {
			System.out.println("\nVoc� n�o tem saldo para realizar essa opera��o de sacar " + valor 
					+ "\nA taxa de saque � " + taxaSaque + " e o seu saldo na conta � " + this.getSaldo() );
		}
		
	}

	@Override
	public String toString() {
		return "Conta [numeroConta =" + numeroConta 
				+ ", titular =" + titular 
				+ ", saldo =" + String.format("R$ %.2f", saldo) 
				+ ", depositoInicial =" + String.format("R$ %.2f", depositoInicial) + "]";
	}

	/* N�o pode setar um novo deposito incial, ou depositou na hora de criar a conta ou n�o depositou
	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	*/	
	
	
	
	
	
	

}
