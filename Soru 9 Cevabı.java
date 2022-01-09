
package sayı.tahmin.etme.oyunu;

import java.util.Scanner;


public class SayıTahminEtmeOyunu {

    
    public static void main(String[] args) {
        // Sayı Tahmin Etme Oyunu
          Scanner input = new Scanner(System.in);
        
        int kere=0; int sayi; int tahmin;
        sayi = (int)(Math.random()*10) +1;
        
        do { 
          kere++;
            System.out.print("Tahminizi Giriniz: ");
             tahmin = input.nextInt();
            
            if(tahmin>sayi) {
                System.out.println("Daha Küçük Bir Sayı Giriniz...");
            }
            else if(tahmin<sayi) {
                System.out.println("Daha Büyük Bir Sayı Giriniz...");
            }
        }  
        while(tahmin!=sayi) {
        System.out.println( kere + ". Adımda Buldunuz..."); 
    }
    }
    
}
