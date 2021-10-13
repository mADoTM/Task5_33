package ru.vsu.cs.dolzhenkoms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Picture pc = new Picture(10);

        pc.printPicture();


    }

    private static int readNumber() {
        Scanner scn = new Scanner(System.in);
        int value = 0;

        System.out.print("[SYSTEM] Enter size of figure - ");
        try {
            value = scn.nextInt();
        }
        catch(Exception ex) {
            System.out.println("[ERROR] Entered wrong data. Value sets in 0");
            value = 0;
        }

        return value;
    }
}
