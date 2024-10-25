package org.factoriaf5.java_list;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ListasTest {
    private List<String> dias;
    private Listas listas;
    @BeforeEach
    public void init() {
        this.listas = new Listas();
        this.dias = listas.diasSemana();
    }
    @Test
    public void verificarRetorno () {
        assertInstanceOf(List.class, dias);
    }
    @Test
    public void largoListatest () {
        assertEquals(7, listas.largoLista(dias));
        assertInstanceOf(Integer.class, listas.largoLista(dias));
    }
    @Test
    public void eliminarDiatest () {
        assertEquals(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"), listas.eliminarDia(dias, 6));
    }
    @Test
    public void retornarDia_DiaExistente() {
        String resultado = listas.retornarDia(dias, "Martes");
        assertEquals("Martes", resultado);
    }
    @Test
    public void retornarDia_DiaNoExistente() {
        String resultado = listas.retornarDia(dias, "OtroDomingo");
        assertEquals("El dia no se encuentra en la lista", resultado);
    }
    @Test
    public void listaElementosOrdenados() {
        List<String> arancha = Arrays.asList("Sabado", "Viernes");
        List<String> resultado = listas.ordenarLista(arancha);
        assertEquals(Arrays.asList("Sabado", "Viernes"), resultado);
    }

    @Test
    public void testListaDosElementosDesordenados() {
        List<String> dias2 = Arrays.asList("Miercoles", "Martes");
        List<String> resultado = listas.ordenarLista(new ArrayList<>(dias2));
        assertEquals(Arrays.asList( "Martes", "Miercoles"), resultado);
    }

    @Test
    public void VerificarSiOrdena() {
        List<String> resultado = listas.ordenarLista(new ArrayList<>(dias));
        assertEquals(Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miercoles", "Sabado", "Viernes"), resultado);
    }

    @Test
    public void testListaConElementosRepetidos() {
        List<String> dias1 = Arrays.asList("Lunes", "Martes", "Lunes", "Miércoles");
        List<String> resultado = listas.ordenarLista(new ArrayList<>(dias1));
        assertEquals(Arrays.asList("Lunes", "Lunes", "Martes", "Miércoles"), resultado);
    }

    @Test
    public void testListaCadenasVacias() {
        List<String> dias = Arrays.asList("", "Lunes", "Martes", "");
        List<String> resultado = listas.ordenarLista(new ArrayList<>(dias));
        assertEquals(Arrays.asList("", "", "Lunes", "Martes"), resultado);
    }
    @Test
    public void vaciarLista_ListaConElementos() {
        listas.vaciarLista(dias);
        assertTrue(dias.isEmpty());
    }

}
