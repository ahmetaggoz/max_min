package Giris;
import java.util.Scanner;
public class min_max {

    public static void main(String[] args) {
        Scanner kedi = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = kedi.nextInt();
        
        int max = 0, min = 0;
        int control;
        int i = 1;
        
        while(i <= n){
            if (i == 1){
                System.out.print("1. sayıyı girin : ");
                int a = kedi.nextInt();
                max = a;
                min = a;
            } else if (i > 1) {
                System.out.print(i + ". sayıyı girin : ");
                int b = kedi.nextInt();
                if (b < min){
                    min = b;
                }else if (b > max){
                    max = b;
                }
            }
            i++;
        }

        System.out.println("Girilen en büyük sayı : " + max);
        System.out.println("Girilen en küçük sayı : " + min);
        
    }
}