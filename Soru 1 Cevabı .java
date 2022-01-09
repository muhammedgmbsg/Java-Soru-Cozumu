
package javaapplication97;

import java.util.Scanner;

public class JavaApplication97 {

    public static void main(String[] args) {
        
        // Üçgenin Alanını Hesaplayan Program
        
          Scanner input = new Scanner(System.in);
          
          System.out.print("Lütfen Üçgenin Taban Değerini Giriniz: ");
       double taban = input.nextDouble();
       
        System.out.print("Lütfen Üçgenin Yükseklik değerini giriniz: ");
        double yükseklik = input.nextDouble();
        
        double alan = (taban * yükseklik)/2;
        
        System.out.println("Üçgenin Alanı: " + alan);
    } 
    
}
