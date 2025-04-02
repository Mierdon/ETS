
package anterior_ut3;
        import java.util.Scanner;
public class Depuracion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int alto, ancho, area, perimetro;
        System.out.println("Programa que calcula el area y perimetro de un rectangulo.");
        System.out.print("Introduce el alto: ");
        alto = teclado.nextInt();
        System.out.print("Introduce el ancho: ");
        ancho = teclado.nextInt();
        teclado.close();
        area = alto*ancho;
        perimetro = 2*ancho +2*alto;
        System.out.println ("El area del rectangulo es: "+area);
        System.out.println ("El perimetro del rectangulo es: "+perimetro);
         
    }
    
}
