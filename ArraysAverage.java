package Arrays;
import java.util.Scanner;

public class ArraysAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan dizinin boyutu alınır
        System.out.println("Kaç elemanlı bir dizi oluşturmak istiyorsunuz: ");
        int n = input.nextInt();

        //Dizi oluşturulur
        int[] dizi = new int[n];


        //Dizinin elemanları alınır
        for (int i = 0 ; i < n ; i++){
            System.out.println("Dizinin " + (i + 1) + ". elemanını giri: ");
            dizi[i] = input.nextInt();
        }

        //Dizinin elemanlarını toplama
        double toplam = 0;
        for(int i = 0; i < n ; i++){
            toplam += dizi[i];
        }

        //Ortalama hesaplama
        double average = toplam / n;

        //Sonucu ekrana yazdır
        System.out.println("Dizinin ortalaması: " + average);

        //Scanner'ı kapatıyoruz
        input.close();
    }
}
