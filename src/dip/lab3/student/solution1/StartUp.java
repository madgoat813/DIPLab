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
        
        InputMessageStrategy keyboard = new KeyboardMessageInput();
        
        OutputMessageStrategy console = new ConsoleMessageOutput();
        
        InputMessageStrategy email = new VerifyEmailMessageInput();
        
        OutputMessageStrategy jOption = new JOptionPaneMessageOutput();
        
        MessageService ms = new MessageService(keyboard, console);
        
        MessageService ms2 = new MessageService(email, jOption);
        
        ms.showMessage();
        
        ms2.showMessage();
    }
}
