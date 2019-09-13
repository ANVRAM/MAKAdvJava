
package com.pk;

import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskHandler {
    
    public static void main (String[] args) {
        try (MyTask g=new MyTask();
            FileWriter fw=new FileWriter("d:\\makFile.txt");)
        {
            g.connectResource();
            g.dotask();            
            fw.write("Hi this is my txt");
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(TaskHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
