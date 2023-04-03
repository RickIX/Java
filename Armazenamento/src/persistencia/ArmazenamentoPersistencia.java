package persistencia;
import java.util.HashSet;
import java.util.Set;
import entidades.Armazenamento;

public class ArmazenamentoPersistencia {
	private static Set<Armazenamento> colecao = new HashSet<Armazenamento>();


public static void adicionarNaColecao(Armazenamento x) {
	colecao.add(x);
}

}