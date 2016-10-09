package com.company;

import java.util.Scanner;


public class Main {
    static Thread thr = new Thread();

    public static void main(String[] args) {
    countDownTimer();
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
                computerResponse = "It is decidedly so";
                break;
            case 1:
                computerResponse = "Yes, definitely";
                break;
            case 2:
                computerResponse = "As I see it, yes";
                break;
            case 3:
                computerResponse = "Outlook good";
                break;
            case 4:
                computerResponse = "Signs point to yes";
                break;
            case 5:
                computerResponse = "Ask again later";
                break;
            case 6:
                computerResponse = "Better not tell you now";
                break;
            case 7:
                computerResponse = "Concentrate and ask again";
                break;
            case 8:
                computerResponse = "My reply is no";
                break;
        }
        return computerResponse;
    }

    public static void shakeAgain() {
        System.out.println("Do you want to play again? (Type in yes / no)");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.toUpperCase().contains("YES") == true ||  userInput.toUpperCase().contains("Y") == true) {
            System.out.println("LOL");
        } else if (userInput.toUpperCase().contains("NO") == true ||  userInput.toUpperCase().contains("N") == true) {
            System.out.println("OLO");
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

