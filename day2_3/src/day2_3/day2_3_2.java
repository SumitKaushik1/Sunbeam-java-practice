package day2_3;

class test{
	public  void sum(int num1,int num2)
	{
		System.out.println("additon:"+(num1+num2));
	}
	public  void sub(int num1,int num2) {
		System.out.println("subtraction:"+(num1-num2));
	}
	public static void mul(int num1,int num2 ) {
		System.out.println("multiplication:"+(num1*num2));
	}
}
public class day2_3_2 {
    public static void main (String []args)
    {
	test t1=new test();
	t1.sum(50,30);
	t1.sub(70,50);
	t1.mul(50,30);
	test.mul(60,70);
	
    }
}
