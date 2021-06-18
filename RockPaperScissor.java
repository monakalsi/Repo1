/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.projects;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author sembh
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        int Rock = 1 ;
        int Paper = 2;
        int Scissor = 3;
        
        
        int tie = 0;
        int compWins=0;
        int playerWins=0;
        //The programmer asks how many rounds user wants to play
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of rounds you want to play?");
        int rounds = sc.nextInt();
        
        
       if(rounds<=0 || rounds>10)
       {
           System.out.println("Error: please try again");
           
           return;
       }
       else if(rounds<=10 && rounds>0) 
       {
        System.out.println("Player 1: Choose 1 for Rock, 2 for Paper or 3 for Scissor");
       }
       
        for(int i= 1; i<=rounds; i++ )
        {
        int userChoice = sc.nextInt();
         
           if(userChoice>3 || userChoice<1)
           {
                System.out.println("Invalid entry");
                i--;
           }
        
            
     Random compPlay = new Random();
    int compChoice  = compPlay.nextInt(3)+1;
    System.out.println("Computer selected" + compChoice);
    
    if(compChoice == userChoice)
{
System.out.println("it's a tie");
tie = tie+1;
}
    
else if(userChoice == 1 && compChoice == 2)
{
System.out.println("computer wins");
compWins = compWins+1;}

 if(userChoice ==1 && compChoice == 3)
        {

System.out.println("Player wins");
playerWins = playerWins+1;

        }


else if (userChoice == 2 && compChoice == 1)
{
System.out.println(" Player win");
playerWins=playerWins+1;
}

if(userChoice == 2 && compChoice == 3)
{
System.out.println("computer wins");
compWins = compWins+1;

}
    
else if(userChoice == 3 && compChoice == 1)
{
System.out.println("computer wins");
compWins=compWins+1;}

 if (userChoice == 3 && compChoice ==2){
    
        System.out.println("Player wins");
        playerWins = playerWins+1;
    
   }
        }
    System.out.println("The player wins : " + playerWins + "times");
    System.out.println("The computer wins : " + compWins + "times");
    System.out.println("Ties : " + tie);
        
    if(playerWins>compWins){
        System.out.println("Winner is Player");
    }
        else if(compWins>playerWins){
                System.out.println("Winner is Compuer");
        }
                else if(playerWins==compWins){
                System.out.println("Game is Tied");
                }
                
    
       System.out.println("Do you want to play again?? press 1 to play or 2 to quit");
       
    
               
       Scanner myScanner = new Scanner (System.in);
       int choice= myScanner.nextInt();
       
      if(choice == 1) {
          main(null);
      }
      else if (choice == 2)
      {
          System.out.println("Thanks for playing");
      }

       
       
    }
    }

    
    

    
