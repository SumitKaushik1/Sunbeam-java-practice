package day2_4;
import java.util.Scanner;
public class day2_4_1 {
static Scanner sc= new Scanner(System.in) ;
public static void accept_arr(int a[])
{   System.out.println("enter the elements: ");
	for(int i=0;i<3;i++)
	{
		a[i]=sc.nextInt();
	}
}
public static void disp_arr(int a[])
{   System.out.println("elements are:");
	for(int i=0;i<3;i++)
	{
	    System.out.print("\t"+a[i]);
	}
}
public static void main(String[]args) {
	int arr[]=new int[3];
	day2_4_1.accept_arr(arr);
	day2_4_1.disp_arr(arr);
}
}
