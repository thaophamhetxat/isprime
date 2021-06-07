package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen bat ki!");
        number = scanner.nextInt();
        if(number<2){
            System.out.println("day khong phai so nguyen to");
        }else {
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(number)){
                if(number%i==0){
                    check = false;
                    break;
                }i++;
            }
            if(check){
                System.out.println("so nguyen to");
            }else {
                System.out.println("khong la so nguyen to");
            }
        }

    }
}
