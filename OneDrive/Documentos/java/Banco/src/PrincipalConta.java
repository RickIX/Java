import java.util.ArrayList;
import java.util.List;

public class PrincipalConta {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		Conta conta;
		
		conta = new Conta("JosÃ©", 1, 1, 1000, 0);
		contas.add(conta);
		
		conta = new Conta();
		conta.setNomeCliente("Maria");
		conta.setNumeroAgencia(2);
		conta.setNumeroConta(2);
		conta.setLimite(2000);
		conta.setSaldo(0);
		contas.add(conta);
		
		conta = new Conta();
		conta.setNomeCliente("Joaquim");
		conta.setNumeroAgencia(3);
		conta.setNumeroConta(3);
		conta.setLimite(3000);
		conta.setSaldo(0);
		contas.add(conta);
		
		/*
		 * Percorrer e acessar os elementos do ArrayList com for
		 */
		/*for(int i = 0; i < contas.size(); i++) {
			System.out.println("Nome do cliente: " + contas.get(i).getNomeCliente());
			System.out.println("AgÃªncia: " + contas.get(i).getNumeroAgencia());
			System.out.println("Conta: " + contas.get(i).getNumeroConta());
			System.out.println("Saldo: " + contas.get(i).getSaldo());
			System.out.println("Limite: " + contas.get(i).getLimite());
			System.out.println("Saldo disponÃ­vel: " + contas.get(i).calcularSaldoDisponivel());
			System.out.println("---------------------------------");
		}*/
		/*
		 * Percorrer e acessar os elementos do ArrayList com foreach
		 */
		for(Conta itemConta: contas) {
			System.out.println("Nome do cliente: " + itemConta.getNomeCliente());
			System.out.println("AgÃªncia: " + itemConta.getNumeroAgencia());
			System.out.println("Conta: " + itemConta.getNumeroConta());
			System.out.println("Saldo: " + itemConta.getSaldo());
			System.out.println("Limite: " + itemConta.getLimite());
			System.out.println("Saldo disponÃ­vel: " + itemConta.calcularSaldoDisponivel());
			System.out.println("---------------------------------");
		}
	}
}