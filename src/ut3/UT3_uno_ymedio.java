package ut3;

import java.util.Scanner;

public class UT3_uno_ymedio {
    public static void main(String[] args) { 
    Scanner teclado = new Scanner (System.in);

    System.out.println("Introduce un numero para comprobar si es primo");
    float numero = Float(teclado);
if (esPrimo(numero)){
System.out.println("Su numero es primo");
}else{
    System.out.println("No es primo");
}
    }
    public static boolean esPrimo(float numeroIntroducido) {
	    for(int i=2;i<numeroIntroducido;i++) {
	        if(numeroIntroducido%i==0)
	            return false;
	    }
	    return true;
	}
    public static float Float(Scanner teclado) {
        float numero=0, bucle=0 ;
        do {
            try {
                do {
                numero = teclado.nextFloat();
                bucle++;
                
                }while (bucle==0);
            }
            catch (java.util.InputMismatchException ex) {
                 System.out.println("Solo se permiten introducir caracteres numericos ");
                 teclado.next();
            }
        }while (bucle==0);
    
        return numero;
    }
}