/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package greaterlessthan;

/**
 *
 * @author user
 */
public class GreaterLessThan {

    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar; 
        System.out.println(creditsEarned > creditsToGraduate);
        System.out.println(creditsToGraduate < creditsAfterSeminar);
    }
}
