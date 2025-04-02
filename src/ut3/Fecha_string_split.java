package ut3;

import javax.swing.JOptionPane;

public class Fecha_string_split {
    public static void main(String[] args) { 
String fecha=JOptionPane.showInputDialog(null,"Introduce una fecha separada por '/' y en formato dd/mm/aaaa ");
System.out.println(fecha);
String separada[]=fecha.split("/");
int a=Integer.parseInt(separada[0]);
int b=Integer.parseInt(separada[1]);
int c=Integer.parseInt(separada[2]);
int derecho=fecha(a,b,c);
if (numeroCapicua(derecho)){
    JOptionPane.showMessageDialog(null, "Su fecha "+fecha+" es capicua");
}else{
    JOptionPane.showMessageDialog(null, "Su fecha "+fecha+" es NO capicua");
}
    }
    public static int fecha (int a, int b, int c){
        int a2=a*100;
        int b2=(a2+b)*10000;
        int total=(b2+c);
        System.out.println(total);
        return total;
    }
    public static boolean numeroCapicua(int dato) {	
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
            }
}
