package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número desejado:");
        int a = sc.nextInt();
        int[] vetor = new int[30];
        boolean isPresent = false;

        for (int i = 0; i < 30; i++) {
            int f = fibonacci(i);
            System.out.print(f + " ");
            vetor[i] = f;
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == a) {
                isPresent = true;
                break;
            }
        }

        if(isPresent){
            System.out.println("\nO número " + a + " está presente na sequência.");
        }
        else {
            System.out.println("\nO número " + a + " não está presente na sequência.");
        }
    }

    public static int fibonacci(int num){
        if(num < 2){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}