import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Basamak sayısı giriniz:");
        int sayi= sc.nextByte();
        for (int i=sayi; i>0; i--){
            for (int k=sayi-i; k>0; k--){
                System.out.print("");
            }
            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
