package anterior_ut3;
import javax.swing.JOptionPane;

public class david_3 {
    public static void main(String[] args) {
        int numA,numB,numC,mediano,mayor,menor,opcion;
            JOptionPane.showMessageDialog(null,"Introduce 3 numeros positivos.");
            numA=intPositivo();
            numB=intPositivo();
            numC=intPositivo();
            JOptionPane.showMessageDialog(null,"Introduce 1 si quieres mostrarlos en orden creciente, 2 para orden decreciente");
        mayor=mayor(numA,numB,numC);
        menor=menor(numA,numB,numC);
        mediano=mediano(numA,numB,numC,mayor,menor);
    
    do{
        opcion = intPositivo();
    if (opcion==1){
        JOptionPane.showMessageDialog(null,"Su orden seria: "+menor+" "+mediano+" "+mayor);
    }else{
        if(opcion==2){
            JOptionPane.showMessageDialog(null,"Su orden seria: "+mayor+" "+mediano+" "+menor);
        }else{
            JOptionPane.showMessageDialog(null,"introduce 1 o 2, no hay mas opciones");
            
        }
    }
}while (opcion<1 || opcion>2);
    
    }
public static int mediano(int numA, int numB, int numC,int mayor, int menor){
    int mediano=0;
    if (numA<mayor && numA>menor ){
        mediano=numA;
    }else{
        if (numB<mayor && numA>menor) {
            mediano=numB;
        }else{
            if (numC<mayor && numC>mayor) {
                mediano=numC;
            }
        }
    }
    return mediano;
}
    public static int mayor(int numA, int numB, int numC){
        int mayor=0;
        if (numA>numB && numA>numC) {
            mayor=numA;
        }else{
            if(numB>numC){
                mayor=numB;
            }else{
                mayor=numC;
            }
        }
        return mayor;
    }
    public static int menor(int numA, int numB, int numC){
        int menor=0;
        if (numA<numB && numA<numC) {
            menor=numA;
        }else{
            if(numB<numC){
                menor=numB;
            }else{
                menor=numC;
            }
        }
        return menor;
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
