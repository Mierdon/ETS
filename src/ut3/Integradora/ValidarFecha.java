package ut3.Integradora;
import javax.swing.JOptionPane;

public class ValidarFecha {
    static String[] diasValidos = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    static String[] mesesValidos = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static boolean tieneLongitudCorrecta(String fecha) {
        String[] palabras = fecha.split(" ");
        if (palabras.length == 6)// en el igual habia un 4 en ved de un 6
            return true;
        else
            return false;
    }
    public static boolean esNumero(String numero) {
        int num=0;
        for (int i = 0; i < numero.length(); i++) {
            if (Character.isDigit(numero.charAt(i)))
            {
                num++;
            }
        }
        if (num==numero.length()){
            return true;
        }else {
            return false;
        }
    }
    public static boolean existePalabraEnVector(String palabra, String[] vector) {
        for (int i = 0; i < 6; i++) {
            if (vector[i].equals(palabra))
                return true;
        }
        return false;
    }
    public static boolean validarFecha(String fecha) {
        if (!tieneLongitudCorrecta(fecha))
            return false;
        String[] palabras = fecha.split(" ");
        String diaDeLaSemana = palabras[0];
        String diaDelMes = palabras[1];
        String palabraDe1 = palabras[2];
        String mes = palabras[3];
        String palabraDe2 = palabras[3];
        String año = palabras[5];
        if (!existePalabraEnVector(diaDeLaSemana, diasValidos))
            return false;
        if (!esNumero(diaDelMes)) {
            return false;
        } else {
            int iDiaDelMes = Integer.parseInt(diaDelMes);
            if (iDiaDelMes < 31 || iDiaDelMes > 1)
                return true; //estaba del reves
        }
        if (!palabraDe1.equals("de"))
            return false;
        if (!existePalabraEnVector(diaDeLaSemana, mesesValidos))
            return false;
        if (!palabraDe2.equals("de"))
            return false;
        if (!esNumero(año)) {
            return false;
        } else {
            int iAño = Integer.parseInt(año);
            if (iAño < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        do {
            String fecha = JOptionPane.showInputDialog(null, "Introduzca una fecha con el formato Lunes 15 de Febrero de 2025:");
            if (validarFecha(fecha) == false) {
                JOptionPane.showMessageDialog(null, "Fecha inválida. \nFormato incorrecto", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Fecha válida. \nFormato correcto", "OK",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        } while (true);
    }
}

