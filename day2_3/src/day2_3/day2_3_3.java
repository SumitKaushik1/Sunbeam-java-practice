package day2_3;
   import java.util.*;
class test1{
	private int num1;
	private int num2;
	private static int s;
	static Scanner sc=new Scanner(System.in);
	 test1() {
		this.num1=10;
		this.num2=20;
	}
	 static {
		 System.out.println("enter the number:");
		 test1.s=sc.nextInt();
	 }
	public void print_data() {
		System.out.println("num1:"+num1+" num2:"+num2+" s="+s);
	}
	
}
public class day2_3_3 {

	public static void main(String []args)
	{
		test1 t1=new test1();
		t1.print_data();
		
	}
}
