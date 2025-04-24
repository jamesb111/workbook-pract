package com.pluralpract;
import java.util.Scanner;

public class StringManipulationApp {
    public static void main(String[] args) {
        //scanner
        Scanner scan = new Scanner(System.in);

        //prompt user for sentence
        System.out.println("Write a sentence please.");
        String userInput = scan.nextLine();
        // print user output
        System.out.println(userInput);
        getLength(userInput);
        System.out.println("--------------------------------");
        upperAndLowerCase(userInput);
        //Prompt user to search for word
        System.out.println("Search for a word in the sentence");
        String wordChoice = scan.nextLine();
        searchSentence(userInput, wordChoice);
        //prompt user to replace word
        System.out.println("What word in the sentence do you want to replace?");
        String wordToReplace = scan.nextLine();
        System.out.println("Replace it with what word?");
        String newWord = scan.nextLine();
        replaceWord(userInput, wordToReplace, newWord);

    }

    public static void getLength(String input) {
        System.out.println("Sentence length is: " + input.trim().length());

    }
    public static void upperAndLowerCase(String input) {
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
    }
    public static void searchSentence(String input, String word) {
        if(input.contains(word)) {
            System.out.println("The word " + word + "is in the sentence. You search was successful");
        } else {
            System.out.println("The word is not in the sentence");
        }
    }
    public static void replaceWord(String input, String word, String rWord) {
        System.out.println(input.replaceAll(word, rWord));

        //Case insensitive version using the (?i) expression
        //System.out.println(input.replaceAll("(?i)" + word, rWord));
    }
}
