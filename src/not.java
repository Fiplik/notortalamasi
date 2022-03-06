import java.util.Scanner;
public class not {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;
        //
        System.out.print("Matematik notunu giriniz:");
        mat= input.nextInt();
        //
        System.out.print("Fizik notunu giriniz:");
        fizik= input.nextInt();
        //
        System.out.print("Kimya notunu giriniz:");
        kimya= input.nextInt();
        //
        System.out.print("Türkçe notunu giriniz:");
        turkce= input.nextInt();
        //
        System.out.print("Tarih notunu giriniz:");
        tarih= input.nextInt();
        //
        System.out.print("Müzik notunu giriniz:");
        muzik= input.nextInt();
        int toplam=(fizik+kimya+mat+turkce+tarih+muzik);
                int sonuc=(toplam / 6);
                System.out.println("Öğrencinin Ortalaması:"+ sonuc);
        //
         System.out.print ((sonuc) >= 50 ? "Geçti" : "Kaldı");

    }
}
