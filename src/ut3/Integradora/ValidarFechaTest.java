package ut3.Integradora;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class ValidarFechaTest {
    static String[] diasValidos = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    static String[] mesesValidos = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    @Test
    void  testTieneLongitudCorrecta() {
        boolean resultado = ValidarFecha.tieneLongitudCorrecta("Lunes 15 de enero de 2025");
        assertTrue(resultado);
    }

    @Test
    void testTieneLongitudIncorrecta(){
        boolean resultado = ValidarFecha.tieneLongitudCorrecta("MAL MAL Lunes 15 de enero de 2025");
        assertFalse(resultado);
    }
    @Test
    void testEsNumero(){
        boolean resultado = ValidarFecha.esNumero("89");
        assertTrue(resultado);
    }
    @Test
    void testNoEsNumero(){
        boolean resultado = ValidarFecha.esNumero("PO89");
        assertFalse(resultado);
    }
    @Test
    void testTieneLsongitudIncorrecta(){
        boolean resultado = ValidarFecha.tieneLongitudCorrecta("MAL MAL Lunes 15 de enero de 2025");
        assertFalse(resultado);
    }
    @Test
    void testExistePalabraEnVector(){
        boolean resultado = ValidarFecha.existePalabraEnVector("Febrero",mesesValidos);
        assertTrue(resultado);
    }@Test
    void testNoExistePalabraEnVector(){
        boolean resultado = ValidarFecha.existePalabraEnVector("Febrerrrrrro",mesesValidos);
        assertFalse(resultado);
    }
    @Test
    void testValidarFechaCorrecta(){
        boolean resultado = ValidarFecha.validarFecha("Lunes 15 de enero de 2025");
        assertTrue(resultado);
    }
    @Test
    void testValidarFechaIncorrecta(){
        boolean resultado = ValidarFecha.validarFecha("Lunes 15 de enero 2025");
        assertFalse(resultado);
    }



}