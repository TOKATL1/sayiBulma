package org.example;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,3,5,7,2};
        int aranacak = 5;
        boolean varMİ = false;
        for (int sayi : sayilar) {

            if (sayi == aranacak) {


                varMİ = true;
                break;
            }


        }

        if (varMİ) {

            System.out.println("sayi mevcuttur");
        }else{System.out.println("Sayi mevcut değildir");}
    }
}