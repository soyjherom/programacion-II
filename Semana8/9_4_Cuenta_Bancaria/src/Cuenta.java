public class Cuenta {
    private double saldo;
    private String mensaje;
    public Cuenta(final double saldoInicial){
        this.saldo = saldoInicial;
    }
    public void depositar(final Double monto){
        if(monto != null && monto > 0){
            this.saldo += monto;
        }
    }
    public void retirar(final Double monto){
        if(monto != null && monto > 0){
            this.saldo -= monto;
            if(this.saldo < 0){
                this.mensaje = "CLIENTE SOBREGIRADO";
            }
        }
    }
    public void verSaldo(){
        if(this.saldo < 0){
            System.out.println(this.mensaje);
        }
        System.out.println("El saldo es: " + Double.toString(this.saldo));
    }
}
