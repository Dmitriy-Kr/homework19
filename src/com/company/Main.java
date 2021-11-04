package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amount;
        Scanner scanner = new Scanner(System.in);
        CheckerBanknote ATM = new CheckerBanknote_1000_grn();
        ATM.setNextChecker(new CheckerBanknote_500_grn())
                .setNextChecker(new CheckerBanknote_200_grn())
                        .setNextChecker(new CheckerBanknote_100_grn())
                                .setNextChecker(new CheckerBanknote_50_grn());

        System.out.print("Введите сумму к выдаче кратную 50 грн и не более 25000 грн: ");
        while (true) {
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
                scanner.nextLine();
                if (amount % 50 == 0 && amount <= 25000) {
                    break;
                }
                System.out.print("Введите сумму к выдаче кратную 50 грн и не более 25000 грн: ");
            } else {
                scanner.next();
                System.out.print("Введите сумму к выдаче кратную 50 грн и не более 25000 грн: ");
            }
        }
        ATM.check(amount);
    }
}
