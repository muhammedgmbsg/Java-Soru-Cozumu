
package javaapplication99;

import java.util.Scanner;

public class JavaApplication99 {
  
    public static void main(String[] args) {
        
        // Ücret Hesabı Yapan ve Para Üstünü Hesaplayan Program
        
          Scanner input = new Scanner(System.in);
          
          System.out.print("Kaç Kilo Elma Alacaksınız: ");
          
         int e = input.nextInt();
          
         System.out.print("Kaç Kilo Portakal Alacaksınız: ");
         
         int p = input.nextInt();
         
           System.out.print("Kaç Kilo Çilek Alacaksınız: ");
           
           int c = input.nextInt();
           
           
           int ef = e*4;
           int pf = p*5;
           int cf= c*7;
           
           int ucret= ef+pf+cf;
           System.out.println("Ödemeniz Gereken Tutar: " + ucret + " TL");
            
           System.out.print("Vereceğiniz Tutar: ");
           int tutar = input.nextInt();
           
           int paraustu =  tutar - ucret;
           
           System.out.println( "Para Üstünüz: " + paraustu +" TL\n" + "İyi Günler Dileriz...");
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
         
    }
    
}
