/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usobanco;

/**
 *
 * @author nostromo
 */
public abstract class CuentaBancaria {
    private final String IBAN;
    private double saldo;
    protected static final double INTERESANUAL = 2;
    
    public CuentaBancaria(String IBAN, double saldo){
        this.IBAN = IBAN;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getIBAN(){
        return IBAN;
    }
    
    public void getDatosCuenta(){
        System.out.println("La cuenta bancaria con IBAN: " + getIBAN() + ", tiene un saldo actual de: " + getSaldo() + "€");
    }
    
    public void ingresarDinero(double cantidad){
        movimientoSaldo(cantidad);
    }
    
    public void retirarDinero(double cantidad){
        movimientoSaldo(cantidad);
    }
    
    public void traspasoCuentas(double cantidad, CuentaBancaria origen, CuentaBancaria destino){
        origen.movimientoSaldo(-1*cantidad);//le resto la cantidad que quiere cambiar de cuenta (cambio de signo)
        destino.movimientoSaldo(cantidad);//hago el ingreso en la cuenta de la cantidad que ha salido de la cuenta origen
    }
    
    private void movimientoSaldo(double cantidad){
            saldo += cantidad;        
    }
    
    public abstract void calcularIntereses();
}
