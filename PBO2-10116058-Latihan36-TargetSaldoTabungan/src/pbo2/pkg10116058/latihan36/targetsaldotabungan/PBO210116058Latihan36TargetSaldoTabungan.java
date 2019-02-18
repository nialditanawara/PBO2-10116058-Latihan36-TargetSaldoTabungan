/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan36.targetsaldotabungan;

public class PBO210116058Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tab = new Tabungan();
        
        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;
        
        tab.HitungLamaTarget(tab.saldo, saldoTarget);
    }
    
}