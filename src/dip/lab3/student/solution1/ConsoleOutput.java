/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Taylor
 */
public class ConsoleOutput implements OutputStrategy{

    @Override
    public void showMessage(InputStrategy msg) {
        System.out.println(msg);
    }
    
}
