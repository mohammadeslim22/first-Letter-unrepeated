/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mohammed
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your sentence");
        String yorsentence = input.nextLine();
        firstchar(yorsentence);

    }

    public static char firstchar(String letters) {

        char[] speratedLetters = new char[letters.length()];
        for (int i = 0; i < letters.length(); i++) {
            speratedLetters[i] = letters.charAt(i);

        }
        for (int i = 0; i < speratedLetters.length; i++) {
            System.out.print(speratedLetters[i]);

        }

        System.out.println("");
        boolean n = true;
        List<Integer> ints = new ArrayList<Integer>();

        for (int i = 0; i < speratedLetters.length; i++) {
            int count = 0;
            char thefirstletternonRepeated = speratedLetters[i];
            for (int j = 0; j < speratedLetters.length; j++) {
                if ((char) speratedLetters[j] == (char) thefirstletternonRepeated) {

                    count++;

                }

            }
            if (count == 1) {
                //  System.out.println(thefirstletternonRepeated + "    this is the first characther nonrepeated");
                ints.add((int) thefirstletternonRepeated);

                // continue;
            }
            //   System.out.println(ints.size() + " size ");

        }
        if (ints.size() == 0) {
            System.out.println("all letters is repeated ");

        }
        for (int i = 0; i < ints.size(); i++) {

            System.out.println((char) ((int) ints.get(i)) + " this the     " + (i+1) + "   letter");
        }
        return 0;
    }

}
