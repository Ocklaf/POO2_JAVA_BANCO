/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usobanco;

/**
 *
 * @author nostromo
 */
public class CuentaCorriente extends CuentaBancaria{
    private double interesGenerado, saldoCC;
    
    public CuentaCorriente(String IBAN, double saldo){
        super(IBAN, saldo);
    }
    
    @Override
    public void calcularIntereses(){
        interesGenerado = (INTERESANUAL * this.getSaldo())/100; 
        saldoCC = getSaldo();
        saldoCC += interesGenerado;
        this.setSaldo(saldoCC);
    }
}
