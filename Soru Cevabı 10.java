
package javaapplication107;

import java.util.Scanner;


public class JavaApplication107 {

  
    public static void main(String[] args) {
        // İstenen sayı girilene kadar yanlış sayıları toplayan program
        
        Scanner input = new Scanner(System.in);
        
        
        
        int sayı;
        int toplam = 0;
        
       while(true) {
            System.out.print("Lütfen 0 sayısını Giriniz: ");
            sayı = input.nextInt();
           if(sayı==0) {
               break;
       }  else {
               toplam = toplam + sayı; }
          
           } System.out.println("Toplam: " + toplam);
           
        
                
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    }
    
}
