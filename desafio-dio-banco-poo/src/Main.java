public class Main {
	public static void main(String[] args) {
		Cliente nomeCliente = new Cliente();
		nomeCliente.setNome("Lucas");		
		Conta cc = new ContaCorrente(nomeCliente);
		Conta poupanca = new ContaPoupanca(nomeCliente);
		cc.depositar(1000);
		cc.transferir(100, poupanca);		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}