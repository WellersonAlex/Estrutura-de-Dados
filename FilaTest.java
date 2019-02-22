package Tarefa;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilaTest {


	@Test
	public void fifo() {
		FilaListaEncadeada fila = new FilaListaEncadeada();
		fila.enfileirar("a");
		fila.enfileirar("b");
		fila.enfileirar("c");
		
		assertEquals("a", fila.desenfileirar());
		assertEquals("b", fila.desenfileirar());
		assertEquals("c", fila.desenfileirar());
	}

	@Test
	public void misturado() {
		FilaListaEncadeada fila = new FilaListaEncadeada();
		fila.enfileirar("a");
		fila.enfileirar("b");
		
		assertEquals("a", fila.desenfileirar());

		fila.enfileirar("c");
		
		assertEquals("b", fila.desenfileirar());
		assertEquals("c", fila.desenfileirar());
	}
	
	@Test
	public void tamanho() {
		FilaListaEncadeada fila = new FilaListaEncadeada();
		assertEquals(0, fila.tamanho());
		
		fila.enfileirar("a");
		assertEquals(1, fila.tamanho());
		fila.enfileirar("b");
		fila.enfileirar("c");
		assertEquals(3, fila.tamanho());
		
		assertEquals("a", fila.desenfileirar());
		assertEquals(2, fila.tamanho());
		assertEquals("b", fila.desenfileirar());
		assertEquals("c", fila.desenfileirar());
		assertEquals(0, fila.tamanho());
	}
	
	@Test
	public void circular() {
		FilaListaEncadeada fila = new FilaListaEncadeada();
		fila.enfileirar("a");
		fila.enfileirar("b");
		
		assertEquals("a", fila.desenfileirar());

		fila.enfileirar("c");
		fila.enfileirar("d");
		fila.enfileirar("e");
		fila.enfileirar("f");
		
		assertEquals("b", fila.desenfileirar());
		assertEquals("c", fila.desenfileirar());
		
		assertEquals(3, fila.tamanho());
	}
	
	@Test
	public void estouro() {
		FilaListaEncadeada fila = new FilaListaEncadeada();
		fila.enfileirar("a");
		fila.enfileirar("b");
		
		assertEquals("a", fila.desenfileirar());

		fila.enfileirar("c");
		fila.enfileirar("d");
		fila.enfileirar("e");
		fila.enfileirar("f");
		fila.enfileirar("g");
		fila.enfileirar("h");
		
		assertEquals("b", fila.desenfileirar());
		assertEquals("c", fila.desenfileirar());
		
		assertEquals(5, fila.tamanho());
	}
}
