package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // homework 1
           for (int i = 1; i <= 10; i++) {
        System.out.print(i);
           }

           System.out.println();

           int ii = 10;
         while (ii >= 1) {
            System.out.print(ii--);
           }

           System.out.println();

        // homework 2

            for (int weekday = 1; weekday <= 31; weekday++) {
             if (weekday % 5 ==0) {
           System.out.println("Сегодня пятница, " + weekday + " -е число. Необходимо подготовить отчет");
         }
          }

        // homework 3

        int currentYear = 2021;
        int last200Years = currentYear - 200;
        int next100Years = currentYear + 100;
        for (int year =  last200Years; year <= next100Years; year++) {
            if(year % 79 ==0) {
                System.out.println(year);
            }
        }
    }
}

