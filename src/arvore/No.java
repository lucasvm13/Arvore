package arvore;

import java.util.ArrayList;

public class No {

	int valor;
	No pai;
	ArrayList<No> filhos;

	public No(int valor) {
		pai = null;
		filhos = new ArrayList<No>();
		this.valor = valor;
	}

}
