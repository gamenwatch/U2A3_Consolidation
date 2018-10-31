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
        //declare java functions
        Scanner keyedInput = new Scanner(System.in);
        Random randGen = new Random(); //allow random number generation
        //declare variables and constants
        int total = 0;
        final int NEEDED_CONSTANT = 5; //a constant was needed for the program,
                                       //this is how many numbers will be generated
        
        boolean cont = true; //variable that lets it loop
        int contDecision; //whether or not it will loop again
        
        //introduction
        System.out.println("Random Number Guesser");
        System.out.println("We will generate 5 random numbers between 1-3 and you will try to guess what the sum will be.");
        
        
        while (cont == true) {
            //generate random digits
            int []randomNumber = new int [NEEDED_CONSTANT];
            
            //set total back to zero
            total = 0;

            for (int i = 0; i < NEEDED_CONSTANT; i = i+1)
            {
                randomNumber[i] = 0; //clear the previous
                randomNumber[i] = 1 + randGen.nextInt(3);
               //System.out.println("Generated:"+randomNumber[i]); //displayed for tetsing
            }

            //get sum of the random digits
            for (int i = 0; i < NEEDED_CONSTANT; i = i+1)
            {
               total = total+randomNumber[i];
               //System.out.println("Sum:"+total); //displayed for testing

            }

            //User Answers
            System.out.println("What is the sum?");

            int userInput = keyedInput.nextInt();

            if (userInput == total)
                System.out.println("YOU WERE RIGHT :)");
            else 
                System.out.println("Sorry, the right answer was "+total);
            
            System.out.println("\nDo you want to play again? (1)Yes (2)No");
                
                contDecision = keyedInput.nextInt();
            
                switch (contDecision){
                    case 1: 
                        System.out.println("RAD!\n");
                        break;
                    case 2:
                        cont = false;
                        System.out.println("Thank you come again.");
                        break;
                }
            
            
        }
        
    }
    
}
