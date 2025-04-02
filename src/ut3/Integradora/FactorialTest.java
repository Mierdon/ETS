package ut3.Integradora;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void compruebaPositivo() {
        boolean resultado = Factorial.esUnNumeroEnteroPositivo("54");
        assertTrue(resultado);
    }
    @Test
    void compruebaNegativo() {
        boolean resultado = Factorial.esUnNumeroEnteroPositivo("-54");
        assertFalse(resultado);
    }
    @Test
    void compruebaConLetra() {
        boolean resultado = Factorial.esUnNumeroEnteroPositivo("asdfg");
        assertFalse(resultado);
    }

    @Test
    void Test_factorial10(){
        int resultado = Factorial.factorial(10);
        assertEquals(3628800, resultado);
    }
    @Test
    void Test_factorial15(){
        int resultado = Factorial.factorial(9);
        assertEquals(362880,resultado);
    }
    @Test
    void Test_factorialNegativo(){
        int resultado = Factorial.factorial(-7);
        assertEquals(1,resultado); //es uno por que la variable resultado esta inicializada a un y es la por defecto
    }
}