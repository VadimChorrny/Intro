package com.chorrny;

import static com.chorrny.NumberService.print;

public class Main {

    public static void main(String[] args) {
        int length = 25, weight = 10;
        char c = '+';
        print(c, length);
        System.out.println();
        for (int i = 0; i < weight - 2; i++) {
            System.out.print(c);
            print(' ', length - 2);
            System.out.println(c);
        }
        print(c, length);
        System.out.println();
    }
}
