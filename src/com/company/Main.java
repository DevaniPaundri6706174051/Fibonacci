package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah deret Fibonacci : ");
        int input = scanner.nextInt();
        long fib[] = new long[input];

        fib[0] =1;
        fib[1] =1;
        int n;

        for (int i = 2; i < input ; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println("\nHasil deret Fibonacci : ");
        for (int x = 0; x < input; x++) {
            System.out.print(fib[x] + " ");
        }
    }
}