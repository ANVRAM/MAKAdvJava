/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pk;

/**
 *
 * @author Administrator
 */
public class AppHandler {
    
    public static void main (String []  args){
        Message msg = new Message(){
            @Override
            public void sendMessage() {
                System.out.println("Messgae from Intf");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        Message msg1 = new Message(){
            @Override
            public void sendMessage() {
                System.out.println("Messgae 1 from Intf");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        msg.sendMessage();
    }
    
}
