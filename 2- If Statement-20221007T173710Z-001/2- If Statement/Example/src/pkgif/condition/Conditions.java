/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.condition;

/**
 *
 * @author Omen
 */
public class Conditions {

    /**
     *
     * IF CONDITIONS 
     * => if (condition){} 
     * => if (condition) {} else {} 
     * => if (condition) {} else if (condition) {} 
     * => if (condition) {} else if (condition) {} else if (condition) {} else {}
     */
    /**
     *
     * Arithmetic Operators:
     *
     * => Bigger-Than > 
     * => Less Than  <
     * => Equal == 
     * => Not Equal != 
     * => Bigger Or Equal >= 
     * => Less Or Equal <=
     *
     */
    /**
     *
     * Logical Operators:
     *
     * => AND &&
     * => OR ||
     *
     */
    void checkAverate(double average) {
        
        // هنا بدأنا من تسعين وليس من خمسين
        if (average >= 90) {
            System.out.println("Excellent");

        } else if (average >= 80) {
            System.out.println("V.GOOD");

        } else if (average >= 70) {
            System.out.println("GOOD");

        } else if (average >= 60) {
            System.out.println("PASS");

        } else if (average >= 50) {
            System.out.println("ACCEPTED");

        } else {
            System.out.println("FAILED");
        }
    }

    void checkAge(int age) {
        if (age > 18) {
            System.out.println("Welcome in University");
        } else {
            System.out.println("You must be at least 18 years old!");
        }
    }

    void checkUser(int age, boolean isMarried) {

        // Using && (And) => ALL conditions must be true
        if (age > 20 && isMarried) {
            System.out.println("ALL Conditions are true");
        }

        // Using || (OR) => One condition at LEAST must be true
        if (age > 20 || isMarried) {
            System.out.println("One Condition at LEAST true");
        }

        // Using (!Condition) => Check if condition is FALSE
        if (!isMarried) {
            System.out.println("NOT MARRIED");
        }

    }
}
