package ut3.ej4;

public class metodos_cadenas {
    public static String imprimemitad(String cadena){
        String mitad;
        int dividido = cadena.length()/2;
        mitad=cadena.substring(dividido,cadena.length()); //añadi que devolviese la mita del string
        return mitad;
    }

    public static char imprimeultimo(String cadena){
        char last;
        last = cadena.charAt(cadena.length()-1);//devuelve char por que no importaba demasiado
       return last;
    }

    public static String imprimealreves(String cadena){
        StringBuilder reverso = new StringBuilder();
        int conteo=0;
        for (int i=cadena.length()-1;i>=0;i--){

            reverso.append(cadena.charAt(i));//estuve mas tiempo del que me gustria admitir pare esta tunica línea
        }//esto solo los toma y los pone del reves
        return reverso.toString();
    }
    public static String imprimegiones(String cadena){
        StringBuilder separado = new StringBuilder();

        for(int i=0;i<cadena.length();i++){
            if (i!=cadena.length()-1){
                separado.append(cadena.charAt(i)); //uso el append para añadir al final del stringBuilder el caracter que sea y ademas poner un gion
                separado.append("-");
            }else{
                separado.append(cadena.charAt(i));//y en la ultima no pongo gion
            }
        }
    return separado.toString();
    }
    public static Boolean esvocal(char cara){
        if (cara=='a' || cara=='e' || cara=='i' || cara=='o' || cara=='u' || cara=='A' || cara=='E' || cara=='I' || cara=='O' || cara=='U'){
            return true;
        }else{//no he cambiado nada
            return false;
        }
    }
    public static int calculavocales(String cadena){
        int nvocales=0;
        for(int i =0;i<cadena.length();i++){//estaba bien
            if(esvocal((cadena.charAt(i)))){
                nvocales++;//puse que devolviese int por que String no tenia mucho sentido
            }
        }
    return nvocales;
    }
}
