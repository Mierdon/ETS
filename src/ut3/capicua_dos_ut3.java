package ut3;

import java.util.Scanner;


public class capicua_dos_ut3 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int numero;
        do{
            System.out.println("---------------------------------------");
            System.out.println("Inserta el numero a comprobar si es capicua");
            numero = tec.nextInt();
        }while (numero<=0);

        if (esCapicua(numero)){
            System.out.println("\nEl numero introducido es capicua");
        }else{
            System.out.println("\n El numero introdicdo NO es capicua");
            System.out.println("Se puede generar el siguiente numero a partir de el");
            String capicua = crearCapicua(numero);
            System.out.println(capicua);
        }
    tec.close();






    }
    /*  public static boolean numeroCapicua(int dato) {	
	int faltante;
		
		faltante=dato;
		int numeroInvertido=0;
		int restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		    }

	    if(numeroInvertido==dato){
        return true;
		}else{
        return false;
        }
		}*/
        public static int darLaVuelta(int num){
            String numero = "" + num;
            String resultado="";
            int pos = numero.length() -1;
            do{
                resultado += numero.charAt(pos);
                pos--;
            }while (pos>=0);
            int resu = Integer.parseInt(resultado);
            return resu;
        }
        public static boolean esCapicua(int num){
            int numalreves=darLaVuelta(num);
            if(num == numalreves){
                return true;
            }else{
                return false;
            }
        }
        public static String crearCapicua(int num){
            int numalreves=darLaVuelta(num);
            String capicua = ""+ num +"xx"+numalreves;
            return capicua;
        }
        
        public static int intPositivo(Scanner teclado) {
            int numero=0, bucle=0 ;
            do {
                try {
                    do {
                    numero = teclado.nextInt();
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
