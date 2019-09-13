
package com.pk;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionTest1 {
 
//import java.util.stream.Collectors;
 public static void main (String[] args){
        ArrayList<Employee> empList;
        empList = new ArrayList<>();
        empList.add(new Employee(101,"Mak","A",75000));
        empList.add(new Employee(102,"Ask","A",65000));
        empList.add(new Employee(103,"Abd","A",70000));
        empList.add(new Employee(104,"Abi","A",65000));
        empList.add(new Employee(105,"RAj","B",65000));
        empList.add(new Employee(106,"Sunda","B",85000));
        empList.add(new Employee(107,"Satthy","B",65000));    
        empList.add(new Employee(108,"Rubesh","A",65000));
        
        Predicate<Employee> cond1=e->e.getsal()>66000;
        Predicate<Employee> cond2=e->e.getgrade().equals("B");
        
        Consumer<Employee> output1=e->System.out.println(e.toString());
        Consumer<Employee> output2=e->System.out.println(e.getid()+" "+e.getename()+" "+e.getsal());
        System.out.println("*$$$$$$$$$$$$$$*");
        empList.stream().filter(cond1).forEach(output1);
        System.out.println("*$$$$$$$$$$$$$$*");
        empList.stream().filter(cond2).forEach(output2);
        System.out.println("*$$$$$$$$$$$$$$*");
        Stream<Employee> stream=empList.stream();
        
        stream.filter(cond2).forEach(output1);
        
 }

}
