package ut3.EPSAMEN;

import org.junit.jupiter.api.Test;
import ut3.ej4.metodos_cadenas;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    public void ingreso(){
        Cuenta cuenta = new Cuenta("123", 1234.0);
        int cantidadsuma=3500;
        double resultado = Cuenta.Deposito(cantidadsuma);
        assertEquals(4734,  resultado);

    }

    @Test
    public void ingreso150(){
        Cuenta cuenta = new Cuenta("123", 1234.0);
        double cantidadsuma=150.33;
        double resultado = Cuenta.Deposito(cantidadsuma);
        assertEquals(1384.33,  resultado);

    }

    @Test
    public void retiro(){
        Cuenta cuenta = new Cuenta("123", 1234.0);
        double cantidadresta=1000;
        double resultado = Cuenta.Retiro(cantidadresta);
        assertEquals(234,  resultado);
    }

    @Test
    public void retiromayor(){
        Cuenta cuenta = new Cuenta("123", 1234.0);
        double cantidadresta=1235;
        double resultado = Cuenta.Retiro(cantidadresta);
        assertEquals(-1,  resultado);
    }

}