package ut3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UT3_uno_ymedioTest {
    float A=89,B=33,C=0,D=0,E=-23;
    @Test
    public void testEsPrimo() {
        boolean resultado = UT3_uno_ymedio.esPrimo(A);
    assertTrue(resultado);
    }
    @Test
    public void testEsPrimo2() {
        boolean resultado = UT3_uno_ymedio.esPrimo(B);
        assertFalse(resultado);
    }
    @Test
    public void testEsPrimo3() {
        boolean resultado = UT3_uno_ymedio.esPrimo(C);
        assertTrue(resultado);
    }
    @Test
    public void testEsPrimo4() {
        boolean resultado = UT3_uno_ymedio.esPrimo(D);
        assertTrue(resultado);
    }
    @Test
    public void testEsPrimo5() {
        boolean resultado = UT3_uno_ymedio.esPrimo(E);
        assertTrue(resultado);
    }
}
