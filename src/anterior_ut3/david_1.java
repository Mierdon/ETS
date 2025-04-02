
package anterior_ut3;
import java.util.Scanner;


public class david_1 {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	float A,B,C,valor1;
	A = floatPositivo(teclado);
	B = floatNoPositivo(teclado);
	C = floatNoPositivo(teclado);
	
valor1=unoecuacion(A,B,C);
valor1=(float) Math.sqrt(valor1); //Raiz cuadrada
dosecuacion(valor1, B, A);

}
public static float floatPositivo(Scanner teclado) {
	float numero=0, bucle=0 ;
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
public static float floatNoPositivo(Scanner teclado) {
	float numero=0, bucle=0 ;
	do {
		try {
			do {
			System.out.println("Introduce un valor numerico");
			numero = teclado.nextInt();
			bucle++;
			}while (bucle==0);
		}
		catch (java.util.InputMismatchException ex) {
			 System.out.println("Solo se permiten introducir caracteres numericos positivos");
			 teclado.next();
		}
	}while (bucle==0);

	return numero;
}
public static float unoecuacion(float A, float B, float C) {
float aporc,acmenos,fin,cuadrada;
	cuadrada=B*B;
	aporc=A*C;
	acmenos=aporc*-4;
	fin=cuadrada+acmenos;
	return fin;
}
public static  void dosecuacion(float valor1, float B,float A ) {
	float positivo,negativo,fin=0,divisor;
	positivo=positivoecuacion(valor1,B);
	negativo=negativoecuacion(valor1,B);
	divisor=A*2;
	fin=positivo/divisor;
	System.out.println("el valor positivo es :"+fin);
	fin=negativo/divisor;		
	System.out.println("el valor negativo es :"+fin);
}
public static float positivoecuacion(float valor1, float B) {
	float fin;
	fin=-B+valor1;
return fin;
}
public static float negativoecuacion(float valor1, float B) {
	float fin;
	fin=-B-valor1;
return fin;
	
}
}

