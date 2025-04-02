package anterior_ut3;

import javax.swing.JOptionPane;

public class david_2 {
    public static void main(String[] args) {
        int usuario,contador=0,impares=0,pares=0;
        do{
        JOptionPane.showMessageDialog(null,"Introduce un numero positivo, cuando quieras terminar pulse 0");
        usuario=intPositivo();
            contador++;
            if(paresOno(usuario)){
                pares++;
            }else{
                impares++;
            }

        }while(usuario>0);
    JOptionPane.showMessageDialog(null,"Total de numeros : "+contador+" Total de pares: "+pares+" Total de impares: "+impares);
        
    
    
    }
    public static boolean paresOno(int usuario){
        if(usuario%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static int intPositivo() {
        String numero;
        int bucle=0,numerico=0;
        do {
            try {
                do {
                numero = JOptionPane.showInputDialog(null,"Introduce un numero");
                numerico=Integer.parseInt(numero);
                bucle++;
                if (numerico<0) {
                    System.out.println("Introduce un valor superior a 0 numerico");
                    bucle=0;
                }
                }while (bucle==0);
            }
            catch (java.lang.NumberFormatException ex) {
                 System.out.println("Solo se permiten introducir caracteres numericos positivos");
            }
        }while (bucle==0);
    
        return numerico;
    }
}
