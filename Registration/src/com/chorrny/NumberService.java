package com.chorrny;

public class NumberService {
    private enum dir {Even, NotEven, Multiples}

    int i = 0;
    int sum = 0;

    public void SelectOneNumber(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Current number: " + i);
        }
    }

    public void FromStartToFinish(int start, int finish) {

        while (start <= finish) {
            System.out.println("Current number: " + i);
            if (i % 2 == 0) // first
            {
                System.out.println("This number even " + i);
            }
            if (i % 2 != 0) // second
            {
                System.out.println("This number don't even " + i);
            }
            if (i % 7 == 0) // third
            {
                System.out.println("This number multiples seven" + i);
            }
            sum+=i;
            i++;

        }
    }

    public void SumTwoNumbers() {
        System.out.println("Sum " + sum);
    }

    public void SumNumber(int numb) {
        for (int i = 0; i < numb; i++) {
            if (numb == 0) {
                System.out.println("Count" + numb);
            }
        }
    }

    public static void print(char c, int size) {
        for (int i = 0; i < size; i++) System.out.print(c);
    }


}
