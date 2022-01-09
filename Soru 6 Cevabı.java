
package javaapplication106;

import java.util.Scanner;


public class JavaApplication106 {

    
    public static void main(String[] args) {
        // Girilen 2 sayı arasındaki Tek Sayıları yazdıran program
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz: ");
       int sayı1 = input.nextInt();
        System.out.print("Tekrar Bir Sayı Giriniz: ");
        int sayı2 =input.nextInt();
        
        int i =sayı1;
        while(i<=sayı2) {
            if(i%2==0) {
                System.out.println(i);
            } i++;
        }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
}
