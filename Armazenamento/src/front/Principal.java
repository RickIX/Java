package front;
import entidades.Armazenamento;
import persistencia.ArmazenamentoPersistencia;
public class Principal {

	public static void main(String[] args) {
		int op;
		Armazenamento armazenamento;
		do {
			System.out.println("1 - Criar objeto de armazenamento\r\n"
					+ "2 - Gravar dados\r\n"
					+ "3 - Apagar dados\r\n"
					+ "4 - Verificar espaço disponível"
					+ "5 - Sair");
			op = Console.readInt();
			switch (op) {
			case 1:
				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento(Console.readString("Informe o tipo do objeto de armazenamento\\r\\n "
						+ "(PEN DRIVE, CD, DVD, HD, GOOGLE DRIVE, DROPBOX, etc. "));
				armazenamento.setQuantidadeGB(Console.readFloat("Qual a capacidade de armazenamento da unidade (GB)"));
				
				ArmazenamentoPersistencia.adicionarNaColecao(armazenamento);
				
				break;
			
			
			case 2:
				
				break;
		
			case 3:
				break;
				
				
			case 4:
				break;
				
				
			case 5:
				break;
			}
		}while (op != 5);
		

	}

}
