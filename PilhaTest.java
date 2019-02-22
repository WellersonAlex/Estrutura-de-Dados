package Tarefa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PilhaTest {

	@Test
	public void lifo() {
		PilhaListaEncadeada pilha = new PilhaListaEncadeada();
		pilha.empilhar("a");
		pilha.empilhar("b");
		pilha.empilhar("c");
		
		assertEquals("c", pilha.desempilhar());
		assertEquals("b", pilha.desempilhar());
		assertEquals("a", pilha.desempilhar());
	}

	@Test
	public void tamanho() {
		PilhaListaEncadeada pilha = new PilhaListaEncadeada();
		assertEquals(0, pilha.tamanho());
		
		pilha.empilhar("a");
		assertEquals(1, pilha.tamanho());
		pilha.empilhar("b");
		pilha.empilhar("c");
		assertEquals(3, pilha.tamanho());
		
		assertEquals("c", pilha.desempilhar());
		assertEquals(2, pilha.tamanho());
		assertEquals("b", pilha.desempilhar());
		assertEquals("a", pilha.desempilhar());
		assertEquals(0, pilha.tamanho());
	}
	
	
	@Test
	public void topo() {
		PilhaListaEncadeada pilha = new PilhaListaEncadeada();
		
		pilha.empilhar("a");
		assertEquals("a", pilha.topo());
		pilha.empilhar("b");
		assertEquals("b", pilha.topo());
		pilha.empilhar("c");
		assertEquals("c", pilha.topo());
		
		assertEquals("c", pilha.desempilhar());
		assertEquals("b", pilha.topo());
		assertEquals("b", pilha.desempilhar());
		assertEquals("a", pilha.topo());
		assertEquals("a", pilha.desempilhar());
	}
	
	@Test
	public void limiteCapacidade() {
		PilhaListaEncadeada pilha = new PilhaListaEncadeada();
		pilha.empilhar("a");
		pilha.empilhar("b");
		pilha.empilhar("c");
		pilha.empilhar("d");
		pilha.empilhar("e");
		pilha.empilhar("f");
		pilha.empilhar("g");
		pilha.empilhar("h");
		pilha.empilhar("i");
		pilha.empilhar("j");
		pilha.empilhar("k");
		
		assertEquals(11, pilha.tamanho());

		
		assertEquals("k", pilha.desempilhar());
		assertEquals("j", pilha.desempilhar());
		assertEquals("i", pilha.desempilhar());
		assertEquals("h", pilha.desempilhar());
		assertEquals("g", pilha.desempilhar());
		assertEquals("f", pilha.desempilhar());
		assertEquals("e", pilha.desempilhar());
		assertEquals("d", pilha.desempilhar());

		assertEquals(3, pilha.tamanho());
	}
}
