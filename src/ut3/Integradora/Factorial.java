package ut3.Integradora;

public class Factorial {
    public static  boolean esUnNumeroEnteroPositivo(String dato){
        for (int i = 0; i<dato.length(); i++){ //añadi un +
            if(!Character.isDigit(dato.charAt(i))){
                return false;
                //aqui habia un break que no era alcanzable dado que el return estaba antes
            }
        }
        return  true;
    }
    public static int factorial (int numero){
        int resultado=1; // resultado no habia sido declarado, lo inicializoa uno por que si lo hago a cero va a dar 0 todo el rato
        if (numero > 1){ //el if va entero en minuscula no asi: iF
                int cuenta = numero;
                while (cuenta>0){
                    resultado *=cuenta;
                    cuenta--;
                }
        }
        return resultado;
    }
public static void main(String[] args){
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        String sNumero;
        do {
            System.out.print("Indique un numero entero positivo: ");
            sNumero=teclado.next();
        }while(!esUnNumeroEnteroPositivo(sNumero));
        int numero = Integer.parseInt(sNumero);

        int resultado = factorial(numero);

        System.out.println("El factorial de "+numero+" es "+resultado);

    }
}
