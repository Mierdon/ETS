package ut4.dos;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prisma> lista = new ArrayList<Prisma>();
        Prisma lectura = new Prisma();
        int a1,b1,a2,b2,a3,b3;

        Prisma prisma1= new Prisma(a1=aleatorio(),b1=aleatorio(),null);
        lista.add(prisma1);
        Prisma prisma2= new Prisma(a2=aleatorio(),b2=aleatorio(),null);
        lista.add(prisma2);
        Prisma prisma3= new Prisma(a3=aleatorio(),b3=aleatorio(),null);
        lista.add(prisma3);
        for(int i = 0; i <lista.size();i++){
            lectura=(lista.get(i));
            System.out.println(lectura.toString());
        }
        System.out.println("");
Float area;
        for(int i = 0; i <lista.size();i++){
            lectura=(lista.get(i));
            System.out.println(lectura.toString());

            switch (i){
                case(0):
                    area=prisma1.areaTotal(a1,b1);
                    System.out.println(area);
                    prisma1.setAreaTotal(area);
                    area=null;
                    break;
                case(1):
                    area=prisma2.areaTotal(a2,b2);
                    System.out.println(area);
                    prisma2.setAreaTotal(area);
                    area=null;
                    break;
                case(2):
                    area=prisma3.areaTotal(a3,b3);
                    System.out.println(area);
                    prisma3.setAreaTotal(area);
                    area=null;
                    break;
            }
        }
        System.out.println("");
        Collections.sort(lista);
        for(int i = 0; i <lista.size();i++) {
            lectura = (lista.get(i));
            System.out.println(lectura.AString());

        }
    }
    static public int aleatorio(){
        double random = 0;
        return (int) (random= (Math.random()*100+1));
    }
}
