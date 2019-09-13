package com.pk;

//@FunctionalInterface
public interface Message {
    
    void sendMessage();  // one menthod might Fucntional Interface
   //  void hi();
    default String invite(String name)    {
        return "Hello....."+name;
    }
    static int sendLength(String name){
        return name.length();
    }
}
