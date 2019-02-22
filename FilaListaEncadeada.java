package Tarefa;

public class FilaListaEncadeada {
	
	private Node inicio;
	
	public void enfileirar(Object o) {
		Node novo = new Node();
		novo.setElemento(o);
		novo.setProximo(null);
		
		if(inicio == null) {
			inicio = novo;
		}
		else {
			Node aux;
			aux = inicio;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
	
	public Object desenfileirar() {
		if(inicio != null) {
			Node aux = inicio;
			Object o = aux.getElemento();
			inicio = aux.getProximo();
			return o;
		}
		else {
			throw new RuntimeException("Lista vazia!");
		}
	}
	
public int tamanho() {
		
		if (inicio == null) {
			return 0;
		}
		
		int tamanho = 1;
		Node auxiliar = inicio;
		while (auxiliar.getProximo() != null) {
			auxiliar = auxiliar.getProximo();
			tamanho++;
		}

		return tamanho;
	}

class Node {
	
		private Object elemento;
		private Node proximo;
		
		public void setElemento(Object elemento) {
			this.elemento = elemento;
		}
		
		public Object getElemento() {
			return this.elemento;
		}
		
		public void setProximo(Node proximo) {
			this.proximo = proximo;
		}
		
		public Node getProximo() {
			return this.proximo;	
		}
	}
}
