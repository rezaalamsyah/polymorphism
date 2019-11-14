/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author santuy
 */
public class Class {
    public static void main (String []args){
        Line shimme = new Line (0,0,0,0);
        System.out.println(shimme.getLength());
        System.out.println(shimme.isGreater(shimme,shimme));
        System.out.println(shimme.isLess(shimme, shimme));
        System.out.println(shimme.isEqual(shimme,shimme));
    }
}
