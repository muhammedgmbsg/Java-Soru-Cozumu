
package kalori.hesabı;

import java.util.Scanner;

public class KaloriHesabı {
  
    public static void main(String[] args) {
        // Kalori Hesabı Yapan Program
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen cinsiyetinizi giriniz: ");
        String cins = input.nextLine();
        
        System.out.print("Lütfen attığınız adım sayısını giriniz: ");
        int adım = input.nextInt();
int kalori;
       if(cins.equals("Erkek")) {
             kalori = (adım * 45)/500;
            System.out.println("Yakılan Kalori Miktarı: " + kalori);
       }
        
       else if (cins.equals("Kadin")) {
           kalori = (adım*30) /500;
           System.out.println("Yakılan Kalori Miktarı: " + kalori);
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    }
    
}
