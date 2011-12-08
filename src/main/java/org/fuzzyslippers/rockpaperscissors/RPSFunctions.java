/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fuzzyslippers.rockpaperscissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nick
 */
public class RPSFunctions {
    public static String getPlayerChoice(){
        String result;
        result = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Choose your weapon: ");
            String userChoice = reader.readLine().toString().toLowerCase();
            if((userChoice.equalsIgnoreCase("rock"))  || (userChoice.equalsIgnoreCase("paper")) || (userChoice.equalsIgnoreCase("scissors"))){
                return userChoice;
            } else {
                System.out.print("Sorry, but "+ userChoice+" is not a vailid choice, please use rock, paper, or scissors.\n");
                userChoice = getPlayerChoice();
                return userChoice;
            }
        } catch (IOException ex) {
           Logger.getLogger(RPSFunctions.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static String getComputerChoice(){
        String computerChoice = "";
        Random randomChoiceGen = new Random();
        int max = 2;
        int min = 0;
        int randomChoice = randomChoiceGen.nextInt(max - min) ;
        if(randomChoice == 0){
            computerChoice = "Rock";
            return computerChoice;
        } else if(randomChoice == 1){
            computerChoice = "Paper";
            return computerChoice;
        } else if(randomChoice == 2){
            computerChoice = "Scissors";
            return computerChoice;
        }
        return null;
    }
    public static String compareResults(String computerChoice, String userChoice){
        String winner = "";
        if(computerChoice.equalsIgnoreCase(userChoice)){
            winner = "It's a tie!";
            return winner;
        } else if (((computerChoice.equalsIgnoreCase("rock")) && (userChoice.equalsIgnoreCase("scissors"))||((computerChoice.equalsIgnoreCase("paper"))&&userChoice.equalsIgnoreCase("rock"))||((computerChoice.equalsIgnoreCase("scissors"))&&(userChoice.equalsIgnoreCase("paper"))))){
            winner = "The computer wins!";
            return winner;
        } else if  (((userChoice.equalsIgnoreCase("rock")) && (computerChoice.equalsIgnoreCase("scissors"))||((userChoice.equalsIgnoreCase("paper"))&&computerChoice.equalsIgnoreCase("rock"))||((userChoice.equalsIgnoreCase("scissors"))&&(computerChoice.equalsIgnoreCase("paper"))))){
            winner = "You win!";
            return winner;
        }
        return null;
    }
}
