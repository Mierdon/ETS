package anterior_ut3;
import javax.swing.JOptionPane;

public class david_4 {
    public static void main(String[] args) {
int n1,n2,n3,n4,n5,n6,n7,n8,media;
int contador=0;
n1=intPositivo();
n2=intPositivo();
n3=intPositivo();
n4=intPositivo();
n5=intPositivo();
n6=intPositivo();
n7=intPositivo();
n8=intPositivo();
media=(n1+n2+n3+n4+n5+n6+n7+n8)/8;
if (n1<media){
contador++;
}else{

}if (n2<media){
contador++;
}else{
    
}if (n3<media){
    contador++;
    }else{
        
    }if (n4<media){
        contador++;
        }else{
                
            }if (n5<media){
                contador++;
                }else{
                    
                }if (n6<media){
                    contador++;
                    }else{
                        if (n7<media){
                            contador++;
                            }else{
                                
                            }if (n8<media){
                                contador++;
                    }
                }

JOptionPane.showMessageDialog(null, "La media es de: "+media+" El total de numeros menores a la media es de: "+contador);
JOptionPane.showMessageDialog(null, "A continuacion los numeros mayores a la media");
if (n1>media){
    JOptionPane.showMessageDialog(null, "El numero: "+n1+" es mayor a la media");
    }else{
    
    }if (n2>media){
        JOptionPane.showMessageDialog(null, "El numero: "+n2+" es mayor a la media");
    }else{
        
    }if (n3>media){
        JOptionPane.showMessageDialog(null, "El numero: "+n3+" es mayor a la media");
    }else{
            }if (n4>media){
                JOptionPane.showMessageDialog(null, "El numero: "+n4+" es mayor a la media");
            }else{
                    
                }if (n5>media){
                    JOptionPane.showMessageDialog(null, "El numero: "+n5+" es mayor a la media");
                }else{
                        
                    }if (n6>media){
                        JOptionPane.showMessageDialog(null, "El numero: "+n6+" es mayor a la media");
                    }else{
                            if (n7>media){
                                JOptionPane.showMessageDialog(null, "El numero: "+n7+" es mayor a la media");
                            }else{
                                    
                                }if (n8>media){
                                    JOptionPane.showMessageDialog(null, "El numero: "+n8+" es mayor a la media");
                                }
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
