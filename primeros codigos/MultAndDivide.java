/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multanddivide;

/**
 *
 * @author user
 */
public class MultAndDivide {

    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + (subtotal*tax);
        double perPerson = total/4;

        System.out.println(total);
        System.out.println(perPerson);
    }
}
