package com.chorrny;

public class Main {

    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        numberService.NumberCounter(34);
    }
    public static void SumAverage()
    {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            counter+=1;
            sum = counter / i;
        }
    }

    public static void Dobutok(int a)
    {
        int count = 1;
        for (int i = a; i <= 20;i++)
        {
            count *= i;
        }
        System.out.println(count);
    }

    public static int MultOnNumber(int k)
    {
        return 7 * k;
    }

    public static void DivToZero(int numb)
    {
        for (int i = 1;i <= numb;i++)
        {
            if(numb % i == 0)
            {
                System.out.println(i);
            }
        }
    }


    
}
