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
public class Message {
    private String msgAsString;
    
    public Message(String msg){
        msgAsString = msg;
    }

    public String getMsgAsString() {
        return msgAsString;
    }

    public void setMsgAsString(String msgAsString) {
        this.msgAsString = msgAsString;
    }
    
    
}
