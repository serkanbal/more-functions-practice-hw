package com.company;

import java.util.Scanner;


public class Main {
    static Thread thr = new Thread();

    public static void main(String[] args) {
    mainMenu();
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

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
        System.out.println("1. For Single Question Mode - Type" + ANSI_BLUE +" '1Q'" + ANSI_RESET +
                "\n2. For Double Question Mode - Type" + ANSI_BLUE + " '2Q'" + ANSI_RESET +
                "\n3. To Quit - Type" + ANSI_BLUE + " 'QUIT'\n" + ANSI_RESET);
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput.toUpperCase()) {
            case "1Q":
                oneQuestionMode();
                break;
            case "2Q":
                doubleQuestionMode();
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
        System.out.println("\nThink of your question and type" + ANSI_YELLOW + " 'READY'\n" + ANSI_RESET);
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput.toUpperCase()) {
            case "READY":
                countDownTimer();
                System.out.println(ANSI_RED + shakeTheBall() + ANSI_RESET);
                shakeAgainOneQ();
                break;
            default:
                System.out.println("\nThis is not a valid response\n");
                oneQuestionMode();
                break;
        }

    }

    public static void doubleQuestionMode() {
        System.out.println("\nThink of two questions and type" + ANSI_PURPLE + " 'READY'\n" + ANSI_RESET);
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput.toUpperCase()) {
            case "READY":
                countDownTimer();
                System.out.println("Answer to the First Question:" + ANSI_RED + shakeTheBall() + ANSI_RESET);
                countDownTimer();
                System.out.println("Answer to the Second Question:" + ANSI_RED + shakeTheBall() + ANSI_RESET);
                shakeAgainDoubleQ();
                break;
            default:
                System.out.println("\nThis is not a valid response\n");
                doubleQuestionMode();
                break;
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
                computerResponse = "\n"+"It is decidedly so\n";
                break;
            case 1:
                computerResponse = "\n" + "Yes, definitely\n";
                break;
            case 2:
                computerResponse = "\n" + "As I see it, yes\n";
                break;
            case 3:
                computerResponse = "\n" + "Outlook good\n";
                break;
            case 4:
                computerResponse = "\n" + "Signs point to yes\n";
                break;
            case 5:
                computerResponse = "\n" + "Ask again later\n";
                break;
            case 6:
                computerResponse = "\n" + "Better not tell you now\n";
                break;
            case 7:
                computerResponse = "\n" + "Concentrate and ask again\n";
                break;
            case 8:
                computerResponse = "\n" + "My reply is no\n";
                break;
        }
        return computerResponse;
    }

    public static void shakeAgainOneQ() {
        System.out.println("Do you want to play again?" +
                "\n1. If you want to play again, think of your question first and type" + ANSI_YELLOW +" 'YES'" + ANSI_RESET +
                "\n2. If you don't want to play anymore; type" + ANSI_YELLOW +" 'NO'" + ANSI_RESET +" to go back to the main menu.\n");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.toUpperCase().contains("YES") == true ||  userInput.toUpperCase().contains("Y") == true) {
            countDownTimer();
            System.out.println(ANSI_RED + shakeTheBall() + ANSI_RESET);
            shakeAgainOneQ();
        } else if (userInput.toUpperCase().contains("NO") == true ||  userInput.toUpperCase().contains("N") == true) {
            mainMenu();
        } else {
            System.out.println("\nThis is not a valid response\n");
            shakeAgainOneQ();
        }

    }

    public static void shakeAgainDoubleQ() {
        System.out.println("Do you want to play again?" +
                "\n1. If you want to play again, think of your questions first and type" + ANSI_PURPLE +" 'YES'" + ANSI_RESET +
                "\n2. If you don't want to play anymore; type" + ANSI_PURPLE + " 'NO'" + ANSI_RESET + " to go back to the main menu.\n");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.toUpperCase().contains("YES") == true ||  userInput.toUpperCase().contains("Y") == true) {
            countDownTimer();
            System.out.println("Answer to the First Question:" + ANSI_RED +shakeTheBall() + ANSI_RESET);
            countDownTimer();
            System.out.println("Answer to the Second Question:" + ANSI_RED + shakeTheBall() + ANSI_RESET);
            shakeAgainDoubleQ();
        } else if (userInput.toUpperCase().contains("NO") == true ||  userInput.toUpperCase().contains("N") == true) {
            mainMenu();
        } else {
            System.out.println("\nThis is not a valid response\n");
            shakeAgainDoubleQ();
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