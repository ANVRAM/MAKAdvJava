
package com.pk;


public class Employee {
    
    private int id;
    private String ename;
    private String grade;
    private double sal;
    
        public Employee(){
            
        }
        public int getid(){
            return id;
        }
        public String getename(){
            return ename;
        }
        public double getsal(){
            return sal;
        }
        public String getgrade(){
            return grade;
        }
        
        public Employee (int id,String ename,String grade,double sal){
            this.id=id;
            this.ename=ename;
            this.grade=grade;
            this.sal=sal;
        }
        
      //  public add

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", ename=" + ename + ", grade=" + grade + ", sal=" + sal + '}';
    }
        
    
}
