/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author christopherwatnee
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        String dogName;
        int maxPercent;
        int percent;
        int percentRemaining = 100;
        String[] dogBreeds = {"Standard Schnauzer", "Soft-coated Wheaten Terrier", "Husky", "German Shepherd", "Chihuahua"};
        
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        
        // Prompt for dog's name
        System.out.print("What is your dog's name? ");
        dogName = userInput.nextLine();
        
        System.out.println("Below is the report on " + dogName + "'s DNA background.\n");
        System.out.println(dogName + " is:\n");
        
        // Loop through dog breeds
        for (int i = 0; i < dogBreeds.length; i++) {
            if (i < dogBreeds.length - 1) {
                maxPercent = percentRemaining - (dogBreeds.length - i - 1);
                percent = randomizer.nextInt(maxPercent) + 1;
            } else {
                percent = percentRemaining;
            }
            // Print out percentage
            System.out.println(percent + "% " + dogBreeds[i]);
            percentRemaining -= percent;
        }
        
        System.out.println("\nAmazing, your dog is really unique!");
    }
}
