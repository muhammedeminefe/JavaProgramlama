package hafta_4;

public class Odev {

    public static void main(String[] args) {

        /* 
     SORU 1) 1�den N�e kadar olan t�m tamsay�lar�n k�p�n� konsola yazd�ran program� yaz�n�z.
�rne�in; N = 4 i�in ? 1, 8, 27, 64 yazd�r�lmal�.
     
       int n = 5;
       
       for ( int i = 1; i <= n; i++ ){
       int kup = i*i*i;
           System.out.println(kup);
       }
          
         */
 /*   
SORU 2) 1�den N�e kadar olan t�m tamsay�lar�n fakt�riyelini konsola yazd�ran bir program
yaz�n�z.
�rne�in; N= 6 i�in ? 1! = 1
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
SORU 3) Tan�mlanan bir tamsay� de�eri i�in �arp�m tablosu olu�turan ve konsola yazd�ran
program� yaz�n�z.
�rne�in, 3 i�in ? 1 * 3 = 3
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
SORU 4) Tan�mlanan ba�lang�� ve biti� say�lar� aras�ndaki t�m tamsay�lar�n toplam�n� ve
ortalamas�n� konsola yazd�ran program� yaz�n�z. 
   
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
SORU 5) Tan�mlanan taban (a) ve �s (b) de�erlerine g�re a
b
�yi hesaplayan ve konsola
yazd�ran program� yaz�n�z.
�rne�in; taban = 2, �s = 5 i�in konsola 32 yazd�r�lmal�.

    int taban = 12;
    int us = 6;
    int sonuc = 1;
    
    for (int i = 1; i <= us; i++){
        sonuc*=taban;
    }
        System.out.println(sonuc);
         */
 /*
SORU 6) Tan�mlanan iki tamsay�n�n en b�y�k ortak b�lenini (EBOB) bulan ve konsola
yazd�ran program� yaz�n�z.
�rne�in; 12 ve 30 i�in ? 6 yazd�r�lmal�.
 
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
SORU 7) Tan�mlanan iki tamsay�n�n en k���k ortak kat�n� (EKOK) bulan ve konsola
yazd�ran program� yaz�n�z.
�rne�in; 12 ve 30 i�in ? 60 yazd�r�lmal�.
 
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
 
                //EKOK = 1. say� * 2. say� / 1. ve 2. say�n�n EBOB u
         */
 /*
SORU 8) Tan�mlanan bir tamsay�n�n t�m pozitif b�lenlerini konsola yazd�ran program�
yaz�n�z.
�rne�in; 48 say�s� i�in ? 1, 2, 3, 4, 6, 8, 12, 16, 24, 48 yazd�r�lmal�.


        int sayi = 50;
            System.out.println(sayi + " say�s�n�n pozitif b�lenleri:");
 
        for (int i = 1; i <= sayi;i++){
            if (sayi % i == 0){
                System.out.println(i);
            }
        }
                    
         */
 /*
SORU 9) Kullan�c�dan bir tam say� N de�eri girmesini isteyen ve konsola Fibonacci serisinin
N terimini yazan program� yaz�n�z.
F0 = 0,
F1 = 1,
FN = FN-1 + FN-2
Fibonacci serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, �


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
SORU 10) Kullan�c�dan bir tam say� N de�eri girmesini isteyen ve konsola Fibonacci
serisinin N�inci terimini yazan program� yaz�n�z.
N = 5 ? �5. Terim = 3�
N = 9 ? �9. Terim = 21�

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
SORU 11) Kullan�c�dan bir tam say� girmesini isteyen ve girilen tam say�n�n asal say� olup
olmad���n� kontrol eden bir program yaz�n�z. (Pozitif tamsay�lardan sadece 1�e ve kendisine
tam b�l�nebilen say�lara asal say� denir.)
27 ? �Asal de�ildir.�
13 ? �Asal say�d�r.�


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
                System.out.println(sayi + " -> Asal Say�d�r");
            }

            else {
                System.out.println(sayi + " -> Asal say� de�ildir");
            }
         */

 /*
SORU 12) 1 ile 1000 aras�ndaki t�m asal say�lar� konsola yazd�ran program� yaz�n�z.


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

 /*SORU 13) Tan�mlanan iki tamsay�n�n aralar�nda asal olup olmad���n� kontrol eden program�
yaz�n�z. (�ki say�n�n 1 d���nda pozitif ortak b�leni yoksa bu iki say� aralar�nda asald�r.)
�rne�in; 4 ve 35 i�in konsola �Aralar�nda asald�r� yazd�rmal�.
         
 
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
            System.out.println(sayi1 + " ve " + sayi2 + " aralar�nda asald�r.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " aralar�nda asal de�ildir.");
        }*/
 /*
SORU 14) Tan�mlanan bir say�n�n t�m asal �arpanlar�n� konsola yazd�ran program� yaz�n�z.
�rne�in; 280 i�in ? 2x2x2x5x7 yazd�r�lmal�.
         
    int sayi = 512; 
        int bolen = 2;  
       
        System.out.print(sayi + " say�s�n�n asal �arpanlar�: ");

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
SORU 15) A�a��daki form�l� kullanarak serinin ilk 10000 terimi ile PI say�s�n�n de�erini
hesaplayan program� yaz�n�z.
         
 
 
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

        System.out.println("Pi say�s�n�n yakla��k de�eri: " + pi);
         */
 /*
SORU 16) A�a��daki form�l� kullanarak serinin ilk 10000 terimi ile e say�s�n�n de�erini
hesaplayan program� yaz�n�z.   
         
        int n = 10000; 
        double e = 1.0;

        double faktoriyel = 1.0;

        for (int i = 1; i < n; i++) {
            faktoriyel = faktoriyel * i;
            e += 1.0 / faktoriyel;
        }

        System.out.println("e say�s�n�n yakla��k de�eri: " + e);
*/
    }

}
