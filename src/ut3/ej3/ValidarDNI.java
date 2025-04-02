// archivo ValidarDNI.java
package ETS.ut3.ej3;
import javax.swing.JOptionPane;

public class ValidarDNI {
    
 static final String LETRAS_DNI= "TRWAGMYFPDXBNJZSQVHLCKE";
 static char extraerLetraDNI (String DNI) {
 return DNI.charAt(DNI.length()-1);
 }

 static int extraerNumeroDNI (String DNI) {
 return Integer.parseInt(DNI.substring(0, DNI.length()-1)); //
 }

 static char calcularLetraDNI (int numerosDNI) {
   char vuelta=LETRAS_DNI.charAt(numerosDNI % 23);
 return vuelta;
 }

 static boolean validarDNI (String DNI) {
    if (DNI.length() != 9)
 return false; //comprueba si el dni tiene menos de 9 digitos

 for (int i = 0; i < 8; i++) {
 if (Character.isDigit(DNI.charAt(i)) == false)
 return false; //compueba si los 8 primeros digitos son numeros y si no lo son devuelve falso
 }

 if (Character.isLetter(DNI.charAt(8)) == false){
 return false; //comprueba si la octava posicion del 0 al 8 lo que seria el noveno digito y te dice si es una letra si no lo es returna falso
 }
 char letra = Character.toUpperCase(extraerLetraDNI(DNI));
 int numero = extraerNumeroDNI(DNI);
 char calcLetra = calcularLetraDNI(numero);
if (calcLetra==letra){
   return true;
}else{
   return false;
}
 }
 public static void main(String[] args) {
 String DNI = JOptionPane.showInputDialog(null, "Inserte el DNI a validar:");
 boolean valido = validarDNI(DNI);
 if (valido == true)
 JOptionPane.showMessageDialog(null, "El DNI indicado es válido");
 else
 JOptionPane.showMessageDialog(null, "El DNI indicado no es válido");
 }
}
