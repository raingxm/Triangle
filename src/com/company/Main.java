package com.company;

public class Main {
    private static void printAsteriskInHorizonLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    private static void printAsteriskInVerticalLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.println('*');
        }
    }
    public static void main(String[] args) {
        printAsteriskInHorizonLine(8);
        printAsteriskInVerticalLine(3);
    }
}
