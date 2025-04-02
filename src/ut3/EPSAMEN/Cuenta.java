package ut3.EPSAMEN;

public class Cuenta {
    private String numcuenta;
    private static double balance;

    public Cuenta(String numcuenta, double balance) {
        this.numcuenta = numcuenta;
        this.balance = balance;
    }

    public static double Deposito(double cantidad) {
        balance = balance + cantidad; //multiplicaba en ved de sumar
        return balance;
    }

    public static double Retiro(double cantidad) {
        if (balance >= cantidad) {
            balance = balance - cantidad; //sumaba en ved de restar
            return balance;
        } else {
            return -1.0;
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("123", 1234.0);
        cuenta.Deposito(2000);
        System.out.println("El Balance de la cuenta -> "+cuenta.numcuenta+" es -> "+cuenta.balance);
        if (cuenta.Retiro(3000)>0) {
            System.out.print("El Balance de la cuenta -> " + cuenta.numcuenta + " es -> " + cuenta.balance);
        } else {
            System.out.println("No tienes saldo suficiente para retirar dicha cantidad");
        }
    }
}