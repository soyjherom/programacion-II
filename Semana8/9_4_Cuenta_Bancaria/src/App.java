import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
9.4 Cuenta bancaria Escriba un programa que simule una cuenta bancaria. 
Un cuadro de texto permite que se realicen depósitos (un número positivo) y 
retiros (un número negativo) en la cuenta. El estado de la cuenta se muestra continuamente y, 
si la cuenta queda en rojo (balance negativo), se muestra en pantalla un mensaje apropiado. 
Cree una clase llamada Cuenta y una clase de interfaz de usuario que la utilice.
Criterio	Cumple	No cumple
Compila		
Corre		
Cumple con los requerimientos		
Abarca el concepto de abstracción (usa clases)		
Abarca el concepto de Encapsulamiento		
Abarca el concepto de Herencia		
Usa una correcta identación del código	
*/
public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Cliente cuentaBancaria = null;
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        while(opcion < 4){
            if(cuentaBancaria != null){
                cuentaBancaria.verSaldo();
            }
            System.out.println("1. Abrir cuenta ");
            System.out.println("2. Depositar ");
            System.out.println("3. Retirar ");
            System.out.println("4. Salir ");
            try{
                opcion = Integer.parseInt(bufferReader.readLine());
                if(opcion == 1){
                    System.out.println("Indique el saldo inicial");
                    Double saldoInicial = Double.parseDouble(bufferReader.readLine());
                    cuentaBancaria = new Cliente(saldoInicial);
                    System.out.println("Indique el nombre");
                    cuentaBancaria.nombre = bufferReader.readLine();
                    System.out.println("Indique el apellido");
                    cuentaBancaria.apellido = bufferReader.readLine();
                }else if(opcion == 2 && cuentaBancaria != null){
                    System.out.println("Indique el monto del deposito");
                    cuentaBancaria.depositar(Double.parseDouble(bufferReader.readLine()));
                }else if(opcion == 3 && cuentaBancaria != null){
                    System.out.println("Indique el monto del retiro");
                    cuentaBancaria.retirar(Double.parseDouble(bufferReader.readLine()));
                }else if(cuentaBancaria == null){
                    System.out.println("No puede operar una cuenta sin abrirla primero");
                }
            }catch(Exception ex){
                System.out.println("Por favor seleccione una opcion de numeros entre 1 y 4");
            }
        }
    }
}
