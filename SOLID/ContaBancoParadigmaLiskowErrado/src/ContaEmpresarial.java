
public class ContaEmpresarial extends Conta {
	private double chequeEspecial;

	public ContaEmpresarial(String nroConta, double saldo, double chequeEspecial) {
		super(nroConta, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public boolean saque (double valor) {
		super.setSaldo(super.getSaldo() + this.chequeEspecial);
		if(valor <=super.getSaldo()) {

			super.setSaldo(super.getSaldo() - valor); 
			System.out.println("Saque realizado com sucesso!");
			return true;}

		System.out.println("Saque n�o realizado! Valor insuficiente!");
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {

			super.setSaldo(super.getSaldo() + valor);
			System.out.println("Deposito realizado com sucesso!");
			return true;
		}

		System.out.println("Deposito n�o realizado! Valor deve ser superior a 0");
		return false;
	}

	@Override
	public boolean transferir( double valor) {
		if(valor > 0 && valor < super.getSaldo()) {

			super.setSaldo(super.getSaldo() - valor);

			System.out.println("Transf�ncia realizada com sucesso!");
			return false;}

		System.out.println("Transfer�ncia n�o realizada! Saldo da conta oriente insuficiente! ");
		return false;
	}
}




