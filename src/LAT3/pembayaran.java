/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_polimorphisme;


/**
 *
 * @author Yeremia Rizky
 */
public class pembayaran {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang +=((staf)peg).bonus();
        return uang;
    }
    public static void main(String []args){
        pembayaran pg = new pembayaran();
        staf ali = new staf();
        Direktur tony =new Direktur();
        System.out.println("Gaji yang dibayarkan untuk staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitungGaji(ali));
    }
}
