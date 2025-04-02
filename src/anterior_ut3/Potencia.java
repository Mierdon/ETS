package anterior_ut3;

import java.util.Scanner;


public class Potencia {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base;
        do {
            System.out.print("Indique la base de la potencia: ");
            base = teclado.nextInt();
        } while (base<=0);
        int exponente;
        do {
            System.out.print("Indique el exponente de la potencia: ");
            exponente = teclado.nextInt();
        } while (exponente<=0);
    teclado.close();
        int resultado = 1;
        int cuenta = 0;
        while (cuenta < exponente) {
            resultado = resultado*base;
            cuenta++;
        }
        System.out.println("La potencia " + base + " elevada a " + exponente +" es " + resultado);
    
    }
    }




