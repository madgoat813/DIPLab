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
public class ConsoleMessageOutput implements OutputMessageStrategy{

    @Override
    public void showMessage(InputMessageStrategy message) {
        Message msg = message.getMessage();
        System.out.println(msg.getMsgAsString());
    }
    
}
