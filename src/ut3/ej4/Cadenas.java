package ut3.ej4;
import java.util.Scanner;

public class Cadenas {
    public static void imprimemitad(String cadena){
        String mitad;
        int dividido = cadena.length()/2;//añadi esta linea para saber donde esta la mitad
        mitad=cadena.substring(dividido,cadena.length()); //añadi la variable que me dice donde esta la mitad
        System.out.println("la mitad de la es -> "+mitad);
    }

    public static void imprimeultimo(String cadena){
    char last;
    last = cadena.charAt(cadena.length()-1);//puse le -1 para que no crashease
    System.out.println("El ultimo caracter es ->"+last);
    }

    public static void imprimealreves(String cadena){
for (int i=cadena.length()-1;i>0;i--){
System.out.print(cadena.charAt(i)); //imprime el texto del reves poniendo i en la posicion de la longitud del string y lo arregle poniendo i-- en ved de i++
        }
System.out.print(cadena.charAt(0));//imprime el valor del primer caracter por que siempre se lo come, entonces lo fuerzo a ponerlo
        System.out.println();
    }
    public static void imprimegiones(String cadena){
        for(int i=0;i<cadena.length();i++){ //el simbolo de menor que estaba del reves
            if (i!=cadena.length()-1){
                System.out.print(cadena.charAt(i)+"-");
            }else{
                System.out.print(cadena.charAt(i));
            }

        }
        System.out.println();
    }
    public static Boolean esvocal(char cara){
        if (cara=='a' || cara=='e' || cara=='i' || cara=='o' || cara=='u' || cara=='A' || cara=='E' || cara=='I' || cara=='O' || cara=='U'){
        return true;
        }else{//el false y el true estaban del reves
            return false;
        }
    }
    public static void calculavocales(String cadena){
        int nvocales=0;
        for(int i =0;i<cadena.length();i++){//estaba bien
            if(esvocal((cadena.charAt(i)))){
                nvocales++;
            }
        }
        System.out.println("El numero de vocales es ->"+nvocales);
    }
public static void main (String [] args){
    Scanner tec = new Scanner(System.in);
    System.out.println("introduce la cadena a analizar");
    String texto =tec.nextLine();
    imprimealreves(texto);
    imprimegiones(texto);
    imprimemitad(texto);
    imprimeultimo(texto);
    calculavocales(texto);
}




}
