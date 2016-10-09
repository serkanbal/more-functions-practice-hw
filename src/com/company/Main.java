package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println(shakeTheBall());
    }

    public static int getRandomNumber() {
        int rng0 = 0 + (int)(Math.random() * ((8 - 0) + 1));
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

}
