/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import latihan3.pegawai;

/**
 *
 * @author santuy
 */
public class staf extends pegawai{
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;
    
    public int gaji (){
        return gajiStaf;
    }
    public int bonus (){
        return bonusStaf;
    }
}
