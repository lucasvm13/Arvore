package arvore;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Arvore arvore = new Arvore();

		No no1 = new No(5);
		No no2 = new No(10);
		No no3 = new No(15);
		No no4 = new No(20);
		No no5 = new No(40);
		No no6 = new No(60);

		// PAI - FILHO
		arvore.InsereNaArvore(null, no1);
		arvore.InsereNaArvore(no1, no2);
		arvore.InsereNaArvore(no2, no3);
		arvore.InsereNaArvore(no1, no4);
		arvore.InsereNaArvore(no1, no5);
		arvore.InsereNaArvore(no1, no6);

		// RETORNA TODOS OS NÓS
		ArrayList<No> listaNos = arvore.retornaTodosNos();
		System.out.println("Nó raiz: " + arvore.noRaiz());

		System.out.println(" ");

		System.out.print("Retornando todos os nós: ");
		for (No n : listaNos) {
			System.out.print(n.valor + " ");
		}

		System.out.println(" ");

		System.out.println(" ");

		// RETORNA OS FILHOS DE UM NÓ
		arvore.retornaFilhosDeUmNo(no1);
		arvore.retornaFilhosDeUmNo(no2);
		arvore.retornaFilhosDeUmNo(no3);
		arvore.retornaFilhosDeUmNo(no4);
		arvore.retornaFilhosDeUmNo(no5);
		arvore.retornaFilhosDeUmNo(no6);
		System.out.println(" ");

		// VERIFICA NÓ INTERNO
		if (arvore.VerificaNoInterno(no1)) {
			System.out.println("É no interno !");
		} else {
			System.out.println("Não é no interno !");
		}

		System.out.println(" ");

		// VERIFICA NÓ EXTERNO
		if (arvore.VerificaNoExterno(no2)) {
			System.out.println("É no externo !");
		} else {
			System.out.println("Não é no externo !");
		}

		System.out.println(" ");

		// VERIFICA O NO DO PAI
		System.out.println("Pai do nó: " + arvore.retornaPai(no2));

		System.out.println(" ");

		if (arvore.verificaRaiz(no1)) {
			System.out.println("É no raiz !");
		} else {
			System.out.println("Não é no raiz !");
		}

	}

}
