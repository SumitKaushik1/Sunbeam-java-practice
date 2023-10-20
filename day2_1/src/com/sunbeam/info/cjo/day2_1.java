package com.sunbeam.info.cjo;
import java.util.*;
class employee{
	private int id ;
	private int salary;
	private String name;
	Scanner sc=new Scanner(System.in);
    void accept_record() {
    	System.out.println("enter the id: ");
    	this.id=sc.nextInt();
    	System.out.println("enter the salary: ");
    	this.salary=sc.nextInt();
    	System.out.println("enter the name: ");
    	this.name=sc.next();
    	}
   void print_record()
   {
	   System.out.println("Id:"+this.id+" salary:"+this.salary+" name"+this.name);
	   
   }
@Override
public String toString() {
	return "employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
}
   
}
public class day2_1 {
	
	public static void main(String[]args)
	{
		employee e1=new employee();
		e1.print_record();
		e1.accept_record();
		employee e2;
		e2=new employee();
		e2.accept_record();
		e2.print_record();
		System.out.println("object information:"+e1);
		System.out.println("object information:"+e2);
		
	}

}

