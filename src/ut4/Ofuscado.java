package ut4;
 import java.io.BufferedReader;
 import java.io.IOException; import
        java.util.Scanner;
public class Ofuscado {
    public static void leerString (String leido) {
        System.out.println(leido);
    }

    public static int factorizacion (int operando) {
        if (operando == 0) { return 1;
        } else
        {
            int base = 1;
            int auxiliar = operando;
            do {
                base *= auxiliar;
                auxiliar--;
            } while (auxiliar > 0);

            return base;
        }
}

    public static String palindromos (String original) {
        String concatenador = "";
        int contador = 0;
            do{
                concatenador = original.charAt(contador) + concatenador;
                contador++;
        }while(contador < original.length());
        concatenador = original + concatenador;
        return concatenador;
}
public static int imprimirMENU(Scanner teclado){
        int seleccion;

            leerString("BIENVENIDO AL PROGRAMA OFUSCADO");
            leerString("-------------------------------");
            leerString("Elija una opcion:");
            leerString("1) ADIVINA QUÉ HACE (factoriza un numero)");
            leerString("2) ADIVINA QUÉ HACE (crea un palindromo)");
            leerString("3) ADIVINA QUÉ HACE (termina la ejecucion)");
            System.out.print(">");
            seleccion=teclado.nextInt();
            teclado.nextLine();//limpio el buffer de entrada
            return seleccion;


    }

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int seleccion;
        do {
            seleccion=imprimirMENU(teclado);

            if (seleccion == 1) {
                leerString("Inserte un número:");
                String factor = teclado.nextLine();
                int resultado = factorizacion(Integer.parseInt(factor));
                teclado.nextLine();//limpio el buffer de entrada
                leerString("El resultado es:");
                leerString("" + resultado);
            } else {
                if (seleccion == 2) {
                    leerString("Inserte una palabra:");
                    String palabra;
                    String resultado = palindromos(palabra = teclado.nextLine());
                    teclado.nextLine();//limpio el buffer de entrada
                    leerString("El resultado es:");
                    leerString("" + resultado);
                }
            }
        }
        while
        (seleccion != 3);
        teclado.close();
    }
}
