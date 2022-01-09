
package bölgeye.göre.burs.miktarını.veren.program;

import java.util.Scanner;
public class BölgeyeGöreBursMiktarınıVerenProgram {

   
    public static void main(String[] args) {
        
        // Bölgeye göre Burs Miktarı Veren Program
        
       Scanner input = new Scanner(System.in);
       
        System.out.print("Lütfen Bölgenizi Giriniz: ");
        String bolge = input.nextLine();
        
       switch(bolge) {
           
           case "Marmara" : System.out.println("Marmara Bölgesi Aylık Bursu: 1000 TL...");
           break;
           case "Dogu Anadolu" : System.out.println("Doğu Anadolu Bölgesi Aylık Bursu: 700 TL...");
           break;
           case "İc Anadolu"  : System.out.println("İç Anadolu Bölgesi Aylık Bursu: 650 ...");
           case "Ege" : System.out.println("Ege Bölgesi Aylık Bursu: 900 TL");
           break;
           case "Guneydogu Anadolu" : System.out.println("GüneyDoğu Bölgesi Aylık Bursu: 770 TL...");
           break;
           default : System.out.println("Geçersiz Bölge adı, Tekrar deneyiniz...");
           
           
       }
       
    }
    
}
