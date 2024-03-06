/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta.cuentabancariaGómezLagunaSonia2324T4;



public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CuentaGómezLagunaSonia2324T4 miCuentaGómezLagunaSonia2324T4;
        double saldoActual;
        int x;
        
        miCuentaGómezLagunaSonia2324T4 = retiraDineroGómezLagunaSonia();
        
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaGómezLagunaSonia2324T4.ingresar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuentaGómezLagunaSonia2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    private static CuentaGómezLagunaSonia2324T4 retiraDineroGómezLagunaSonia() {
        CuentaGómezLagunaSonia2324T4 miCuentaGómezLagunaSonia2324T4;
        int x;
        miCuentaGómezLagunaSonia2324T4 = new CuentaGómezLagunaSonia2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaGómezLagunaSonia2324T4.estado()+"€");
        return ingresaDineroGómezLagunaSonia(miCuentaGómezLagunaSonia2324T4, "Ingreso en Cuenta");
    }

    private static CuentaGómezLagunaSonia2324T4 ingresaDineroGómezLagunaSonia(CuentaGómezLagunaSonia2324T4 miCuentaGómezLagunaSonia2324T4, String concepto) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaGómezLagunaSonia2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        return miCuentaGómezLagunaSonia2324T4;
    }

}
