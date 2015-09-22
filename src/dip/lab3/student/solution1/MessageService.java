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
public class MessageService {
    private InputMessageStrategy input;
    private OutputMessageStrategy output;

    public MessageService(InputMessageStrategy input, OutputMessageStrategy output) {
        this.input = input;
        this.output = output;
    }
    public void showMessage(){
        output.showMessage(input);
    }
    
}
