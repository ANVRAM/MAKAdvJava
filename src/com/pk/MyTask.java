
package com.pk;

public class MyTask implements AutoCloseable{
    
    public void connectResource(){
        System.out.println("I am Connected");
    }
    
    public void disConnect(){
        System.out.println("I am Dis-Connected and Ended");
    }
    public void dotask(){
        
        for (int i=1;i<=10;i++){
            System.out.println ("i="+i);
        }
    }
    
    @Override
    public void close() throws Exception {
        disConnect();
    }
    
}
