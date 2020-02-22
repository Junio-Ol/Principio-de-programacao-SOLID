

public class ContaEmpresarial extends Conta {

	private String nroConta;
	private double saldo;


	public ContaEmpresarial(String nroConta, double saldo, String nroConta2, double saldo2) {
		super(nroConta, saldo);
		nroConta = nroConta2;
		saldo = saldo2;
	}

	@Override
	public boolean saque (double valor, double ChequeEspecial) {
		this.saldo=this.saldo+ChequeEspecial;
		if(valor <=this.saldo) {

			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso!");
			return true;}

		System.out.println("Saque n�o realizado! Valor insuficiente!");
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {

			this.saldo+= valor;
			System.out.println("Deposito realizado com sucesso!");
			return true;
		}

		System.out.println("Deposito n�o realizado! Valor deve ser superior a 0");
		return false;
	}

	@Override
	public boolean transferir( double valor) {
		if(valor > 0 && valor < this.saldo) {

			this.saldo -=valor;

			System.out.println("Transf�ncia realizada com sucesso!");
			return false;}

		System.out.println("Transfer�ncia n�o realizada! Saldo da conta oriente insuficiente! ");
		return false;
		}
}




