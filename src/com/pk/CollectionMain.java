package com.pk;


import java.util.ArrayList;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class CollectionMain {
    
    public static void main (String[] args){
        ArrayList<Employee> empList;
        empList = new ArrayList<>();
        empList.add(new Employee(101,"Mak","A",75000));
        empList.add(new Employee(102,"Ask","A",65000));
        empList.add(new Employee(103,"Abd","A",70000));
        empList.add(new Employee(104,"Abi","A",65000));
        empList.add(new Employee(105,"RAj","B",65000));
        empList.add(new Employee(106,"Sunda","B",65000));
        empList.add(new Employee(107,"Satthy","B",65000));    
        empList.add(new Employee(108,"Rubesh","A",65000));
       /* empList.forEach((e) -> {
            System.out.println(e.getid()+" "+e.getename()+" "+e.getgrade()+" "+e.getsal());
        }); //empList.forEach(e->System.out.println(e.getid()+" "+e.getename()+" "+e.getgrade()+" "+e.getsal()) );
        
        
        
        //
        System.out.println("Employeewith grade 'A' is "+
                empList.stream().filter(e->e.getgrade().equals("A")).count());
        //
        
        
        empList.stream().filter(e->e.getgrade().equals("B"))
                .forEach(e->System.out.println(e.getid()+" "+e.getename()+" "+e.getgrade()+" "+e.getsal()));
        
        
      
        
        System.out.println("*$$$$$$$$$$$$$$*");
        
        System.out.println("Employeewith grade 'B' is "+
                empList.stream().filter(e->e.getgrade().equals("B")).count());  
        
          System.out.println("**************");
        
        for (Employee e: empList){
            if (e.getgrade().equals("A"))
            System.out.println(e.getid()+" "+e.getename()+" "+e.getgrade()+" "+e.getsal());
        }
        
        empList.stream().filter(e->e.getgrade().equals("A")).map(e1->e1.getsal()*12)
                .forEach(System.out::println);
        
        */
        
        empList.stream().filter(e->e.getgrade().equals("A"))
                .peek(e->System.out.println(e.toString()))
                .map(e1->e1.getsal()*12)
                .forEach(System.out::println);
        
        System.out.println( empList.stream()
                .collect(Collectors.maxBy((e1,e2)-> e1.getsal()>e2.getsal()?1:-1)).get());
        
        System.out.println("Total Salary :: "+
                empList.stream().collect(Collectors.summarizingDouble(e-> e.getsal())).getSum());
                
 
       
    }
    
    
}
