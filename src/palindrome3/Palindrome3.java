/*
 * Michelle Wojdak
 * To check if a phrase inputted by the user is a palindrome
 * 02/22/19
 */
package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author michellewojdak
 */
public class Palindrome3 {
    public static void main(String[] args) {
       String phrase, backwardsPhrase; //declare String variables
       int pos; //declare inetger variables
       
       //get phrase from the user
       phrase = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase(do not include a punctuation mark):");
       
        //replace spaces between words in the phrase to elimate white space
        phrase = phrase.replace(" ", "");
       
        //Reverse the word
        backwardsPhrase = "";
        for (pos = phrase.length() - 1; pos >= 0; pos--) {
            backwardsPhrase += phrase.charAt(pos);
        }

        //Compare the words and its reverse
        if (phrase.equalsIgnoreCase(backwardsPhrase)) {
            JOptionPane.showMessageDialog(null, phrase+ " in reverse is " + backwardsPhrase
                    + ".\nIt IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, phrase + " in reverse is " + backwardsPhrase
                    + ".\nIt IS NOT a palindrome.");       
        }
    }  
}
