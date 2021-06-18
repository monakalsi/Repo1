/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.projects;

import java.util.Scanner;

/**
 *
 * @author sembh
 */
public class HealthyHeart {
    public static void main(String[] args) {
        int age;
        int heartbeat;
        float targetHeartRateMin;
        float targetHeartRateMax;
        float targeHeartRate =0;
        
        Scanner myScanner = new Scanner(System.in);
        
        String StringAge;
        System.out.println("Enter your age: ");
        StringAge = myScanner.nextLine();
        age = Integer.parseInt(StringAge);
        heartbeat = 220 - age;
        System.out.println("Your heartbeat: " + heartbeat);
        targetHeartRateMin = (int) (heartbeat * 50/100f);
        targetHeartRateMax = (int) (heartbeat * 85/100f);
        
       System.out.println("your target heart rate is: " + targetHeartRateMin + " " + targetHeartRateMax + " ");
        
    }   
        
}


