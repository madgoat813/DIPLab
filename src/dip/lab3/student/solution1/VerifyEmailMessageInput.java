/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author tmcfall
 */
public class VerifyEmailMessageInput implements InputMessageStrategy{

    private final String verifyEmail = "Please Verify Your Email";
    
    @Override
    public Message getMessage() {
           Message msg = new Message(verifyEmail);
           return msg;
    }
    
}
