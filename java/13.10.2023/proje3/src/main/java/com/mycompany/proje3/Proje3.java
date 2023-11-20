package com.mycompany.proje3;
public class Proje3 {

    public static void main(String[] args) {
     System.out.println("Farklı biçimlerde yazılmış " + "bazı sayılar:\n");
     
     System.out.printf("Farklı tamsayı gösterimleri:");
     System.out.printf("%d %(d%+d%05d\n",3, -3, 3,3);
     System.out.println();
     System.out.printf("Öntanılı float-sayı gösterimi %f\n," ,1234567.123);
     System.out.printf("Yülüklere ayrılmış biçem:%,f\n" ,1234567.123);
     System.out.printf("Negatif float sayıların öntanımlı gösterimi: %,f\n", -1234567.123);
     System.out.printf("Negatif float sayıların () içine alınması :", -1234567.123);
     System.out.println();
     System.out.printf("Pozitif ve negatif sayıların:\n");
     System.out.printf("%,.2f\n%,.2f\n",1234567.123, -1234567.123);
     
    }
}
