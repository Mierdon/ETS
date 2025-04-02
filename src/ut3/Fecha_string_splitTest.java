package ut3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fecha_string_splitTest {
    @Test
    public void testFecha() {
        int resultado=Fecha_string_split.fecha(04,05,1789);
assertEquals(4051789, resultado);

    }
    @Test
    public void testFecha1() {
        int resultado=Fecha_string_split.fecha(05,06,2018);
        assertEquals(5062018, resultado);
    }
    @Test
    public void testFecha2() {
        int resultado=Fecha_string_split.fecha(11,02,2011);
        assertEquals(11022011, resultado);
    }
    
}
