/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_show.what.you.know;

import java.util.Scanner;
import java.util.Random;

/**
 * Jacob L
 * Oct 29 2018
 * Practice Using Arrays
 */
public class U2_A3_ShowWhatYouKnow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        Random randGen = new Random(); //allow random number generation
        
        int total = 0;
        System.out.println("Random Number Guesser");
        System.out.println("We will generate 5 random numbers between 1-3 and you will try to guess what the sum will be.");
        final int NEEDED_CONSTANT = 5;
        
        int []randomNumber = new int [NEEDED_CONSTANT];
                
        for (int i = 0; i < NEEDED_CONSTANT; i = i+1)
        {
           randomNumber[i] = 1 + randGen.nextInt(3);
           //System.out.println("Generated:"+randomNumber[i]);
        }
        
        for (int i = 0; i < NEEDED_CONSTANT; i = i+1)
        {
           total = total+randomNumber[i];
           //System.out.println("Sum:"+total); //displayed for testing
           
        }
        
        System.out.println("What is the sum?");
        
        int userInput = keyedInput.nextInt();
        
        if (userInput == total)
            System.out.println("YOU WERE RIGHT :)");
        else 
            System.out.println("Sorry, the right answer was "+total);


    }
    
}
