package ut4.TRES;

public class ProgramaComposicionCono {
    /**
     * Imprime por pantalla el dato que se le pase
     * @param datos
     */
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }

    /**
     * Primero genera un numero aleatorio, luego entra a un bucle, en este asigna un valor aleatorio ente 0 y 10
     * a una variable, a continuacion crea un cono de valores X e Y 0 con radio aleatorio, y de altura i (1 a 5)
     * por ultimo asigna el color y lo imprime con un metodo de la clase Cono ALTERADO
     * @param args
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}


