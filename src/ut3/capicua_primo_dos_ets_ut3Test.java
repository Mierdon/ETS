package ut3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class capicua_primo_dos_ets_ut3Test {
    @Test
    public void testNumeroCapicua() {
        boolean resultado = capicua_primo_dos_ets_ut3.numeroCapicua(4455);
        assertFalse(resultado);

    }

    @Test
    public void testNumeroPrimo() {
        boolean resultado = capicua_primo_dos_ets_ut3.numeroPrimo(8);
        assertFalse(resultado);

    }
    @Test
    public void testNumeroCapicua2() {
        boolean resultado = capicua_primo_dos_ets_ut3.numeroCapicua(552255);
        assertTrue(resultado);

    }

    @Test
    public void testNumeroPrimo2() {
        boolean resultado = capicua_primo_dos_ets_ut3.numeroCapicua(131);
        assertTrue(resultado);

    }
}
