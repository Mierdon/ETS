package ut3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ut3_unoTest {
    float año1=2013,año2=2012,año3=1700,año4=2000;
    @Test 
    public void testNo4No100() {
        boolean resultado = ut3_uno.bisisesto(año1);
        
        assertFalse(resultado);
    }
    @Test
    public void testSi4No100() {
        boolean resultado = ut3_uno.bisisesto(año2);
        
        assertTrue(resultado);
    } 
    @Test
    public void testSi4Si100() {
        boolean resultado = ut3_uno.bisisesto(año3);
        
        assertFalse(resultado);
    }
    @Test
    public void testSi100Si400() {
        boolean resultado = ut3_uno.bisisesto(año4);
        
        assertTrue(resultado);
    }
}
