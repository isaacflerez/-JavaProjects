/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.greaterthanequalto;

/**
 *
 * @author user
 */
public class GreaterThanEqualTo {

    public static void main(String[] args) {
         double recommendedWaterIntake = 8;
         double daysInChallenge = 30;
         double yourWaterIntake = 235.5;
         double totalRecommendedAmount = recommendedWaterIntake*daysInChallenge;
         boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
         System.out.println(isChallengeComplete);
    }
}
