package ut3.EPSAMEN;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

class ValidarDatosTest {

    @Test
    void validarGenero() {
        String genre = "H";
        boolean resultado = ValidarDatos.validarGenero(genre);
        assertTrue(resultado);

    }

    @Test
    void validarGeneroY() {
        String genre = "Y";
        boolean resultado = ValidarDatos.validarGenero(genre);
        assertFalse(resultado);

    }

    @Test
    void testValidarFecha5102024(){
        String fecha="5/10/2024";
        boolean resultado = ValidarDatos.validarFecha(fecha);
        assertFalse(resultado);
    }

    @Test
    void testValidarFecha22032024(){
        String fecha="22/03/2024";
        boolean resultado = ValidarDatos.validarFecha(fecha);
        assertTrue(resultado);
    }

    @Test
    void testValidarTelefono123456789(){
        String tlf="123456789";
        boolean resultado = ValidarDatos.validarTelefono(tlf);
        assertTrue(resultado);
    }

    @Test
    void testValidarTelefonoJKLM4NOPQ(){
        String tlf="JKLM4NOPQ";
        boolean resultado = ValidarDatos.validarTelefono(tlf);
        assertFalse(resultado);
    }


}