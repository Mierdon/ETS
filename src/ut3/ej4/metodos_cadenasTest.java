package ut3.ej4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

public class metodos_cadenasTest {

    @Test
    public void calculomitad() {
        String cadena="qwerty";
        String resultado = metodos_cadenas.imprimemitad(cadena);
        assertEquals("rty", resultado);
    }

    @Test
    public void calculoultimo() {
        String cadena="qwerty";
        char resultado = metodos_cadenas.imprimeultimo(cadena);
        assertEquals('y', resultado);

    }

    @Test
    public void calculoalreves() {
        String cadena="qwerty";
        String resultado = metodos_cadenas.imprimealreves(cadena);
        assertEquals("ytrewq",resultado);
    }

    @Test
    public void convierteagiones() {
        String cadena="qwerty";
        String resultado = metodos_cadenas.imprimegiones(cadena);
        assertEquals("q-w-e-r-t-y",resultado);
    }

    @Test
    public void calculavocales() {
        String cadena="qwerty";
        int resultado = metodos_cadenas.calculavocales(cadena);
        assertEquals(1,resultado);
    }
    @Test
    public void esvocal(){
        char caracter ='a';
        boolean resultado = metodos_cadenas.esvocal(caracter);
        assertTrue(resultado);
    }
}