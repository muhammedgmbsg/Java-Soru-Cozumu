
package faktoriyel;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        
                        //Faktöriyel Hesabı Yapan Program
                           
                       
          Scanner input = new Scanner(System.in);
          
          System.out.print("Lütfen Sayınızı Giriniz: ");
        int sayı = input.nextInt();
        int f = 1;
        
        for(int i =1; i<=sayı; i++) {
            
            f = f*i;
        }
            System.out.println("Faktöriyel: " +f); 
    }
    
}
