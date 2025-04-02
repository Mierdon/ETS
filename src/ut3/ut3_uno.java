package ut3;

import java.util.Scanner;

public class ut3_uno {
    public static void main(String[] args) { 
    Scanner teclado = new Scanner (System.in);
        float año;
    System.out.println("Introduzca un año");
    año = intPositivo(teclado);
    if (bisisesto(año)){
        System.out.println("Su año es bisiesto");
    }else{
        System.out.println("Su año NO es bisiesto");
    }
    




    }
    public static boolean bisisesto (float año){
        
        if (año%4==0 && año%100!=0){
            return true;
        }
        if(año%100==0 && año%400==0){
            return true;        
        }
            return false;
    }
    public static float intPositivo(Scanner teclado) {
        float numero=0, bucle=0 ;
        do {
            try {
                do {
                numero = teclado.nextFloat();
                bucle++;
                if (numero<=0) {
                    System.out.println("Introduce un valor superior a 0 numerico");
                    bucle=0;
                }
                }while (bucle==0);
            }
            catch (java.util.InputMismatchException ex) {
                 System.out.println("Solo se permiten introducir caracteres numericos positivos");
                 teclado.next();
            }
        }while (bucle==0);
    
        return numero;
    }
}
