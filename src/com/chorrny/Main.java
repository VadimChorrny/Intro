package com.chorrny;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        IsEven(2);
        IsYearDetermine(2020);
    }
    // FIRST TASK
    public static void IsEven(int number)
    {
        if ( number % 2 == 0 )
            System.out.println("Number is even");
        else
            System.out.println("Number don't even");
    }
    // SECOND TASK
    public static void IsYearDetermine(int year)
    {
        System.out.println(((GregorianCalendar) Calendar.getInstance()).isLeapYear(year));

        //if (year % 4 == 0) {
        //    if ((year % 100 != 0) || (year % 400 == 0)) {
        //        System.out.println("true");
        //    }
        //}
        //else {
        //    System.out.println("False");
        //}
    }
    // THIRD TASK
    public static void BobWork()
    {
      //  BobService bob = new BobService(1,1,1);
    }


}
