package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // homework 1

        int ii = 1;
        while (ii <= 10) {
           System.out.print(ii++);
       }
        System.out.println();

          for (int i = 10; i >= 1; i--) {
       System.out.print(i);
           }

         System.out.println();

        // homework 2

           for (int weekday = 5; weekday <= 31; weekday+=7) {
        System.out.println("Сегодня пятница, " + weekday + " -е число. Необходимо подготовить отчет");
        }


        // homework 3

     int currentYear = 2021;
          int last200Years = currentYear - 200;
     int next100Years = currentYear + 100;
     for (int year = last200Years; year <= next100Years; year++) {
        if(year % 79 ==0) {
             System.out.println(year);
        }
     }

// homework 4
        for (int day = 1; day <= 30; day++) {
            if(day % 3 ==0) {
                System.out.println(day + " ping");
            } else if(day % 5 ==0) {
                System.out.println(day + " pong");
            } else if (day % 3 ==0 && day % 5 ==0) {
                System.out.println(day + " ping pong");
            } else {
                System.out.println(day);
            }
        }


        // homework 5
        int zero = 0;
        int one = 1;
        int nextNumber;
        System.out.print(zero + " " + one + " ");
        for (int fibo = 2; fibo <=9; fibo++) {
            nextNumber = zero + one;
            System.out.print(nextNumber + " ");
            zero = one;
            one = nextNumber;
        }
    }
}

