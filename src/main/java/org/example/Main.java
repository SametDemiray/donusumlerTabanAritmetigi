package org.example;

// Klavyeden girilen 10 tabanındaki pozitif tamsayının,belirtilen tabandaki karşılığını hesaplayan program

//Bilindiği üzere 10 tabanındaki bir tamsayının herhangi bir tabandaki karşılığı; bu tamsayının, taban değerine sürekli bölünmesiyle
// elde edilen kalanların ters sırada yazılmasıyla elde edilir. Benzer şekilde r tabanındaki sayının 10 tabanına dönüşümü
// (abcd.efg)r = ar³+br²+cr¹+dr°+er-¹+fr-²+gr-³ şeklinde yapılmaktadır. Dolayısıyla bu dönüşümde, girilen sayının basamakları
// ayrıştırılmakta ve tabanın kuvvetleriyle çarpılıp toplanmaktadır.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A,N,B,K,i,s=0;
        int[] T = new int[99];

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n        Taban Aritmetiği\n");
        System.out.print("Lütfen Pozitif Bir Tamsayı Giriniz : ");
        A = scanner.nextInt();
        System.out.print(" Hangi Tabana Dönüştürülecek : ");
        N = scanner.nextInt();

        while (A>N-1){
            B = (int) (A/N);
            K = A%N;
            s++;

            T[s-1] = K;
            A=B;
        }
        s++;
        T[s-1]=A;
        System.out.print("\n"+N+" Tabanındaki Karşılığı : ");

        for (i=s-1; i>=0; i--)
            System.out.print(T[i]);
        System.out.println();
    }
}