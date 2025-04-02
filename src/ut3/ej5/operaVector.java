package ut3.ej5;

import java.util.Random;
import java.util.Scanner;

public class operaVector {
    public static void main(String[] args) {
        int[] numeros = generaNumeros();
        imprimeNumeros("Numeros del sorteo; ", numeros);
        //Promedio
        System.out.println("Promedio -->"+promedio(numeros));
        //Maximo
        System.out.println("Maximo -->"+maximo(numeros));
        //Minimo
        System.out.println("Minimo -->"+minimo(numeros));
    }//David Rodriguez Castellano
private static int [] generaNumeros(){
        Random alea = new Random();
        Scanner tec = new Scanner(System.in);
        System.out.println("introduce la cantidad de numeros:"); //añadi : para mas esteticidad
        int n = tec.nextInt();
        int [] num = new int[n];
        for (int i = 0; i<num.length; i++){ //Elimine un "="
            num[i] = alea.nextInt(100);
        }
        return num;
}
private static void imprimeNumeros(String mesg, int [] nume){
        System.out.println(mesg);
        for (int i=0; i<nume.length; i++){//Elimine un "="
            System.out.print(nume[i]+" ");
        }
        System.out.println();
}
private static int promedio(int[] nums){
        int acumula = 0;
        for (int i = 0; i<nums.length;i++){//Elimine un "="
            acumula = acumula + nums[i];
        }
    return acumula /nums.length; //El IDE me dio una advertencia de que el codigo era redundante y lo que podia hacer era mandar el resultado directo de la operacion
                                 //Lo dejare asi para una mejor optimizaciond el codigo
    }
private static  int maximo(int []nums){
        int max =0;
        for (int i=0; i<nums.length; i++){//Elimine un "="
            if (nums[i]>max){//Estaba del reves, por lo que el valor nunca se cambiaba
                max=nums[i];
            }
        }
        return  max;
    }
private static int minimo(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< nums.length; i++){//Elimine un "="
            if (nums[i]<min){//Estaba del reves, por lo que el valor nunca se cambiaba
                min = nums[i];
            }
        }
        return min;
}



}
