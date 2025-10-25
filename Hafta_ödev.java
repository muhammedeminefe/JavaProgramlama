package Hafta_3;

public class Hafta_ödev {
    public static void main(String[] args){
        
       /* SORU 1) Bir tamsayýnýn negatif mi, pozitif mi yoksa sýfýr mý olduðunu konsola yazdýran
programý yazýnýz.
    int sayi = 12;
    if (sayi < 0 ) {
        System.out.println("Sayýnýz negatif");
    }
    else if (sayi > 0){
        System.out.println("Sayýnýz pozitif");
    }
    else {
        System.out.println("Sayýnýz sýfýr");
    }
        */
        
        
        
        
        /* SORU 2) Sýcaklýk deðerine göre suyun halini (katý, sývý veya gaz) konsola yazdýran programý
yazýný. 
    
    int sýcaklýk = 135;
    if (sýcaklýk <= 0){
         System.out.println("Su Katý Haldedir.");
    }
    else if (sýcaklýk >= 100){
         System.out.println("Su Gaz Haldedir.");
    }
    else {
         System.out.println("Su Sývý Haldedir.");
    }
*/



        /*SORU 3) Bir aracýn ilk hýz ve son hýz deðerine göre, konsola “Yavaþlýyor”, “Hýzlanýyor”
veya “Sabit Hýzda” yazdýran JAVA programýný yazýnýz.
     
    int Hýz1 = 91;
    int Hýz2 = 90;
    if ((Hýz2-Hýz1) < 0){
         System.out.println("Araç yavaþlýyor.");
    }
    else if ((Hýz2-Hýz1) > 0){
         System.out.println("Araç Hýzlanýyor");
    }
    else {
         System.out.println("Araç sabit hýzda");
    }
*/


       
        
        /* SORU 4) Tanýmlanan üç açý deðeriyle bir üçgen oluþup oluþamayacaðýný konsola yazdýran
JAVA programýný yazýnýz.
        
    int sayi1 = 75;
    int sayi2 = 83;
    int sayi3 = 23;
    int toplam = (sayi1 + sayi2 + sayi3);
    
    if (toplam == 180){
         System.out.println("Bir üçgen oluþturulabilir.");
    }
    else {
         System.out.println("Bir üçgen oluþturulamaz.");
    }
      */  
        
        
        
       /* SORU 5) Üç tamsayý arasýndaki en büyük deðeri bulan ve konsola yazdýran JAVA
programýný yazýnýz.Örneðin; 5, 12, -3 deðerleri için çýktý olarak 12 vermeli.  

    int sayi1 = -71;
    int sayi2 = -82;
    int sayi3 = -16;
    
    if (sayi1 > sayi2 && sayi1 > sayi3 ){
        System.out.println(sayi1);
    }
    else if (sayi2 > sayi3 && sayi2 > sayi1){
        System.out.println(sayi2);
    }
     else {
        System.out.println(sayi3);   
     } 
     */   
        
       /* SORU 6) Üç tamsayý arasýndaki en küçük deðeri bulan ve konsola yazdýran JAVA
programýný yazýnýz.

    int sayi1 = 15;
    int sayi2 = 20;
    int sayi3 = 25;
    
    if (sayi2 < sayi1 && sayi2 <sayi3  ){
        System.out.println(sayi2);
    }
    else if (sayi1 < sayi3 && sayi1 < sayi2){
        System.out.println(sayi1);
    }
     else {
        System.out.println(sayi3);
     }
*/
        
        
        
        
        /*SORU 7) Bir öðrencinin vize, ödev ve final notunu kullanarak dönem sonu notunu
hesaplayan, eðer dönem sonu notu 70 ve üzerindeyse konsola GEÇTÝ, deðilse KALDIyazdýran programý yazýnýz.

  
    int vize = 95;
    int final1 = 60;
    int odev = 100;
    double bolum = 0.2;
    double bolum2 = 0.6;
    double toplam = ((double)vize*bolum) + ((double)final1*bolum2) + ((double)odev*bolum);
    System.out.println (toplam + " ile");
    
    if (toplam > 70){
       System.out.println("GEÇTÝ");
    }
    else {
         System.out.println("KALDI");
    }
    */  
        
        
        
        
        
        /*SORU 8) Tanýmlanan genel aðýrlýklý not ortalamasý (GANO) deðeri için aþaðýdaki aralýklara
göre uygun harf notunu konsola yazdýran programý yazýnýz.
    double GANO = 2.7;
    if (GANO>= 3.5 && GANO <= 4){
        System.out.println("A");
    }
    else if (GANO >= 3){
         System.out.println("B");
    }
    else if (GANO >= 2.5){
         System.out.println("C");
     }
    else if (GANO >= 2){
         System.out.println("D");
     }
    else if (GANO >= 1.5){
         System.out.println("E");
     }
    else if (GANO >= 1){
         System.out.println("F");
     }
    else {
        System.out.println("Girdiðiniz sayý 1-4 aralýðýnda olmalýdýr.");
    }

        */
        

        /*SORU 9) A, B, C, D ve E harf notlarýndan birinin verildiði bir sistemde, öðrencinin harf
notuna göre konsola,
    char harfNotu = 'E';
    if (harfNotu == 'A'){
        System.out.println ("Çok iyi");
    }
    else if (harfNotu == 'B'){
         System.out.println ("Ýyi");
        }
    else if (harfNotu == 'C'){
         System.out.println ("Orta");
        }
    else if (harfNotu == 'D'){
         System.out.println ("Kötü");
        }
    else if (harfNotu == 'E'){
         System.out.println ("Çok kötü");
        }
      */
        
        /*SORU 10) Bir ürünün eski fiyatý ve yeni fiyatýna göre, konsola “Bu ürüne %X zam
gelmiþtir” veya “Bu ürüne %X indirim yapýlmýþtýr” ya da “Bu ürünün fiyatý deðiþmemiþtir”yazdýran JAVA programýný yazýnýz.
    
    int eskiFiyat = 200;
    int yeniFiyat = 200;       
    double zamÝnd  = ((double)yeniFiyat-eskiFiyat)/eskiFiyat*100;
    
    if (zamÝnd > 0){
        System.out.println ("Bu ürüne % " + zamÝnd + " zam yapýlmýþtýr.");
    }
    else if (zamÝnd < 0){
        System.out.println ("Bu ürüne % " + zamÝnd + " indirim yapýlmýþtýr.");
    }
    else {
        System.out.println ("Bu ürünün fiyatý deðiþmemiþtir.");
    }
*/



        /*SORU 11) Switch-case yapýsýný kullanarak; 0’dan 9’a kadar tanýmlanan bir rakamý yazýyla
konsola yazdýran, eðer bu aralýk dýþýndaysa konsola "Bu bir rakam deðildir" þeklinde uyarý mesajý yazan programý yazýnýz.

Örneðin; 6 için ALTI mesajý konsola yazdýrýlmalýdýr.

    int sayi = 10;
    switch (sayi){
        case 0: System.out.println ("0");
            break;
        case 1: System.out.println ("1");
             break; 
        case 2: System.out.println ("2");
             break;
        case 3: System.out.println ("3");
             break;
        case 4: System.out.println ("4");
             break;
        case 5: System.out.println ("5");
            break;
        case 6: System.out.println ("6");
             break;
        case 7: System.out.println ("7");
             break;
        case 8: System.out.println ("8");
             break;
        case 9: System.out.println ("9");
             break;
        default: System.out.println ("Girdiðiniz sayý rakam deðildir.");
    }
*/

        /*SORU 12) Ýki basamaklý iki tamsayýnýn, birler basamaðýndaki rakamlarýn büyüðünü konsola
yazdýran JAVA programýný yazýnýz.
    
    int sayi = 78;
    int sayi2 = 92;        
    int sayiBasamak = sayi%10;
    int sayi2Basamak = sayi2%10;
    
    if (sayiBasamak > sayi2Basamak){
        System.out.println (sayiBasamak);
    }
    else{
         System.out.println (sayi2Basamak);
    }

*/

        /*SORU 13) Zam dönemindeki bir firmada 0-5 yýl arasý çalýþanlara %20, 6-10 yýl arasý
çalýþanlara %25, 11 ve üzeri yýl çalýþanlara ise %30 zam yapýlacaktýr. Buna göre bir çalýþanýn
mevcut maaþý ve çalýþma yýlýna göre alacaðý yeni maaþý hesaplayan ve konsola yazdýran
programý yazýnýz.
    
    int zamsizMaas = 22104;
    int yil =11;
    double oran1 = 0.2;
    double oran2 = 0.25;
    double oran3 = 0.3;
    double maas1 = (zamsizMaas*oran1) + zamsizMaas;
    double maas2 = (zamsizMaas*oran2) + zamsizMaas;
    double maas3 = (zamsizMaas*oran3) + zamsizMaas;
          
    if (yil <= 5){
        System.out.println ("Yeni maaþýnýz: " + maas1 );
    }
    else if (yil > 5 && yil <= 10){
        System.out.println ("Yeni maaþýnýz: " + maas2 );
    }
    else {
        System.out.println ("Yeni maaþýnýz: " + maas3 );      
    }
*/



        /*SORU 14) Bir þirket sadece aþaðýdaki durumlarda çalýþanlarýný sigortalamaktadýr.
? Çalýþan evli ise
? Çalýþan evli deðilse, erkek ve 30 yaþýn üzerindeyse
? Çalýþan evli deðilse, kadýn ve 25 yaþýn üzerindeyse
Buna göre, bir çalýþanýn medeni hali, cinsiyeti ve yaþýna göre sigortalý olup olmayacaðýný
kontrol eden programý yazýnýz.
    
    boolean evli = false;     
    char cinsiyet = 'E';      
    int yas = 28;
    
    if (evli == true) {
       System.out.println ("Sigortalý çalýþan " );   
    }
    else if (evli == false && cinsiyet == 'E' && yas > 30){
        System.out.println ("Sigortalý çalýþan " ); 
    }
    else if (evli == false && cinsiyet == 'K' && yas > 25){
        System.out.println ("Sigortalý çalýþan " ); 
    }
    else {
        System.out.println ("Sigortalý çalýþan deðil." ); 
    }
    */
  
        /*SORU 15) Okulun kütüphanesinden alýnan bir kitap zamanýnda teslim edilmezse gecikme
gün sayýsýna göre öðrenciye ceza kesilmektedir. Gecikme süresi 1 haftaya kadar olursa
günlük 10 TL, 3 haftaya kadar olursa 100 TL ile birlikte günlük 15 TL, 3 haftadan daha uzun
olursa da 300 TL ile birlikte günlük 20 TL öðrenciye ceza kesilmektedir. Kütüphaneden
aldýðý kitabý zamanýnda teslim etmeyen bir öðrencinin, gecikme süresine göre ödemesi
gereken toplam ceza tutarýný hesaplayan programý yazýnýz.
        
    int gecikmeGunu = 30; 
    double ceza = 0;
     
    if (gecikmeGunu <= 7) {
     ceza = gecikmeGunu * 10;
    } 
    else if (gecikmeGunu <= 21) {
     ceza = 100 + (gecikmeGunu * 15);
     } 
    else  {
     ceza = 300 + (gecikmeGunu * 20);
        }
     System.out.println("Toplam ceza tutarý: " + ceza + " TL");
*/



        /*SORU 16) Tanýmlanan üç kenar uzunluðu ile bir üçgen oluþup oluþamayacaðýný kontrol
ederek sonucu konsola yazdýran programý yazýnýz. (Üçgen oluþabilmesi için herhangi iki
kenarýn toplamý diðer kenardan büyük olmalýdýr.)
Örneðin; 4, 12, 5 kenar uzunluklarýyla bir üçgen oluþamaz çünkü (4+5) ? 12 þartý saðlanmadý.
6, 3, 4 kenar uzunluklarýyla bir üçgen oluþur. (6+3) ? 4, (6+4) ? 3, (3+4) ? 6 þartlarý saðlandý.

    int kenar1 = 8;
    int kenar2 = 10;        
    int kenar3 = 18;
    int ucgen1 = kenar1 + kenar2;
    int ucgen2 = kenar1 + kenar3;
    int ucgen3 = kenar2 + kenar3;
   
    if (ucgen1 >= kenar3 && ucgen2 >= kenar2 && ucgen3 >= kenar1){
        System.out.println("Bir üçgen oluþturulabilir.");
    }
    else{
        System.out.println("Bir üçgen oluþturulamaz.");
    }
*/


        
       /* SORU 17) Tanýmlanan üç tamsayý deðerini kendi aralarýnda karþýlaþtýrarak küçükten büyüðe
olacak þekilde konsola yazdýran programý yazýnýz.
Örneðin; 5, 8, 3 sayýlarý için konsola 3, 5, 8 yazdýrýlmalýdýr.


    int sayi1 = 50;
    int sayi2 = 15;
    int sayi3 = 100;
    
    if (sayi1 > sayi2 && sayi1 > sayi3  && sayi2 > sayi3){
        System.out.println(sayi3 + " , " +sayi2 + " , "+ sayi1);
    }
    else if (sayi2 > sayi3 && sayi2 > sayi1 && sayi3 > sayi1){
        System.out.println(sayi1 + " , " +sayi3 + " , "+ sayi2);
    }
    else if (sayi3 > sayi1 && sayi3 > sayi2 && sayi1 > sayi2){
         System.out.println(sayi2 + " , " +sayi1 + " , "+ sayi3);
     }
    else if (sayi1 > sayi2 && sayi1 > sayi3  && sayi3 > sayi2){
        System.out.println(sayi2 + " , " +sayi3 + " , "+ sayi1);
    }
    else if (sayi2 > sayi3 && sayi2 > sayi1 && sayi1 > sayi3){
        System.out.println(sayi3 + " , " +sayi1 + " , "+ sayi2);
    }
    else if (sayi3 > sayi1 && sayi3 > sayi2 && sayi2 > sayi1){
         System.out.println(sayi1 + " , " +sayi2 + " , "+ sayi3);
    }
    */     
         
         
         
         
        /*SORU 18) Tanýmlanan üç tamsayý deðerinin artan sýrada mý, azalan sýrada mý yoksa sýrasýz
mý olduðunu kontrol eden programý yazýnýz.
Örneðin; 7, 4, 2 için konsola AZALAN
 -3, 0, 5 için konsola ARTAN
 4, 7, 2 için konsola SIRASIZ yazdýrýlmalý.

    int sayi = 15;
    int sayi1 = 20;
    int sayi2 = 25;
    
    if (sayi > sayi1 && sayi1 > sayi2){
        System.out.println(sayi2 + " , " +sayi1 + " , "+ sayi + "\tARTAN");
    }
    else if (sayi2 > sayi1 && sayi1 > sayi){
        System.out.println(sayi2 + " , " +sayi1 + " , "+ sayi + "\tAZALAN");
    }
    else{
        System.out.println(sayi + " , " +sayi1 + " , "+ sayi2 + "\tSIRASIZ");
    }
 */
 
 
 
        /*SORU 19) Market rafýndaki iki farklý firmaya ait bitter çikolatanýn gramaj ve fiyat bilgilerine
göre fiyat-performans olarak hangi ürünü almanýn daha avantajlý olduðunu konsola yazdýran
programý yazýnýz.
Örneðin, birinci ürün 40 gram ve 80 TL, ikinci ürün 60 gram ve 90 TL ise konsola “Ýkinci
ürün daha avantajlý” yazmalý.

    int urun1 = 80;
    int urun2 = 80;
    int fiyat1 = 50;
    int fiyat2 = 50;
    double avantaj1 = (double)urun1/fiyat1;
    double avantaj2 = (double)urun2/fiyat2;
    
    if (avantaj1 > avantaj2){
        System.out.println("1.ürün daha avantajlý.");
    }
    else if (avantaj2 > avantaj1){
        System.out.println("2. ürün daha avantajlý");
    }
    else {
        System.out.println("2 üründe ayný avantajda.");
    }
*/

    /*SORU 20) Tamsayý olarak tanýmlanan iki deðer ve karakter tipinde tanýmlanan operatöre (+, -
, *, / veya %) göre, bu iki sayý üzerinde iþlem yapan ve sonucu ekrana yazdýran programý
yazýnýz.
    int sayi1 = 15;
    int sayi2 = 27;
    char islem = '%';
    int sonuc = 0; 
    boolean gecerli = true;
    
    if (islem == '*'){
        System.out.println(sayi1*sayi2);
    }
    else if (islem == '+'){
        System.out.println(sayi1 + sayi2);
    }
    else if (islem == '-'){
        System.out.println(sayi1 - sayi2);
    }
   else if (islem == '/') {
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Hata: Bir sayý sýfýra bölünemez!");
                gecerli = false;
                }
        } else if (islem == '%') {
            if (sayi2 != 0) {
                sonuc = sayi1 % sayi2;
            } else {
                System.out.println("Hata: Mod iþlemi için bölen sýfýr olamaz!");
                gecerli = false;
            }
        } else {
            System.out.println("Geçersiz operatör!");
            gecerli = false;
        }

        if (gecerli) {
            System.out.println("Sonuç: " + sonuc);
        }
 */
            
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }
