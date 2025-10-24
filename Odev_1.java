package hafta_1;

import java.util.Scanner;

public class Odev_1 {

    public static void main(String[] args) {
        /*
SORU 1) Doðum yýlý ve boy (metre), kilo (kg), cinsiyet (E veya K þeklinde bir harf), öðrenci
numarasý deðerlerini tutan deðiþkenleri tanýmlayýnýz, bu deðiþkenlere deðerler atayýnýz ve
deðiþkenleri alt alta konsola yazdýran JAVA programýný yazdýrýnýz.

int dogumYili = 2006;
double boy = 1.82;
double kilo = 76.3;
char cinsiyet = 'K';
long ogrenciNo = 25151513002L;

System.out.println("Doðum tarihi: " + dogumYili + "\nBoyu: "+ boy + "\nKilosu: "+ kilo + "\nCinsiyeti: " + cinsiyet + "\nÖðrenci Numarasý: " + ogrenciNo );
         */
 /*
    SORU 2) Üç tamsayýnýn toplamýný bulan ve konsola yazdýran JAVA programýný yazýnýz.

    int tamSayi1 = 8;
    int tamSayi2 = 19;
    int tamSayi3 = -25;
    int cevap = tamSayi1 + tamSayi2 + tamSayi3;
     
    System.out.println("Cevap = " + cevap);
         */
 /*
    SORU 3) Bir tamsayýnýn karesini ve küpünü konsola yazdýran JAVA programýný yazýnýz.

    int tamSayi = 38;
    int Kare = tamSayi*tamSayi;
    int Kup = tamSayi*tamSayi*tamSayi;
    
    System.out.println("Karesi : " + Kare + "\nKüpü : " + Kup);
         */
 /*
    SORU 4) Ýki tamsayýnýn ortalamasýný bulan ve konsola yazdýran JAVA programýný yazýnýz.

    int tamSayi1 = 17;
    int tamSayi2 = 20;
    double ortalama = ((double) tamSayi1 + tamSayi2)/2;
    
    System.out.println("Ortalamasý: " + ortalama );
         */


 /*
    SORU 5) Aþaðýdaki formüle göre bir Celsius deðerinin Kelvin cinsinden karþýlýðýný
hesaplayarak konsola yazdýran JAVA programýný yazdýrýnýz. 
                 K = °C + 273.15
    
    double C = 75;
    double Kelvin = C + 273.15;
    
    System.out.println("Kelvin olarak sýcaklýk: " + Kelvin + " K");
         */
 /*
    SORU 6) Yukarýdaki formüle göre bir Kelvin deðerinin Celcius cinsinden karþýlýðýný
hesaplayarak konsola yazdýran JAVA programýný yazdýrýnýz.

    double Kelvin = 298.25;
    double C = Kelvin - 273.15;
    
    System.out.println("Havanýn Sýcaklýðý: " + C + " Derece.");
         */
 /*
    SORU 7) Bir ürünün fiyatýnýn %18 KDV eklendikten sonraki KDV’li fiyatýný hesaplayan ve
konsola yazdýran JAVA programýný yazýnýz. (Fiyat bilgisi virgüllü olabilir, aksi
belirtilmedikçe tüm sorularda bu durum geçerlidir.)
Örneðin; fiyat = 200 için, KDV’li fiyat = 236 olmalýdýr.
 
  int fiyat = 259;
  double KDV = fiyat + (double) fiyat*18/100;
  
  System.out.println("KDV'li fiyatý: " + KDV);
         */
 /*
    SORU 8) Faturanýn KDV’li toplam tutarý ve faturanýn KDV tutarý bilgilerini kullanarak,
KDV oranýnýn yüzde kaç olduðunu hesaplayan ve konsola yazdýran JAVA programýný
yazýnýz.
Örneðin; KDV’li toplam tutar = 150, KDV tutarý = 30 için, KDV oraný %25 bulunmaldýr.

    
    int toplam = 489;
    int KDV = 72;
    double KDVsiz = toplam - KDV;
    double KDVorani = KDV/KDVsiz;
    double oran = KDVorani*100;
    
    System.out.println("KDV oraný: %" + oran);
         */
 /*
    SORU 9) Yükseklik ve yarýçap uzunluklarýna göre bir silindirin hacmini hesaplayan ve
sonucu konsola yazdýran JAVA programýný yazýnýz.
                              V = ?r 2 h

    int yukseklik = 8;
    final double pi = 3.14;
    double yaricap = 5.9;
    double Hacim = pi*yaricap*yaricap*yukseklik;
    
    System.out.println("Silindirin Hacmi: " + Hacim);
         */
 /*
    SORU 10) Dolar miktarýna ve dolar kuruna göre, dövizin Türk Lirasý karþýlýðýný hesaplayarak
konsola yazdýran JAVA programýný yazýnýz.
    þuanki kur; 1 dolar = 41,95 Türk Lirasý

    double Dolar = 41.95;
    int miktar = 305;
    double karsilik = Dolar*miktar;
    
    System.out.println("Sahip Olduðunuz Türk Lirasý: " + karsilik);
         */
 /*
    SORU 11) Aþaðýdaki formüle göre oC (santigrat derece) deðerine karþýlýk gelen oF
(Fahrenheit) deðerini hesaplayan ve konsola yazdýran JAVA programýný yazýnýz.
                        °F = (9/5) °C + 32
    
    
    double derece = 28.6;
    double Fah = derece*9/5 + 32;
    
    System.out.println("Hava: " + Fah + " Fahrenheit" );
         */
 /*
    SORU 12) Aþaðýdaki formüle göre V1 (ilk hýz), V2 (son hýz) ve t (süre) deðerlerine göre, bir
aracýn ivmesini hesaplayan ve konsola yazdýran JAVA programýný yazýnýz.
                 (V2-V1)/t

    double ilkHiz = 97.9;
    double sonHiz = 172.4;
    double sure = 7.5;
    double ivme = (sonHiz - ilkHiz)/sure;
    
    System.out.println("Aracýn Ývmesi: " + ivme);
         */
 /*
    SORU 13) Aþaðýdaki formüle göre bir aracýn hýz (m/s) ve hareket süresi (s) deðerlerine göre
bu aracýn bu sürede kaç metre yol aldýðýný hesaplayýp konsola yazdýran JAVA programýný
yazýnýz.
    
    int zaman = 17;
    int hiz = 138;
    double alinanYol = hiz*zaman;
    
    System.out.println("Aracýnýz, " + alinanYol + " Metre yol almýþtýr. ");
         */
 /*
    SORU 14) Yukarýdaki formüle göre bir aracýn aldýðý yol ve hareket süresi deðerlerine göre
bu aracýn hýzýný hesaplayýp konsola yazdýran JAVA programýný yazýnýz.                           
    
    int zaman = 27;
    double alinanYol = 2894.8;
    double hiz = alinanYol/zaman;
    
    System.out.println("Aracýnýzýn Hýzý: " + hiz );
         */
 /*
    SORU 15) Aþaðýdaki formüle göre kilometre cinsinden bir mesafenin mil cinsinden
karþýlýðýný hesaplayarak konsola yazdýran JAVA programýný yazýnýz.
          mil=km/1,609344 
    
    double  km = 5984;
    double donusum = 1.609344;
    double mil = km/donusum;
    
    System.out.println("Mesafeniz: " + mil + " Mil");
         */
 /*
    SORU 16) Yukarýdaki formüle göre mil cinsinden bir mesafenin kilometre cinsinden
karþýlýðýný hesaplayarak konsola yazdýran JAVA programýný yazýnýz.


    int mil = 9651;
    double donusum = 1.609344;
    double km = mil*donusum;
    
    System.out.println("Mesafeniz: " + km + " Kilometre.");
         */
 /*
    SORU 17) Bir ürünün birim fiyatý ve satýn alýnan adet bilgilerine göre toplam maliyetini
hesaplayan ve konsola yazdýran JAVA programýný yazýnýz.

    int alinanAdet = 596;
    int fiyat = 187;
    int maliyet = fiyat*alinanAdet;
    
    System.out.println("Ürünlerin Toplam Maliyeti: " + maliyet);
         */
 /*
    SORU 18) Bir ürünün kilogram fiyatý ve satýn alýnan gramaj bilgilerine göre toplam
maliyetini hesaplayýp konsola yazdýran JAVA programýný yazýnýz.

    int kgFiyat = 139;
    int gramaj = 2392;
    int kg = 1000;
    double grfiyat = (double)kgFiyat/kg;
    int kg2 = gramaj/kg;
    int gr = gramaj%kg;
    double toplam = (gr*grfiyat) + (kgFiyat*kg2) ;
    
     System.out.println("ödemeniz gereken tutar : " + toplam + " TL");
         */
        // 
        // System.out.println("Toplam: " + toplam );
        /*
    SORU 19) Ýki tamsayýdan, birinci sayýnýn son rakamýnýn ikinci sayýnýn son rakamýna
bölümünden kalaný konsola yazdýran JAVA programýný yazýnýz.

    int tamSayi1 = 87;
    int tamSayi2 = 42;
    int birlerBasamagi1 = (tamSayi1%10);
    int birlerBasamagi2 = (tamSayi2%10);
    int sonuc = birlerBasamagi1%birlerBasamagi2;
    System.out.println("Sonuç: " + sonuc);
         */
 /*
    SORU 20) Vize, final, quiz ve proje notunu kullanarak bir öðrencinin dönem sonu aðýrlýklý
notunu hesaplayan ve konsola yazdýran JAVA programýný yazýnýz. (Vize %25, quiz %10,
proje %5 ve final %60 oranýnda dönem sonu notuna etki etmektedir.)

    int vizeNot = 89;
    int finalNot = 73;
    int quizNot = 82;
    int proje = 100;
    double GANO = ((double)vizeNot*25/100) + ((double)finalNot*60/100) + ((double)quizNot*10/100) + ((double)proje*5/100);
    
    System.out.println("Dönem Sonu Aðýrlýklý Not Ortalamanýz: " + GANO);
         */
 /*
    SORU 21) Virgüllü bir sayýnýn virgülden sonraki kýsmýný konsola yazdýran JAVA
programýný yazýnýz.
Örneðin; 5.345 deðeri için 0.345 bulunmalý
    
    double sayi = 7.694;
    double yazilan = sayi - (int)sayi;
    
    System.out.println("Sayýnýz: " + yazilan);
         */
 /*   
SORU 22) Birden fazla basamaklý bir sayýnýn birler basamaðýný bulan ve konsola yazdýran
JAVA programýný yazýnýz.
    
    int sayi = 1236578455;
    int birlerBasamagi = sayi%10;
    
    System.out.println("Sonuç: " + birlerBasamagi);
         */
 /*   
SORU 23) Üç basamaklý bir sayýnýn rakamlarýnýn toplamýný bulan ve konsola yazdýran JAVA
programýný yazýnýz.
Örneðin; sayý = 456 için 15 bulunmalý
    
    int sayi = 894;
    int birlerBasamak = sayi%10;
    int onlarBasamak = sayi%100/10;
    int yuzlerBasamak = sayi/100;
    
    System.out.println("Toplam: " + (birlerBasamak + onlarBasamak + yuzlerBasamak));
         */
 /*
     SORU 24) Ýki basamaklý bir sayýnýn rakamlarýný terse çeviren JAVA programýný yazýnýz.
Örneðin; sayý = 15 için program sonunda sayý = 51 olmalýdýr.
    
 int sayi = 45;
 System.out.println("Ýlk Sayýnýz : " + sayi);
 int ceviri1 = sayi/10;
 int ceviri2 = sayi%10;
 int ters = (ceviri2*10) + ceviri1;
 
 System.out.println("Yeni Sayýnýz: " + ters);
   /*
  
       
 /*
SORU 25) Ýki deðiþkenin deðerini birbiriyle deðiþtiren JAVA programýný yazýnýz.
Örneðin; baþlangýçta i = 3, j = 5 ise program sonunda i = 5, j = 3 olmalýdýr.
5. sayfa
   
    int i = 3;
    int j = 5;

    // Deðerleri ekrana yaz
    System.out.println("Baþlangýçta:");
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    // En kolay yöntem: geçici deðiþken kullan
    int temp = i;
    i = j;
    j = temp;

    // Deðiþtirildikten sonra yaz
    System.out.println("\nDeðiþtirildikten sonra:");
    System.out.println("i = " + i);
    System.out.println("j = " + j);
         */
 /*
SORU 26) Ýki iç açýsý bilinen bir üçgenin üçüncü iç açýsýný bulan ve konsola yazdýran JAVA
programýný yazýnýz.
   
    int acý1 = 78;
    int acý2 = 47;
    int acý3 = 180 - (acý1 + acý2);
    
    System.out.println("3.Açý: " + acý3);
         */
 /*  
SORU 27) Aþaðýdaki kodun çýktýsýný programý çalýþtýrmadan tahmin ediniz. (Sýnavdaki çýktý
sorularýna bir örnektir)
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
SORU 28) Toplam dakika miktarý deðerini aþaðýdaki örnekte olduðu gibi saat ve dakika
cinsinden konsola yazan JAVA programýný yazýnýz.
Örneðin; 546 dakika için “9 saat, 6 dakika” þeklinde çýktý vermeli
  
    int dakika1 = 842;
    int saat = dakika1/60;
    int dakika2 = dakika1%60;
    
    System.out.println( saat + " Saat, " + dakika2 + " Dakika");
    
     
  
   
SORU 29) Þu anki toplam nüfus ve yýllýk nüfus artýþ yüzdesi bilgilerine göre 3 yýllýk nüfus
projeksiyonu yapan programý yazýnýz.
Örneðin; þu anki toplam nüfus 80000000 ve yýllýk nüfus artýþý %5 ise;
- Gelecek yýl nüfus 84000000, bir sonraki yýl 88200000, bir sonraki yýl 92610000 olmalýdýr
 
    int nufus1 = 78265412;
    double oran = 7.0/100;
	int nufus2 = nufus1 + (int)(nufus1*oran);
	System.out.println("1 Yýl Sonraki Nüfus: " + nufus2);
	int nufus3 = nufus2 + (int)(nufus2*oran);
    System.out.println("2 Yýl Sonraki Nüfus: " + nufus3);
    int nufus4 = nufus3 + (int)(nufus3*oran);
    
    System.out.println("3 Yýl Sonraki Nüfus: " + nufus4);
         */
 /*  
SORU 30) Bir aracýn gideceði mesafe (km), bir litre benzin ile kaç km yol gittiði ve benzinin
litre fiyatý bilgilerine göre, bu mesafenin araç sahibine kaç TL'ye malolacaðýný hesaplayan ve
konsola yazdýran JAVA programýný yazýnýz.


double benzinFiyati = 47.83;
int gidilenYol = 1257;
double benzin1yol = 30.7;
double maliyet = (gidilenYol/benzin1yol)*benzinFiyati;

System.out.println("Maliyetiniz: " + maliyet + " TL");

         
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayý giriniz:");
        int girilen = girdi.nextInt();
        System.out.println(girilen);
*/
    }

}
