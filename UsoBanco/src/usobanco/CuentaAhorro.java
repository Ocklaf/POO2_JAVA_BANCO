/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usobanco;

/**
 *
 * @author nostromo
 */
public class CuentaAhorro extends CuentaBancaria {

    private static final double SALDOMIN = 1000;

    public CuentaAhorro(String IBAN, double saldo) {
        super(IBAN, saldo);
    }

    @Override
    public void calcularIntereses() {
        double saldoCA, interesGenerado;

        saldoCA = this.getSaldo();
        if (saldoCA < SALDOMIN) {
            interesGenerado = ((INTERESANUAL / 2) * this.getSaldo()) / 100;
            saldoCA = getSaldo();
            saldoCA += interesGenerado;
            this.setSaldo(saldoCA);
        } else if (saldoCA > SALDOMIN) {
            interesGenerado = ((INTERESANUAL * 2) * this.getSaldo()) / 100;
            saldoCA = getSaldo();
            saldoCA += interesGenerado;
            this.setSaldo(saldoCA);
        } else {
            interesGenerado = (INTERESANUAL * this.getSaldo()) / 100;
            saldoCA = getSaldo();
            saldoCA += interesGenerado;
            this.setSaldo(saldoCA);
        }

    }
}
