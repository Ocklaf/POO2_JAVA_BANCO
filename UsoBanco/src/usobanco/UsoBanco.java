/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usobanco;

/**
 *
 * @author nostromo
 */
public class UsoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente miCuenta = new CuentaCorriente("CC17042938", 1200);
        CuentaAhorro miCApobre = new CuentaAhorro("POBRE10293847", 999);
        CuentaAhorro miCAnormal = new CuentaAhorro("NORMAL472390", 1000);
        CuentaAhorro miCArico = new CuentaAhorro("RICO2304917874390741908354", 124000);
        
//        miCuenta.getDatosCuenta();
//        
//        miCuenta.calcularIntereses();
//        
//        miCuenta.getDatosCuenta();
//        
//        miCuenta.ingresarDinero(100);
//        
//        miCuenta.getDatosCuenta();
//        
//        miCuenta.retirarDinero(-124);
//        
//        miCuenta.getDatosCuenta();

//          miCApobre.getDatosCuenta();
//          miCApobre.calcularIntereses();
//          miCApobre.getDatosCuenta();
//          
//          miCAnormal.getDatosCuenta();
//          miCAnormal.calcularIntereses();
//          miCAnormal.getDatosCuenta();
//          
//          miCArico.getDatosCuenta();
//          miCArico.calcularIntereses();
//          miCArico.getDatosCuenta();

            miCArico.getDatosCuenta();
            miCApobre.getDatosCuenta();
            
            miCApobre.traspasoCuentas(4000, miCArico, miCApobre);
            miCApobre.getDatosCuenta();
            miCArico.getDatosCuenta();
    }
    
}
