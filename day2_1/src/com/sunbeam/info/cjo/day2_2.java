package com.sunbeam.info.cjo;

import java.util.Scanner;

class employee1{
	private int id;
	private int salary;
	Scanner sc=new Scanner(System.in);
	 employee1() {
	
	}
	 employee1(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	 void accept_record()
	 {
		 System.out.println("enter the id:");
		 this.id=sc.nextInt();
		 System.out.println("enter the salary:");
		 this.salary=sc.nextInt();
	 }
	void print_record()
	{
		System.out.println("id:"+this.id+" salary:"+this.salary);
	}
			}

public class day2_2 {
     public static void main(String []args) {
    	 employee1 e1=new employee1 ();
    	 employee1 e2=new employee1(7,7000);
    	 e1.print_record();
    	 System.out.println("employee e2 id:"+e2.getId());
    	 employee1 e3=new employee1();
     }
}
