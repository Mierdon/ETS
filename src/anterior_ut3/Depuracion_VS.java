package anterior_ut3;

import java.util.Scanner;;

public class Depuracion_VS {
    public static void main(String[] args) throws Exception {
        double a=8 ,h,v;

        Scanner sc = new Scanner(System.in);
        System.out.println("Altura?: ");
       h = sc.nextDouble();
        v= (a/3+h);
        System.out.println("El volumen es "+v);
        sc.close();

    }
}
