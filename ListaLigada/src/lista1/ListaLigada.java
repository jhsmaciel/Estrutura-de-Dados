package lista1;

public class ListaLigada {
	private No inicio;

	public void adicionaInicio(int novoElemento) {
		No novo = new No(novoElemento);
		novo.prox = inicio;
		inicio = novo;

	}

	public int removeInicio() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Lista vazia cuzão");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}

		return r;
	}

	public String toString() {
		No aux = inicio;
		String c = " ";
		while (aux != null) {
			c = c + " " + aux.dado;
			aux = aux.prox;
		}

		return c;
	}
}