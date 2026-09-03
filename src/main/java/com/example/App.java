package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== INTERNET DATA USAGE BILLING SYSTEM =====");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Plan (Basic/Standard/Premium): ");
        String plan = sc.nextLine();

        System.out.print("Enter Data Usage (GB): ");
        double usage = sc.nextDouble();

        double limit;
        double baseBill;
        double extraRate;

        if (plan.equalsIgnoreCase("Basic")) {
            limit = 50;
            baseBill = 499;
            extraRate = 10;
        } else if (plan.equalsIgnoreCase("Standard")) {
            limit = 100;
            baseBill = 799;
            extraRate = 8;
        } else if (plan.equalsIgnoreCase("Premium")) {
            limit = 200;
            baseBill = 1199;
            extraRate = 5;
        } else {
            System.out.println("Invalid plan!");
            sc.close();
            return;
        }

        double extraCharge = 0;

        if (usage > limit) {
            extraCharge = (usage - limit) * extraRate;
        }

        double totalBill = baseBill + extraCharge;

        System.out.println("\n========== BILL ==========");
        System.out.println("Customer ID   : " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Plan          : " + plan);
        System.out.println("Data Used     : " + usage + " GB");
        System.out.println("Base Bill     : Rs." + baseBill);
        System.out.println("Extra Charge  : Rs." + extraCharge);
        System.out.println("---------------------------");
        System.out.println("Total Bill    : Rs." + totalBill);
        System.out.println("===========================");

        sc.close();
    }
}
