package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int balance = 100000, withdraw, deposit;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Automated taller machine");
            System.out.println("choose 1 to withdraw");
            System.out.println("choose 2 to deposite");
            System.out.println("choose 3 for check balance");
            System.out.println("chooose 4 for exit");
            System.out.println("choose the opration you want to performe frome above");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to withdraw :");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                        else   {

                            System.out.println("insufficinet balaance");
                        }
                        System.out.println("");

                        break;

                        case 2:

                            System.out.println("Enter money to deposite :");

                            deposit = s.nextInt();
                            balance = balance + deposit;
                            System.out.println("your money has been succecefully deposited");

                            System.out.println();

                            break;


                        case 3:

                            System.out.println("balance :  " + balance);

                            System.out.println("");

                            break;

                        case 4:

                            System.exit(0);
                    }

            }

        }
    }





