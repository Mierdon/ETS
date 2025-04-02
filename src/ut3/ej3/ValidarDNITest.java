package ETS.ut3.ej3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidarDNITest {
    @Test
    public void testValidarDNI1() {
        System.out.println("validarDNI");
        String DNI = "987654321L";
        boolean expResult = false;
        boolean result = ValidarDNI.validarDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
     }
     @Test
     public void testValidarDNI2() {
         System.out.println("validarDNI");
         String DNI = "321U876K";
         boolean expResult = false;
         boolean result = ValidarDNI.validarDNI(DNI);
         assertEquals(expResult, result);
         // TODO review the generated test code and remove the default call to fail.
         //fail("The test case is a prototype.");
      }
      @Test
      public void testValidarDNI3() {
          System.out.println("validarDNI");
          String DNI = "23456789L";
          boolean expResult = false;
          boolean result = ValidarDNI.validarDNI(DNI);
          assertEquals(expResult, result);
          // TODO review the generated test code and remove the default call to fail.
          //fail("The test case is a prototype.");
       }
       @Test
       public void testValidarDNI4() {
           System.out.println("validarDNI");
           String DNI = "34567890V";
           boolean expResult = true;
           boolean result = ValidarDNI.validarDNI(DNI);
           assertEquals(expResult, result);
           // TODO review the generated test code and remove the default call to fail.
           //fail("The test case is a prototype.");
        }

    @Test
    public void testValidarDNI() {
        System.out.println("validarDNI");
        String DNI = "654321V";
        boolean expResult = false;
        boolean result = ValidarDNI.validarDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
     }
     @Test
     public void testValidarmiDNI() {
         System.out.println("validarDNI");
         String DNI = "54147889R";
         boolean expResult = true;
         boolean result = ValidarDNI.validarDNI(DNI);
         assertEquals(expResult, result);
         // TODO review the generated test code and remove the default call to fail.
         //fail("The test case is a prototype.");
      }
}
