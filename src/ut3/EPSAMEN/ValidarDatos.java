package ut3.EPSAMEN;

import javax.swing.JOptionPane;

public class ValidarDatos {
    
    public static boolean validarGenero (String genero) {
        if (genero.length() != 1) //he puesto que si NO es 1 que no pase
            return false;

        if (genero.equals("H") || genero.equals("M") || genero.equals("X")) //y aqui que solo pasen si es cualquiera de los datos aceptables
            return true;
        else
            return false;
    }

    public static boolean validarFecha (String fecha) {
        if (fecha.length() != 10)   //  dd/mm/aaaa, el return esta mal, si es distinto a 10 te devuleve correcto, solo lo cambie a false
            return false;
        
        String[] valores = fecha.split("/");
        if (valores.length != 3)
            return false;

        String Dia = valores[0];
        if (Dia.length() != 2)
            return false;
        if (Character.isDigit(Dia.charAt(0)) == false || Character.isDigit(Dia.charAt(1)) == false)
            return false;
        int dia = Integer.parseInt(Dia);
        if (dia < 1 || dia > 31)
            return false;

        String Mes = valores[1]; //Asisgnaba mal el valor, ponia 0 en el array en ved de 1
        if (Mes.length() != 2)
            return false;
        if (Character.isDigit(Mes.charAt(0)) == false || Character.isDigit(Mes.charAt(1)) == false)
            return false;
        int mes = Integer.parseInt(Mes);
        if (mes < 1 || mes > 12)
            return false;

        String Año = valores[2];
        if (Año.length() != 4)
            return false;
        if (Character.isDigit(Año.charAt(0)) == false || Character.isDigit(Año.charAt(1)) == false
          || Character.isDigit(Año.charAt(2)) == false || Character.isDigit(Año.charAt(3)) == false)
            return false;

        return true;
    }

    public static boolean validarTelefono (String tfno) {
        if (tfno.length() != 9)
            return false; //Este error era que si el dígito era 9 daba false solo he puesto lo contrario con un "!"
        
        for (int i = 0; i < tfno.length(); i++) { //estaba sumando 0 al bucle y se quedaba infinito y empezaba en 4 en ved de en 0
            if (Character.isDigit(tfno.charAt(i)) == false)
                return false;
        }
        
        return true; //pasase lo que pasase siempre devolvia false
    }

    public static void main(String[] args) {
        String genero, fecha, tfno;
        do {
            genero = JOptionPane.showInputDialog(null, "Inserte su género:");
        } while (!validarGenero(genero));
        do {
            fecha = JOptionPane.showInputDialog(null, "Inserte su fecha de nacimiento:");
        } while (!validarFecha(fecha));
        do {
            tfno = JOptionPane.showInputDialog(null, "Inserte su número de tfno:");
        } while (!validarTelefono(tfno));
        JOptionPane.showMessageDialog(null, "Sus datos: \n" + genero + "\n" + fecha + "\n" + tfno);
    }
}