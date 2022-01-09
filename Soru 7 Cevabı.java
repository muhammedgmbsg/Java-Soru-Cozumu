
package hesap.makinesi;

import java.util.Scanner;

public class HesapMakinesi {

    
    public static void main(String[] args) {
        // Hesap Makinesi5
     Scanner input = new Scanner(System.in);
     
        System.out.print("Lütfen Sayı Giriniz: ");
       int sayı1 = input.nextInt();
       
        System.out.print("Lütfen Tekrar Sayı Giriniz: ");
     int sayı2 = input.nextInt();
     
        System.out.print("Yapacağınız İşlem: ");
     input.nextLine();
     
     String a = input.nextLine();
     
     if(a.equals("+")) {
         System.out.println("İşlem Sonucu: " + (sayı1 +sayı2));
     }
     else if(a.equals("-")) {
         System.out.println("İşlem Sonucu: " + Math.abs(sayı1-sayı2));
     }
     else if(a.equals("*")) {
         System.out.println("İşlem Sonucu: " + (sayı1 * sayı2));
         
     } 
     
     else {
         System.out.println("İşlem Sonucu: " + ((double)sayı1/sayı2));
     }
     
     
     
     
     
     
     
     
    }
    
}
