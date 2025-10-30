package hafta_4;

public class Odev {

    public static void main(String[] args) {

        /* 
     SORU 1) 1’den N’e kadar olan tüm tamsayýlarýn küpünü konsola yazdýran programý yazýnýz.
Örneðin; N = 4 için ? 1, 8, 27, 64 yazdýrýlmalý.
     
       int n = 5;
       
       for ( int i = 1; i <= n; i++ ){
       int kup = i*i*i;
           System.out.println(kup);
       }
          
         */
 /*   
SORU 2) 1’den N’e kadar olan tüm tamsayýlarýn faktöriyelini konsola yazdýran bir program
yazýnýz.
Örneðin; N= 6 için ? 1! = 1
 2! = 2
 3! = 6
 4! = 24
 5! = 120
 6! = 720
      
      int N = 5; 

        for (int i = 1; i <= N; i++) {
            int faktoriyel = 1;

            for (int j = 1; j <= i; j++) {
                faktoriyel *= j;
            }
            System.out.println(i + "! = " + faktoriyel);
        }
         */
 /*    
SORU 3) Tanýmlanan bir tamsayý deðeri için çarpým tablosu oluþturan ve konsola yazdýran
programý yazýnýz.
Örneðin, 3 için ? 1 * 3 = 3
2 * 3 = 6
3 * 3 = 9
4 * 3 = 12
5 * 3 = 15
6 * 3 = 18
7 * 3 = 21
8 * 3 = 24
9 * 3 = 27
10 * 3 = 30 
 
        int n = 5;
        for (int i = 1;i <= 10;i++){
            int carpim = n*i;
            System.out.println(i + " * " + n + " = " + carpim);
        }
         */
 /*
SORU 4) Tanýmlanan baþlangýç ve bitiþ sayýlarý arasýndaki tüm tamsayýlarýn toplamýný ve
ortalamasýný konsola yazdýran programý yazýnýz. 
   
    int toplam = 0;
    int sayac = 0;
 
 
    for (int i = 1; i <= 256;i++){
        toplam += i;
        sayac++;
    }
    double ortalama = toplam/sayac;
        System.out.println("toplam = " + toplam + " ortalama = " + ortalama );
 
         */
 /*
SORU 5) Tanýmlanan taban (a) ve üs (b) deðerlerine göre a
b
‘yi hesaplayan ve konsola
yazdýran programý yazýnýz.
Örneðin; taban = 2, üs = 5 için konsola 32 yazdýrýlmalý.

    int taban = 12;
    int us = 6;
    int sonuc = 1;
    
    for (int i = 1; i <= us; i++){
        sonuc*=taban;
    }
        System.out.println(sonuc);
         */
 /*
SORU 6) Tanýmlanan iki tamsayýnýn en büyük ortak bölenini (EBOB) bulan ve konsola
yazdýran programý yazýnýz.
Örneðin; 12 ve 30 için ? 6 yazdýrýlmalý.
 
    int sayi1 = 48;
    int sayi2 = 100;
    int ebob = 1;
    
    for(int i =1;i <= sayi1 && i <= sayi2; i++){
        if (sayi1 % i == 0 && sayi2 % i == 0){
            ebob =i;
        }
    }
        System.out.println(ebob);
 
         */
 /*
SORU 7) Tanýmlanan iki tamsayýnýn en küçük ortak katýný (EKOK) bulan ve konsola
yazdýran programý yazýnýz.
Örneðin; 12 ve 30 için ? 60 yazdýrýlmalý.
 
    int sayi1 = 7;
    int sayi2 = 250;
    int ebob = 1;
    int ekok = 1;
    
    for(int i =1;i <= sayi1 && i <= sayi2; i++){
        if (sayi1 % i == 0 && sayi2 % i == 0){
            ebob =i;
            ekok = sayi1*sayi2/ebob;
            
        }
    }
            System.out.println(ekok);
 
                //EKOK = 1. sayý * 2. sayý / 1. ve 2. sayýnýn EBOB u
         */
 /*
SORU 8) Tanýmlanan bir tamsayýnýn tüm pozitif bölenlerini konsola yazdýran programý
yazýnýz.
Örneðin; 48 sayýsý için ? 1, 2, 3, 4, 6, 8, 12, 16, 24, 48 yazdýrýlmalý.


        int sayi = 50;
            System.out.println(sayi + " sayýsýnýn pozitif bölenleri:");
 
        for (int i = 1; i <= sayi;i++){
            if (sayi % i == 0){
                System.out.println(i);
            }
        }
                    
         */
 /*
SORU 9) Kullanýcýdan bir tam sayý N deðeri girmesini isteyen ve konsola Fibonacci serisinin
N terimini yazan programý yazýnýz.
F0 = 0,
F1 = 1,
FN = FN-1 + FN-2
Fibonacci serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …


        int a = 0,b =1,c;
        int n = 7;
            for (int i = 1; i < n; i++) {
            c = a + b;
            System.out.print("  " + c + " \t");
            a = b;
            b = c;
        
    }
         */

 /*
SORU 10) Kullanýcýdan bir tam sayý N deðeri girmesini isteyen ve konsola Fibonacci
serisinin N’inci terimini yazan programý yazýnýz.
N = 5 ? “5. Terim = 3”
N = 9 ? “9. Terim = 21”

        int a = 1;
        int b= 2;
        int n = 7;
        int fn = 0;
        
        if (n == 0){
            fn = a;
        } else if (n == 1) {
            fn = b;
        } else {
            for (int i = 2; i <= n; i++) {
                fn = a + b;
                a = b;
                b = fn;
            }
        }
                    System.out.println(n + ". Terim = " + fn);
         */
 /*
SORU 11) Kullanýcýdan bir tam sayý girmesini isteyen ve girilen tam sayýnýn asal sayý olup
olmadýðýný kontrol eden bir program yazýnýz. (Pozitif tamsayýlardan sadece 1’e ve kendisine
tam bölünebilen sayýlara asal sayý denir.)
27 ? “Asal deðildir.”
13 ? “Asal sayýdýr.”


        int sayi = 23;
        boolean asal = true;
        
        if (sayi <= 1 ){
            asal =false;
        }
        else {
            for (int i = 2; i < sayi;i++){
                if (sayi % i == 0){
                    asal = false;
                    
                }
            }
        }
            if (asal){
                System.out.println(sayi + " -> Asal Sayýdýr");
            }

            else {
                System.out.println(sayi + " -> Asal sayý deðildir");
            }
         */

 /*
SORU 12) 1 ile 1000 arasýndaki tüm asal sayýlarý konsola yazdýran programý yazýnýz.


        for (int sayi = 0; sayi <= 1000; sayi++) { 
            boolean asal = true;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    
                }
            }

            if (asal) {
                System.out.println(sayi);
            }
        }

         */

 /*SORU 13) Tanýmlanan iki tamsayýnýn aralarýnda asal olup olmadýðýný kontrol eden programý
yazýnýz. (Ýki sayýnýn 1 dýþýnda pozitif ortak böleni yoksa bu iki sayý aralarýnda asaldýr.)
Örneðin; 4 ve 35 için konsola “Aralarýnda asaldýr” yazdýrmalý.
         
 
         int sayi1 = 5;
        int sayi2 = 35;

        int ebob = 1; 
       
        int kucuk = (sayi1 < sayi2) ? sayi1 : sayi2;

        for (int i = 2; i <= kucuk; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i; 
            }
        }

        if (ebob == 1) {
            System.out.println(sayi1 + " ve " + sayi2 + " aralarýnda asaldýr.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " aralarýnda asal deðildir.");
        }*/
 /*
SORU 14) Tanýmlanan bir sayýnýn tüm asal çarpanlarýný konsola yazdýran programý yazýnýz.
Örneðin; 280 için ? 2x2x2x5x7 yazdýrýlmalý.
         
    int sayi = 512; 
        int bolen = 2;  
       
        System.out.print(sayi + " sayýsýnýn asal çarpanlarý: ");

        for (bolen = 2; bolen <= sayi; ) {
            if (sayi % bolen == 0) {
                System.out.print(bolen);
                sayi = sayi / bolen;
                if (sayi > 1) {
                    System.out.print(" x ");
                }
            } else {
                bolen++; 
            }
        }
 
         */
 /*
SORU 15) Aþaðýdaki formülü kullanarak serinin ilk 10000 terimi ile PI sayýsýnýn deðerini
hesaplayan programý yazýnýz.
         
 
 
        int n = 10000; 
        double pi = 0.0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                pi += 1.0 / (2 * i + 1); // 
            } else {
                pi -= 1.0 / (2 * i + 1); // 
            }
        }

        pi = pi * 4; 

        System.out.println("Pi sayýsýnýn yaklaþýk deðeri: " + pi);
         */
 /*
SORU 16) Aþaðýdaki formülü kullanarak serinin ilk 10000 terimi ile e sayýsýnýn deðerini
hesaplayan programý yazýnýz.   
         
        int n = 10000; 
        double e = 1.0;

        double faktoriyel = 1.0;

        for (int i = 1; i < n; i++) {
            faktoriyel = faktoriyel * i;
            e += 1.0 / faktoriyel;
        }

        System.out.println("e sayýsýnýn yaklaþýk deðeri: " + e);
*/
    }

}
