package com.ueg;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void testadicionarLivro() {
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("O Hobbit");
        assertTrue(biblioteca.listarLivros().contains("O Senhor dos Anéis"));
        assertTrue(biblioteca.listarLivros().contains("O Hobbit"));
    }

    @Test
    public void testremoverLivro() {
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("O Hobbit");
        assertTrue(biblioteca.listarLivros().contains("O Senhor dos Anéis"));
        biblioteca.removerLivro("O Senhor dos Anéis");
        assertFalse(biblioteca.listarLivros().contains("O Senhor dos Anéis"));
    }

    @Test
    public void testlistarLivro() {
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("O Hobbit");
        assertTrue(biblioteca.listarLivros().contains("O Senhor dos Anéis"));
        assertTrue(biblioteca.listarLivros().contains("O Hobbit"));
    }

    @Test
    public void testListarLivroThrows() {
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("O Hobbit");
        assertThrows(UnsupportedOperationException.class, () -> {
            biblioteca.listarLivros().add("Novo livro");
        });
    }
}
