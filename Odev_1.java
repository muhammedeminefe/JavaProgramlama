package hafta_1;

import java.util.Scanner;

public class Odev_1 {

    public static void main(String[] args) {
        /*
SORU 1) Do�um y�l� ve boy (metre), kilo (kg), cinsiyet (E veya K �eklinde bir harf), ��renci
numaras� de�erlerini tutan de�i�kenleri tan�mlay�n�z, bu de�i�kenlere de�erler atay�n�z ve
de�i�kenleri alt alta konsola yazd�ran JAVA program�n� yazd�r�n�z.

int dogumYili = 2006;
double boy = 1.82;
double kilo = 76.3;
char cinsiyet = 'K';
long ogrenciNo = 25151513002L;

System.out.println("Do�um tarihi: " + dogumYili + "\nBoyu: "+ boy + "\nKilosu: "+ kilo + "\nCinsiyeti: " + cinsiyet + "\n��renci Numaras�: " + ogrenciNo );
         */
 /*
    SORU 2) �� tamsay�n�n toplam�n� bulan ve konsola yazd�ran JAVA program�n� yaz�n�z.

    int tamSayi1 = 8;
    int tamSayi2 = 19;
    int tamSayi3 = -25;
    int cevap = tamSayi1 + tamSayi2 + tamSayi3;
     
    System.out.println("Cevap = " + cevap);
         */
 /*
    SORU 3) Bir tamsay�n�n karesini ve k�p�n� konsola yazd�ran JAVA program�n� yaz�n�z.

    int tamSayi = 38;
    int Kare = tamSayi*tamSayi;
    int Kup = tamSayi*tamSayi*tamSayi;
    
    System.out.println("Karesi : " + Kare + "\nK�p� : " + Kup);
         */
 /*
    SORU 4) �ki tamsay�n�n ortalamas�n� bulan ve konsola yazd�ran JAVA program�n� yaz�n�z.

    int tamSayi1 = 17;
    int tamSayi2 = 20;
    double ortalama = ((double) tamSayi1 + tamSayi2)/2;
    
    System.out.println("Ortalamas�: " + ortalama );
         */


 /*
    SORU 5) A�a��daki form�le g�re bir Celsius de�erinin Kelvin cinsinden kar��l���n�
hesaplayarak konsola yazd�ran JAVA program�n� yazd�r�n�z. 
                 K = �C + 273.15
    
    double C = 75;
    double Kelvin = C + 273.15;
    
    System.out.println("Kelvin olarak s�cakl�k: " + Kelvin + " K");
         */
 /*
    SORU 6) Yukar�daki form�le g�re bir Kelvin de�erinin Celcius cinsinden kar��l���n�
hesaplayarak konsola yazd�ran JAVA program�n� yazd�r�n�z.

    double Kelvin = 298.25;
    double C = Kelvin - 273.15;
    
    System.out.println("Havan�n S�cakl���: " + C + " Derece.");
         */
 /*
    SORU 7) Bir �r�n�n fiyat�n�n %18 KDV eklendikten sonraki KDV�li fiyat�n� hesaplayan ve
konsola yazd�ran JAVA program�n� yaz�n�z. (Fiyat bilgisi virg�ll� olabilir, aksi
belirtilmedik�e t�m sorularda bu durum ge�erlidir.)
�rne�in; fiyat = 200 i�in, KDV�li fiyat = 236 olmal�d�r.
 
  int fiyat = 259;
  double KDV = fiyat + (double) fiyat*18/100;
  
  System.out.println("KDV'li fiyat�: " + KDV);
         */
 /*
    SORU 8) Faturan�n KDV�li toplam tutar� ve faturan�n KDV tutar� bilgilerini kullanarak,
KDV oran�n�n y�zde ka� oldu�unu hesaplayan ve konsola yazd�ran JAVA program�n�
yaz�n�z.
�rne�in; KDV�li toplam tutar = 150, KDV tutar� = 30 i�in, KDV oran� %25 bulunmald�r.

    
    int toplam = 489;
    int KDV = 72;
    double KDVsiz = toplam - KDV;
    double KDVorani = KDV/KDVsiz;
    double oran = KDVorani*100;
    
    System.out.println("KDV oran�: %" + oran);
         */
 /*
    SORU 9) Y�kseklik ve yar��ap uzunluklar�na g�re bir silindirin hacmini hesaplayan ve
sonucu konsola yazd�ran JAVA program�n� yaz�n�z.
                              V = ?r 2 h

    int yukseklik = 8;
    final double pi = 3.14;
    double yaricap = 5.9;
    double Hacim = pi*yaricap*yaricap*yukseklik;
    
    System.out.println("Silindirin Hacmi: " + Hacim);
         */
 /*
    SORU 10) Dolar miktar�na ve dolar kuruna g�re, d�vizin T�rk Liras� kar��l���n� hesaplayarak
konsola yazd�ran JAVA program�n� yaz�n�z.
    �uanki kur; 1 dolar = 41,95 T�rk Liras�

    double Dolar = 41.95;
    int miktar = 305;
    double karsilik = Dolar*miktar;
    
    System.out.println("Sahip Oldu�unuz T�rk Liras�: " + karsilik);
         */
 /*
    SORU 11) A�a��daki form�le g�re oC (santigrat derece) de�erine kar��l�k gelen oF
(Fahrenheit) de�erini hesaplayan ve konsola yazd�ran JAVA program�n� yaz�n�z.
                        �F = (9/5) �C + 32
    
    
    double derece = 28.6;
    double Fah = derece*9/5 + 32;
    
    System.out.println("Hava: " + Fah + " Fahrenheit" );
         */
 /*
    SORU 12) A�a��daki form�le g�re V1 (ilk h�z), V2 (son h�z) ve t (s�re) de�erlerine g�re, bir
arac�n ivmesini hesaplayan ve konsola yazd�ran JAVA program�n� yaz�n�z.
                 (V2-V1)/t

    double ilkHiz = 97.9;
    double sonHiz = 172.4;
    double sure = 7.5;
    double ivme = (sonHiz - ilkHiz)/sure;
    
    System.out.println("Arac�n �vmesi: " + ivme);
         */
 /*
    SORU 13) A�a��daki form�le g�re bir arac�n h�z (m/s) ve hareket s�resi (s) de�erlerine g�re
bu arac�n bu s�rede ka� metre yol ald���n� hesaplay�p konsola yazd�ran JAVA program�n�
yaz�n�z.
    
    int zaman = 17;
    int hiz = 138;
    double alinanYol = hiz*zaman;
    
    System.out.println("Arac�n�z, " + alinanYol + " Metre yol alm��t�r. ");
         */
 /*
    SORU 14) Yukar�daki form�le g�re bir arac�n ald��� yol ve hareket s�resi de�erlerine g�re
bu arac�n h�z�n� hesaplay�p konsola yazd�ran JAVA program�n� yaz�n�z.                           
    
    int zaman = 27;
    double alinanYol = 2894.8;
    double hiz = alinanYol/zaman;
    
    System.out.println("Arac�n�z�n H�z�: " + hiz );
         */
 /*
    SORU 15) A�a��daki form�le g�re kilometre cinsinden bir mesafenin mil cinsinden
kar��l���n� hesaplayarak konsola yazd�ran JAVA program�n� yaz�n�z.
          mil=km/1,609344 
    
    double  km = 5984;
    double donusum = 1.609344;
    double mil = km/donusum;
    
    System.out.println("Mesafeniz: " + mil + " Mil");
         */
 /*
    SORU 16) Yukar�daki form�le g�re mil cinsinden bir mesafenin kilometre cinsinden
kar��l���n� hesaplayarak konsola yazd�ran JAVA program�n� yaz�n�z.


    int mil = 9651;
    double donusum = 1.609344;
    double km = mil*donusum;
    
    System.out.println("Mesafeniz: " + km + " Kilometre.");
         */
 /*
    SORU 17) Bir �r�n�n birim fiyat� ve sat�n al�nan adet bilgilerine g�re toplam maliyetini
hesaplayan ve konsola yazd�ran JAVA program�n� yaz�n�z.

    int alinanAdet = 596;
    int fiyat = 187;
    int maliyet = fiyat*alinanAdet;
    
    System.out.println("�r�nlerin Toplam Maliyeti: " + maliyet);
         */
 /*
    SORU 18) Bir �r�n�n kilogram fiyat� ve sat�n al�nan gramaj bilgilerine g�re toplam
maliyetini hesaplay�p konsola yazd�ran JAVA program�n� yaz�n�z.

    int kgFiyat = 139;
    int gramaj = 2392;
    int kg = 1000;
    double grfiyat = (double)kgFiyat/kg;
    int kg2 = gramaj/kg;
    int gr = gramaj%kg;
    double toplam = (gr*grfiyat) + (kgFiyat*kg2) ;
    
     System.out.println("�demeniz gereken tutar : " + toplam + " TL");
         */
        // 
        // System.out.println("Toplam: " + toplam );
        /*
    SORU 19) �ki tamsay�dan, birinci say�n�n son rakam�n�n ikinci say�n�n son rakam�na
b�l�m�nden kalan� konsola yazd�ran JAVA program�n� yaz�n�z.

    int tamSayi1 = 87;
    int tamSayi2 = 42;
    int birlerBasamagi1 = (tamSayi1%10);
    int birlerBasamagi2 = (tamSayi2%10);
    int sonuc = birlerBasamagi1%birlerBasamagi2;
    System.out.println("Sonu�: " + sonuc);
         */
 /*
    SORU 20) Vize, final, quiz ve proje notunu kullanarak bir ��rencinin d�nem sonu a��rl�kl�
notunu hesaplayan ve konsola yazd�ran JAVA program�n� yaz�n�z. (Vize %25, quiz %10,
proje %5 ve final %60 oran�nda d�nem sonu notuna etki etmektedir.)

    int vizeNot = 89;
    int finalNot = 73;
    int quizNot = 82;
    int proje = 100;
    double GANO = ((double)vizeNot*25/100) + ((double)finalNot*60/100) + ((double)quizNot*10/100) + ((double)proje*5/100);
    
    System.out.println("D�nem Sonu A��rl�kl� Not Ortalaman�z: " + GANO);
         */
 /*
    SORU 21) Virg�ll� bir say�n�n virg�lden sonraki k�sm�n� konsola yazd�ran JAVA
program�n� yaz�n�z.
�rne�in; 5.345 de�eri i�in 0.345 bulunmal�
    
    double sayi = 7.694;
    double yazilan = sayi - (int)sayi;
    
    System.out.println("Say�n�z: " + yazilan);
         */
 /*   
SORU 22) Birden fazla basamakl� bir say�n�n birler basama��n� bulan ve konsola yazd�ran
JAVA program�n� yaz�n�z.
    
    int sayi = 1236578455;
    int birlerBasamagi = sayi%10;
    
    System.out.println("Sonu�: " + birlerBasamagi);
         */
 /*   
SORU 23) �� basamakl� bir say�n�n rakamlar�n�n toplam�n� bulan ve konsola yazd�ran JAVA
program�n� yaz�n�z.
�rne�in; say� = 456 i�in 15 bulunmal�
    
    int sayi = 894;
    int birlerBasamak = sayi%10;
    int onlarBasamak = sayi%100/10;
    int yuzlerBasamak = sayi/100;
    
    System.out.println("Toplam: " + (birlerBasamak + onlarBasamak + yuzlerBasamak));
         */
 /*
     SORU 24) �ki basamakl� bir say�n�n rakamlar�n� terse �eviren JAVA program�n� yaz�n�z.
�rne�in; say� = 15 i�in program sonunda say� = 51 olmal�d�r.
    
 int sayi = 45;
 System.out.println("�lk Say�n�z : " + sayi);
 int ceviri1 = sayi/10;
 int ceviri2 = sayi%10;
 int ters = (ceviri2*10) + ceviri1;
 
 System.out.println("Yeni Say�n�z: " + ters);
   /*
  
       
 /*
SORU 25) �ki de�i�kenin de�erini birbiriyle de�i�tiren JAVA program�n� yaz�n�z.
�rne�in; ba�lang��ta i = 3, j = 5 ise program sonunda i = 5, j = 3 olmal�d�r.
5. sayfa
   
    int i = 3;
    int j = 5;

    // De�erleri ekrana yaz
    System.out.println("Ba�lang��ta:");
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    // En kolay y�ntem: ge�ici de�i�ken kullan
    int temp = i;
    i = j;
    j = temp;

    // De�i�tirildikten sonra yaz
    System.out.println("\nDe�i�tirildikten sonra:");
    System.out.println("i = " + i);
    System.out.println("j = " + j);
         */
 /*
SORU 26) �ki i� a��s� bilinen bir ��genin ���nc� i� a��s�n� bulan ve konsola yazd�ran JAVA
program�n� yaz�n�z.
   
    int ac�1 = 78;
    int ac�2 = 47;
    int ac�3 = 180 - (ac�1 + ac�2);
    
    System.out.println("3.A��: " + ac�3);
         */
 /*  
SORU 27) A�a��daki kodun ��kt�s�n� program� �al��t�rmadan tahmin ediniz. (S�navdaki ��kt�
sorular�na bir �rnektir)
    int i = 50 + 20;
	int j = i - 10;
	int k = j * 2;
	double l = k / 6;

	System.out.println("i = " + i);
	System.out.println("j = " + j);
	System.out.println("k = " + k);
	System.out.println("l = " + l);
         */
 /*  
SORU 28) Toplam dakika miktar� de�erini a�a��daki �rnekte oldu�u gibi saat ve dakika
cinsinden konsola yazan JAVA program�n� yaz�n�z.
�rne�in; 546 dakika i�in �9 saat, 6 dakika� �eklinde ��kt� vermeli
  
    int dakika1 = 842;
    int saat = dakika1/60;
    int dakika2 = dakika1%60;
    
    System.out.println( saat + " Saat, " + dakika2 + " Dakika");
    
     
  
   
SORU 29) �u anki toplam n�fus ve y�ll�k n�fus art�� y�zdesi bilgilerine g�re 3 y�ll�k n�fus
projeksiyonu yapan program� yaz�n�z.
�rne�in; �u anki toplam n�fus 80000000 ve y�ll�k n�fus art��� %5 ise;
- Gelecek y�l n�fus 84000000, bir sonraki y�l 88200000, bir sonraki y�l 92610000 olmal�d�r
 
    int nufus1 = 78265412;
    double oran = 7.0/100;
	int nufus2 = nufus1 + (int)(nufus1*oran);
	System.out.println("1 Y�l Sonraki N�fus: " + nufus2);
	int nufus3 = nufus2 + (int)(nufus2*oran);
    System.out.println("2 Y�l Sonraki N�fus: " + nufus3);
    int nufus4 = nufus3 + (int)(nufus3*oran);
    
    System.out.println("3 Y�l Sonraki N�fus: " + nufus4);
         */
 /*  
SORU 30) Bir arac�n gidece�i mesafe (km), bir litre benzin ile ka� km yol gitti�i ve benzinin
litre fiyat� bilgilerine g�re, bu mesafenin ara� sahibine ka� TL'ye malolaca��n� hesaplayan ve
konsola yazd�ran JAVA program�n� yaz�n�z.


double benzinFiyati = 47.83;
int gidilenYol = 1257;
double benzin1yol = 30.7;
double maliyet = (gidilenYol/benzin1yol)*benzinFiyati;

System.out.println("Maliyetiniz: " + maliyet + " TL");

         
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir say� giriniz:");
        int girilen = girdi.nextInt();
        System.out.println(girilen);
*/
    }

}
