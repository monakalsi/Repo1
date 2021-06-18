/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.projects;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sembh
*/
public class DogGenetics {
    
    public static void main(String[] args) {
        int startPercentage = 100;
        int dogBreedPercentage = 0;
        String dogName;
        Scanner myScanner = new Scanner (System.in);
        Random rGen = new Random();
        
    System.out.println("What is your dog's name?");
    dogName = myScanner.nextLine();
    
    
    String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common cur", "King Doberman"};
    System.out.println( "Well then, i have this highly reliable report on " + dogName + "'s prestigious background right here.");

    
    for (int i=0;i<5;i++){                                                                  
            String breed = breeds[i];
        if(i != 4){
           dogBreedPercentage  =rGen.nextInt(startPercentage);
            startPercentage -= dogBreedPercentage;
        }
        else
        {
            dogBreedPercentage = startPercentage;
        }
        System.out.println(breed + ":" + dogBreedPercentage + "%");
        
    }
    System.out.println("wow, that is quite a dog!");
    }
   
    
}