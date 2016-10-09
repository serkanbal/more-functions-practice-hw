package com.company;

import java.util.Scanner;


public class Main {
    static Thread thr = new Thread();

    public static void main(String[] args) {
    mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Welcome to Magic 8 Ball!\n");
        System.out.println("       _.a$$$$$a._\n" +
                "     ,$$$$$$$$$$$$$.\n" +
                "   ,$$$$$$$$$$$$$$$$$.\n" +
                "  d$$$$$$$$$$$$$$$$$$$b\n" +
                " d$$$$$$$$~'\"`~$$$$$$$$b\n" +
                "($$$$$$$p   _   q$$$$$$$)\n" +
                "$$$$$$$$   (_)   $$$$$$$$\n" +
                "$$$$$$$$   (_)   $$$$$$$$\n" +
                "($$$$$$$b       d$$$$$$$)\n" +
                " q$$$$$$$$a._.a$$$$$$$$p\n" +
                "  q$$$$$$$$$$$$$$$$$$$p\n" +
                "   `$$$$$$$$$$$$$$$$$'\n" +
                "     `$$$$$$$$$$$$$'\n" +
                "       `~$$$$$$$~'\n");
        System.out.println("1. For Single Question Mode - Type '1Q'" +
                "\n2. For Double Question Mode - Type '2Q'" +
                "\n3. To Quit - Type 'Quit'\n");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput.toUpperCase()) {
            case "1Q":
                oneQuestionMode();
                break;
            case "2Q":
                //doubleQuestionMode();
                break;
            case "QUIT":
                System.exit(0);
                return;
            default:
                System.out.println("\nThis is not a valid response\n");
                mainMenu();
                break;
        }
    }

    public static void oneQuestionMode() {
        System.out.println("\nThink of your question and type 'Ready'\n");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput.toUpperCase()) {
            case "READY":
                countDownTimer();
                System.out.println(shakeTheBall());
                shakeAgain();
        }

    }

    public static int getRandomNumber() {
        int rng0 = 0 + (int) (Math.random() * ((8 - 0) + 1));
        return rng0;
    }

    public static String shakeTheBall() {
        String computerResponse = "";
        int rng = getRandomNumber();
        switch (rng) {
            case 0:
                computerResponse = "\nIt is decidedly so\n";
                break;
            case 1:
                computerResponse = "\nYes, definitely\n";
                break;
            case 2:
                computerResponse = "\nAs I see it, yes\n";
                break;
            case 3:
                computerResponse = "\nOutlook good\n";
                break;
            case 4:
                computerResponse = "\nSigns point to yes\n";
                break;
            case 5:
                computerResponse = "\nAsk again later\n";
                break;
            case 6:
                computerResponse = "\nBetter not tell you now\n";
                break;
            case 7:
                computerResponse = "\nConcentrate and ask again\n";
                break;
            case 8:
                computerResponse = "\nMy reply is no\n";
                break;
        }
        return computerResponse;
    }

    public static void shakeAgain() {
        System.out.println("Do you want to play again?" +
                "\nIf you want to play again, think of your question first and type 'YES'" +
                "\nIf you don't want to play anymore; type 'NO' to go back to the main menu.\n");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.toUpperCase().contains("YES") == true ||  userInput.toUpperCase().contains("Y") == true) {
            countDownTimer();
            System.out.println(shakeTheBall());
            shakeAgain();
        } else if (userInput.toUpperCase().contains("NO") == true ||  userInput.toUpperCase().contains("N") == true) {
            mainMenu();
        } else {
            System.out.println("Invalid choice!\n");
            shakeAgain();
        }

    }

    public static void countDownTimer() {
        try {
            for (int i = 3; i >= 0; i--) {
                thr.sleep(1000);
                System.out.println(i + "..");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();}
    }
}

