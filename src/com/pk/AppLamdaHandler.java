package com.pk;

public class AppLamdaHandler {
    public static void Main(String[] args){
        
        Message mesg = () -> {
            System.out.println("Hi... Messgae from LAMBDA HANDLER Intf");};
    
        Message mesg1;
        mesg1 = () -> {
            System.out.println("Hi... Messgae1 from LAMBDA HANDLER Intf");};
    mesg.sendMessage();    
    mesg1.sendMessage();
    
    System.out.println(mesg.invite("RAJ"));
    System.out.println(Message.sendLength("Maruthi"));
    
    CalcInf Calc=(x,y)->{return x+y;};
    
    System.out.println(Calc.caluclate(10, 20));
    //overwriting with the Mutliplication logic 1
    Calc=(x,y)->{return x*y ;};
    
    System.out.println(Calc.caluclate(10, 20));
    
    }         
 }
