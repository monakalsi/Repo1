/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.projects;

/**
 *
 * @author sembh
 */
public class summativeSums {
   public static void main(String args[]){
      int[] x = {1, 90, -33, -55, 67, -16, 28, -55, 15};
      int[] y = {999, -60, -77, 14, 160, 301};
      int[] z = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
      
      System.out.println("#1. is " + addit(x));
      System.out.println("#2. is " + addit(y));
      System.out.println("#3. is " + addit(z));
      }
 
   public static int addit(int a[]){

        int sum1 = 0;
        
        for(int i:a) sum1+=i; 
        return sum1;
   }
  
}

    
  
