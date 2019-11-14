/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author santuy
 */
public class Class {
    public static int tambah (int z,int y){
        return z+y;
    }
    public static void main(String[] args) {
        Rect s1 = new Rect(1, 1, 4, 4);
        Rect s2 = new Rect(2, 3, 5, 6);
        Rect z = s1.union(s2);
        Rect x = s1.intersection(s2);
        
        if (z.isInside(s2.x1, s2.y1))
            System.out.println("(" + s2.x1 + "," + s2.y1 +") is Inside the union");
        
        System.out.println(s1 +" union " + s2 + " = " + z);
        System.out.println(s1 +" intersect " + s2 + " = " + x);
    }
}
