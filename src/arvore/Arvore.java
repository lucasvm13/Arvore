package arvore;

import java.util.ArrayList;

public class Arvore {

	private No raiz;

	public int noRaiz() {
		return raiz.valor;
	}

	public ArrayList<No> retornaTodosNos() {
		ArrayList<No> lista = new ArrayList<No>();
		lista.add(raiz);
		int i = 0;
		while (i < lista.size()) {
			No atual = lista.get(i);
			for (No no : atual.filhos) {
				lista.add(no);
			}
			i++;
		}
		return lista;
	}

	public ArrayList<No> retornaFilhosDeUmNo(No no) {
		ArrayList<No> listaNos = no.filhos;
		System.out.print("Filhos do nó " + no.valor + " : ");
		for (No n : listaNos) {

			System.out.print(n.valor + " ");
		}

		if (listaNos.size() <= 0) {
			System.out.print(" Esse nó não tem filhos ! ");
		}

		System.out.println(" ");
		return listaNos;
	}

	public ArrayList<No> filhos() {
		return raiz.filhos;
	}

	public Arvore() {
		raiz = null;
	}

	public void InsereNaArvore(No pai, No filho) {
		if (pai == null) {
			raiz = filho;
		} else {
			filho.pai = pai;
			pai.filhos.add(filho);
		}
	}

	public boolean VerificaNoInterno(No no) {
		if (no.filhos.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean VerificaNoExterno(No no) {
		if (no.filhos.size() <= 0) {
			return true;
		}
		return false;
	}

	public int retornaPai(No no) {
		return no.pai.valor;

	}
	
	public boolean verificaRaiz(No no) {
		if(no.pai==null) {
			return true;
		}
		return false;
	}
}
