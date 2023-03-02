package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra que quer inverter: ");
        String palavra = sc.nextLine(), palavraInvertida = "";
        char letra;

        for(int i = 0; i < palavra.length(); i++){
            letra = palavra.charAt(i);
            palavraInvertida = letra + palavraInvertida;
        }

        System.out.println(palavraInvertida);
    }
}
