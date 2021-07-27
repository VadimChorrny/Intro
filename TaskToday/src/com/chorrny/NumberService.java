package com.chorrny;

import java.util.Scanner;

public class NumberService {
    private int Number;
    private int SumAverage;
    public void NumberCounter(int number) {
        int counter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < number; i++) {
            if(i % 10 == 0)
                zeroCounter++;
            counter += i;

        }

        this.Number = counter;

        System.out.println("Count in your number: "+Number);
        System.out.println("Count zero in your number: "+zeroCounter);
        System.out.println("");
        System.out.println("You wont calculate average?\nEnter - 1 for Yes\nEnter - 0 for No");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        if(action == 1)
        {
            SumAverage(number);
        }
        else if(action == 0)
        {
            System.out.println();
        }
        else
        {
            System.out.println("Okay... bye");
        }
    }
    public void SumAverage(int number)
    {
        SumAverage = Number / number;
        System.out.println("Average: " + SumAverage);
    }
}
