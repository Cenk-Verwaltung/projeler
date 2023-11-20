package com.mycompany.proje2;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Proje2 {

    public static void main(String[] args) {
        /*NumberFormat dr = new DecimalFormat("##");
        String s = dr.format(-1234.567);
        
        System.out.println(s);*/
        
        NumberFormat f = new DecimalFormat("##");
        String s = f.format(-1234.567);
        System.out.println(s);
    }
}
