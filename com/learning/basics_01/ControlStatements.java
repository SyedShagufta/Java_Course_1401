package com.learning.basics_01;

public class ControlStatements {

    public static void main(String[] args) {

        // if if-else if-else-if(ladder) nested if-else switch
        int ticket_price = 300;

        int aVailable_money = 300, horrorhouse_ticket = 200;

        boolean chaava_Mticket_purchased = true, available = true;

        if (ticket_price == aVailable_money) {

            if (chaava_Mticket_purchased == available) {

                System.out.println("screen no 1");

            }

        } else if (horrorhouse_ticket == aVailable_money) {

            System.out.println("now we r going to explore horror house");

        } else {

            System.out.println("we will explore the mall");

        }


    }
}
