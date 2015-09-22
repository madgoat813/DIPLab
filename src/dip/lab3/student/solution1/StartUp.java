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
public class StartUp {
    public static void main(String[] args) {
        
        InputStrategy keyboard = new KeyboardInput();
        
        OutputStrategy console = new JOptionPaneOutput();
        
        MessageService ms = new MessageService(keyboard, console);
        
        ms.showMessage();
    }
}
