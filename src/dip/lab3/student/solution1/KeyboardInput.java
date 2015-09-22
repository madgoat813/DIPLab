/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;


import java.util.Scanner;

/**
 *
 * @author Taylor
 */
public class KeyboardInput implements InputStrategy{
    
    
    public String getMessage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");
        String msg = input.nextLine();
        
        return msg;
    }
}
