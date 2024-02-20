package deposito;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, null);
    }

    private static float operativa_cuenta(CCuenta cuenta1, cantidad par1) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("al retirar no va");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("al ingresar no va");
        }
        return 0;
        
    }
}
