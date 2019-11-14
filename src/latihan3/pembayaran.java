/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import latihan3.pegawai;
import latihan3.direktur;

/**
 *
 * @author santuy
 */
public class pembayaran {
    public int hitungGaji(pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof direktur)
            uang += ((direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang +=((staf)peg).bonus();
        return uang;
    }
    public static void main(String []args){
        pembayaran pg = new pembayaran();
        staf ali = new staf();
        direktur tony =new direktur();
        System.out.println("Gaji yang dibayarkan untuk staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitungGaji(ali));
    }
}
