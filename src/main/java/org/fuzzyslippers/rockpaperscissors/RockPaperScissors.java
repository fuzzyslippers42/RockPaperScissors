/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fuzzyslippers.rockpaperscissors;
/**
 *
 * @author Nick
 */
public class RockPaperScissors {
    public static void main(String args[]){
        String playerChoice = RPSFunctions.getPlayerChoice();
        String computerChoice = RPSFunctions.getComputerChoice();
        System.out.println("Computer chooses " + computerChoice + "!");
       String winner = RPSFunctions.compareResults(computerChoice, playerChoice);
        System.out.println(winner);
    }
}
