
package soru1;

import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {
         
        // İki Kişinin Sınav Ortalamasını Hesaplayan ve Karşılaştıran Program
        
        
        
        Scanner input = new Scanner(System.in);
      
        
        System.out.print("1. Kişinin Vize Notunuzu Giriniz: ");
        
            int vize = input.nextInt();
            
            System.out.print("Final Notunu Giriniz: ");
            
            int finall = input.nextInt();
            
            double ort = vize* 0.4 + finall* 0.6;
                        
           System.out.print("2. Kişinin Vize Notunu Giriniz: ");
           int vizee = input.nextInt();
           System.out.print("2. Kişinin Final Notunu Giriniz: ");
           int finalll = input.nextInt();
             double ort2 = vizee* 0.4 + finalll* 0.6;
             
             if(ort>ort2) { 
                 System.out.println("Birinci Kişinin Notu Daha Yüksek: " + ort);
             } 
             else if(ort==ort2) {
                 System.out.println("Notları eşit: " + ort2 + " ve " + ort);
             } 
             else { 
                 System.out.println("İkinci Kişinin Notu Daha Yüksek: " + ort2);
             }
        
        
        
        
        
        
        
        
         
        
        
        
        
        
    }
    
}
