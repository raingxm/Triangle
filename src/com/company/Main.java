package com.company;

public class Main {
    private static void printAsteriskInHorizonLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.print('*');
        }
    }


    public static void main(String[] args) {
        printAsteriskInHorizonLine(3);
    }
}
