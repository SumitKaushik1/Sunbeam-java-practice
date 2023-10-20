package day2_3;
class test2
{
	private int num1;
	private int num2;
	private static int s;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public static int getS() {
		return s;
	}
	public static void setS(int s) {
		test2.s = s;
	}
	 void print_data() {
		 System.out.println("num1:"+num1);
		 System.out.println("num2:"+num2);
	 }
}
public class day2_3_4 {
public static void main(String []args) {
    test2 t1=new test2();
	System.out.print("\t"+t1.getNum1());
	System.out.print("\t"+t1.getNum2());  
	System.out.println("\t"+test2.getS());
     t1.setNum1(25);
     t1.setNum2(30);
     test2.setS(40);
     System.out.print("\t"+t1.getNum1());
 	System.out.print("\t"+t1.getNum2());  
 	System.out.println("\t"+test2.getS());
     
	
}
}
