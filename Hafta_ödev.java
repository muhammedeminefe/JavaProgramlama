package Hafta_3;

public class Hafta_�dev {
    public static void main(String[] args){
        
       /* SORU 1) Bir tamsay�n�n negatif mi, pozitif mi yoksa s�f�r m� oldu�unu konsola yazd�ran
program� yaz�n�z.
    int sayi = 12;
    if (sayi < 0 ) {
        System.out.println("Say�n�z negatif");
    }
    else if (sayi > 0){
        System.out.println("Say�n�z pozitif");
    }
    else {
        System.out.println("Say�n�z s�f�r");
    }
        */
        
        
        
        
        /* SORU 2) S�cakl�k de�erine g�re suyun halini (kat�, s�v� veya gaz) konsola yazd�ran program�
yaz�n�. 
    
    int s�cakl�k = 135;
    if (s�cakl�k <= 0){
         System.out.println("Su Kat� Haldedir.");
    }
    else if (s�cakl�k >= 100){
         System.out.println("Su Gaz Haldedir.");
    }
    else {
         System.out.println("Su S�v� Haldedir.");
    }
*/



        /*SORU 3) Bir arac�n ilk h�z ve son h�z de�erine g�re, konsola �Yava�l�yor�, �H�zlan�yor�
veya �Sabit H�zda� yazd�ran JAVA program�n� yaz�n�z.
     
    int H�z1 = 91;
    int H�z2 = 90;
    if ((H�z2-H�z1) < 0){
         System.out.println("Ara� yava�l�yor.");
    }
    else if ((H�z2-H�z1) > 0){
         System.out.println("Ara� H�zlan�yor");
    }
    else {
         System.out.println("Ara� sabit h�zda");
    }
*/


       
        
        /* SORU 4) Tan�mlanan �� a�� de�eriyle bir ��gen olu�up olu�amayaca��n� konsola yazd�ran
JAVA program�n� yaz�n�z.
        
    int sayi1 = 75;
    int sayi2 = 83;
    int sayi3 = 23;
    int toplam = (sayi1 + sayi2 + sayi3);
    
    if (toplam == 180){
         System.out.println("Bir ��gen olu�turulabilir.");
    }
    else {
         System.out.println("Bir ��gen olu�turulamaz.");
    }
      */  
        
        
        
       /* SORU 5) �� tamsay� aras�ndaki en b�y�k de�eri bulan ve konsola yazd�ran JAVA
program�n� yaz�n�z.�rne�in; 5, 12, -3 de�erleri i�in ��kt� olarak 12 vermeli.  

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
        
       /* SORU 6) �� tamsay� aras�ndaki en k���k de�eri bulan ve konsola yazd�ran JAVA
program�n� yaz�n�z.

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
        
        
        
        
        /*SORU 7) Bir ��rencinin vize, �dev ve final notunu kullanarak d�nem sonu notunu
hesaplayan, e�er d�nem sonu notu 70 ve �zerindeyse konsola GE�T�, de�ilse KALDIyazd�ran program� yaz�n�z.

  
    int vize = 95;
    int final1 = 60;
    int odev = 100;
    double bolum = 0.2;
    double bolum2 = 0.6;
    double toplam = ((double)vize*bolum) + ((double)final1*bolum2) + ((double)odev*bolum);
    System.out.println (toplam + " ile");
    
    if (toplam > 70){
       System.out.println("GE�T�");
    }
    else {
         System.out.println("KALDI");
    }
    */  
        
        
        
        
        
        /*SORU 8) Tan�mlanan genel a��rl�kl� not ortalamas� (GANO) de�eri i�in a�a��daki aral�klara
g�re uygun harf notunu konsola yazd�ran program� yaz�n�z.
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
        System.out.println("Girdi�iniz say� 1-4 aral���nda olmal�d�r.");
    }

        */
        

        /*SORU 9) A, B, C, D ve E harf notlar�ndan birinin verildi�i bir sistemde, ��rencinin harf
notuna g�re konsola,
    char harfNotu = 'E';
    if (harfNotu == 'A'){
        System.out.println ("�ok iyi");
    }
    else if (harfNotu == 'B'){
         System.out.println ("�yi");
        }
    else if (harfNotu == 'C'){
         System.out.println ("Orta");
        }
    else if (harfNotu == 'D'){
         System.out.println ("K�t�");
        }
    else if (harfNotu == 'E'){
         System.out.println ("�ok k�t�");
        }
      */
        
        /*SORU 10) Bir �r�n�n eski fiyat� ve yeni fiyat�na g�re, konsola �Bu �r�ne %X zam
gelmi�tir� veya �Bu �r�ne %X indirim yap�lm��t�r� ya da �Bu �r�n�n fiyat� de�i�memi�tir�yazd�ran JAVA program�n� yaz�n�z.
    
    int eskiFiyat = 200;
    int yeniFiyat = 200;       
    double zam�nd  = ((double)yeniFiyat-eskiFiyat)/eskiFiyat*100;
    
    if (zam�nd > 0){
        System.out.println ("Bu �r�ne % " + zam�nd + " zam yap�lm��t�r.");
    }
    else if (zam�nd < 0){
        System.out.println ("Bu �r�ne % " + zam�nd + " indirim yap�lm��t�r.");
    }
    else {
        System.out.println ("Bu �r�n�n fiyat� de�i�memi�tir.");
    }
*/



        /*SORU 11) Switch-case yap�s�n� kullanarak; 0�dan 9�a kadar tan�mlanan bir rakam� yaz�yla
konsola yazd�ran, e�er bu aral�k d���ndaysa konsola "Bu bir rakam de�ildir" �eklinde uyar� mesaj� yazan program� yaz�n�z.

�rne�in; 6 i�in ALTI mesaj� konsola yazd�r�lmal�d�r.

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
        default: System.out.println ("Girdi�iniz say� rakam de�ildir.");
    }
*/

        /*SORU 12) �ki basamakl� iki tamsay�n�n, birler basama��ndaki rakamlar�n b�y���n� konsola
yazd�ran JAVA program�n� yaz�n�z.
    
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

        /*SORU 13) Zam d�nemindeki bir firmada 0-5 y�l aras� �al��anlara %20, 6-10 y�l aras�
�al��anlara %25, 11 ve �zeri y�l �al��anlara ise %30 zam yap�lacakt�r. Buna g�re bir �al��an�n
mevcut maa�� ve �al��ma y�l�na g�re alaca�� yeni maa�� hesaplayan ve konsola yazd�ran
program� yaz�n�z.
    
    int zamsizMaas = 22104;
    int yil =11;
    double oran1 = 0.2;
    double oran2 = 0.25;
    double oran3 = 0.3;
    double maas1 = (zamsizMaas*oran1) + zamsizMaas;
    double maas2 = (zamsizMaas*oran2) + zamsizMaas;
    double maas3 = (zamsizMaas*oran3) + zamsizMaas;
          
    if (yil <= 5){
        System.out.println ("Yeni maa��n�z: " + maas1 );
    }
    else if (yil > 5 && yil <= 10){
        System.out.println ("Yeni maa��n�z: " + maas2 );
    }
    else {
        System.out.println ("Yeni maa��n�z: " + maas3 );      
    }
*/



        /*SORU 14) Bir �irket sadece a�a��daki durumlarda �al��anlar�n� sigortalamaktad�r.
? �al��an evli ise
? �al��an evli de�ilse, erkek ve 30 ya��n �zerindeyse
? �al��an evli de�ilse, kad�n ve 25 ya��n �zerindeyse
Buna g�re, bir �al��an�n medeni hali, cinsiyeti ve ya��na g�re sigortal� olup olmayaca��n�
kontrol eden program� yaz�n�z.
    
    boolean evli = false;     
    char cinsiyet = 'E';      
    int yas = 28;
    
    if (evli == true) {
       System.out.println ("Sigortal� �al��an " );   
    }
    else if (evli == false && cinsiyet == 'E' && yas > 30){
        System.out.println ("Sigortal� �al��an " ); 
    }
    else if (evli == false && cinsiyet == 'K' && yas > 25){
        System.out.println ("Sigortal� �al��an " ); 
    }
    else {
        System.out.println ("Sigortal� �al��an de�il." ); 
    }
    */
  
        /*SORU 15) Okulun k�t�phanesinden al�nan bir kitap zaman�nda teslim edilmezse gecikme
g�n say�s�na g�re ��renciye ceza kesilmektedir. Gecikme s�resi 1 haftaya kadar olursa
g�nl�k 10 TL, 3 haftaya kadar olursa 100 TL ile birlikte g�nl�k 15 TL, 3 haftadan daha uzun
olursa da 300 TL ile birlikte g�nl�k 20 TL ��renciye ceza kesilmektedir. K�t�phaneden
ald��� kitab� zaman�nda teslim etmeyen bir ��rencinin, gecikme s�resine g�re �demesi
gereken toplam ceza tutar�n� hesaplayan program� yaz�n�z.
        
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
     System.out.println("Toplam ceza tutar�: " + ceza + " TL");
*/



        /*SORU 16) Tan�mlanan �� kenar uzunlu�u ile bir ��gen olu�up olu�amayaca��n� kontrol
ederek sonucu konsola yazd�ran program� yaz�n�z. (��gen olu�abilmesi i�in herhangi iki
kenar�n toplam� di�er kenardan b�y�k olmal�d�r.)
�rne�in; 4, 12, 5 kenar uzunluklar�yla bir ��gen olu�amaz ��nk� (4+5) ? 12 �art� sa�lanmad�.
6, 3, 4 kenar uzunluklar�yla bir ��gen olu�ur. (6+3) ? 4, (6+4) ? 3, (3+4) ? 6 �artlar� sa�land�.

    int kenar1 = 8;
    int kenar2 = 10;        
    int kenar3 = 18;
    int ucgen1 = kenar1 + kenar2;
    int ucgen2 = kenar1 + kenar3;
    int ucgen3 = kenar2 + kenar3;
   
    if (ucgen1 >= kenar3 && ucgen2 >= kenar2 && ucgen3 >= kenar1){
        System.out.println("Bir ��gen olu�turulabilir.");
    }
    else{
        System.out.println("Bir ��gen olu�turulamaz.");
    }
*/


        
       /* SORU 17) Tan�mlanan �� tamsay� de�erini kendi aralar�nda kar��la�t�rarak k���kten b�y��e
olacak �ekilde konsola yazd�ran program� yaz�n�z.
�rne�in; 5, 8, 3 say�lar� i�in konsola 3, 5, 8 yazd�r�lmal�d�r.


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
         
         
         
         
        /*SORU 18) Tan�mlanan �� tamsay� de�erinin artan s�rada m�, azalan s�rada m� yoksa s�ras�z
m� oldu�unu kontrol eden program� yaz�n�z.
�rne�in; 7, 4, 2 i�in konsola AZALAN
 -3, 0, 5 i�in konsola ARTAN
 4, 7, 2 i�in konsola SIRASIZ yazd�r�lmal�.

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
 
 
 
        /*SORU 19) Market raf�ndaki iki farkl� firmaya ait bitter �ikolatan�n gramaj ve fiyat bilgilerine
g�re fiyat-performans olarak hangi �r�n� alman�n daha avantajl� oldu�unu konsola yazd�ran
program� yaz�n�z.
�rne�in, birinci �r�n 40 gram ve 80 TL, ikinci �r�n 60 gram ve 90 TL ise konsola ��kinci
�r�n daha avantajl�� yazmal�.

    int urun1 = 80;
    int urun2 = 80;
    int fiyat1 = 50;
    int fiyat2 = 50;
    double avantaj1 = (double)urun1/fiyat1;
    double avantaj2 = (double)urun2/fiyat2;
    
    if (avantaj1 > avantaj2){
        System.out.println("1.�r�n daha avantajl�.");
    }
    else if (avantaj2 > avantaj1){
        System.out.println("2. �r�n daha avantajl�");
    }
    else {
        System.out.println("2 �r�nde ayn� avantajda.");
    }
*/

    /*SORU 20) Tamsay� olarak tan�mlanan iki de�er ve karakter tipinde tan�mlanan operat�re (+, -
, *, / veya %) g�re, bu iki say� �zerinde i�lem yapan ve sonucu ekrana yazd�ran program�
yaz�n�z.
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
                System.out.println("Hata: Bir say� s�f�ra b�l�nemez!");
                gecerli = false;
                }
        } else if (islem == '%') {
            if (sayi2 != 0) {
                sonuc = sayi1 % sayi2;
            } else {
                System.out.println("Hata: Mod i�lemi i�in b�len s�f�r olamaz!");
                gecerli = false;
            }
        } else {
            System.out.println("Ge�ersiz operat�r!");
            gecerli = false;
        }

        if (gecerli) {
            System.out.println("Sonu�: " + sonuc);
        }
 */
            
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }
