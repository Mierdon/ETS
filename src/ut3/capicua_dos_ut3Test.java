package ut3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class capicua_dos_ut3Test {
   @Test
    public void testCrearCapicua() {
        String dato =capicua_dos_ut3.crearCapicua(48);
        assertEquals("48xx84", dato);
    }

    @Test
    public void testDarLaVuelta() {
        int dato=capicua_dos_ut3.darLaVuelta(66666);
        
        assertEquals(66666, dato);
    }

    @Test
    public void testEsCapicua() {
        boolean resultado = capicua_dos_ut3.esCapicua(55555);
        assertTrue(resultado);
    }
}
