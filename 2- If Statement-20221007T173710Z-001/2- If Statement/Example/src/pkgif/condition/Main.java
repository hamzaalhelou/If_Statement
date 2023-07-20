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
public class Main {

    public static void main(String[] args) {
        
        Conditions conditions = new Conditions();
        conditions.checkAverate(92);
        conditions.checkAge(15);
        conditions.checkUser(21, false);
    }
}
