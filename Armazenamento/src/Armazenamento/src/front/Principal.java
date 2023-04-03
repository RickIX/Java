package front;

import entidades.Armazenamento;
import negocio.ArmazenamentoNegocio;
import persistencia.ArmazenamentoPersistencia;

public class Principal {

	public static void main(String[] args) {
		int op;
		float valor;
		Armazenamento armazenamento;
		do {
			System.out.println("1 - Criar objeto de armazenamento\r\n" + "2 - Gravar dados\r\n" + "3 - Apagar dados\r\n"
					+ "4 - Verificar espaço disponível" + "5 - Sair");
			op = Console.readInt();
			switch (op) {
			case 1:
				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento(Console.readString("Informe o tipo do objeto de armazenamento\\r\\n "
						+ "(PEN DRIVE, CD, DVD, HD, GOOGLE DRIVE, DROPBOX, etc. "));
				armazenamento.setQuantidadeGB(Console.readFloat("Qual a capacidade de armazenamento da unidade (GB)"));

				if (ArmazenamentoPersistencia.buscarVolume(armazenamento) == null) {
					ArmazenamentoPersistencia.adicionarNaColecao(armazenamento);
				} else {
					System.out.println("O Armazenamento informado já existe.");
				}
				break;

			case 2:
				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento(Console.readString("Qual Armazenameto deseja usar: "));
				// armazenamento.(Console.readString("Unidade de medida para o armazenamento
				// (bytes, kbytes, mbytes, gbytes): "));
				
				if (ArmazenamentoPersistencia.buscarVolume(armazenamento) != null) {
					valor = Console.readFloat("Informe a qunatia de dados a ser gravada");
					if (ArmazenamentoNegocio.verificarEspaco(armazenamento, valor) == true) {
						ArmazenamentoNegocio.gravarDados(armazenamento, valor);
						ArmazenamentoPersistencia.atualizarColecao(armazenamento);
						System.out.println("Dados salvos!");
					} else {
						System.out.println("O valor informado excede o espaco disponivel.");
					}
				} else {
					System.out.println("O armazenamento não existe.");
				}
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;
			}
		} while (op != 5);

	}

}
