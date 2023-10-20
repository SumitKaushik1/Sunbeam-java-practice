package day2_4;
import java.util.Scanner;
public class day2_4_2 {
static Scanner sc= new Scanner(System.in) ;
public static void accept_arr(int arr[][])
{   System.out.println("enter the elements: ");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
	{
		arr[i][j]=sc.nextInt();
	}
		
	}
}
public static void disp_arr(int arr[][])
{   System.out.println("elements are:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
	{
	    System.out.print("\t"+arr[i][j]);
	}
		System.out.println("");
	}
}
public static void main(String[]args) {
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	System.out.println("a:");
	day2_4_2.accept_arr(a);
	System.out.println("b:");
	day2_4_2.accept_arr(b);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("elements array a:\n");
	day2_4_2.disp_arr(a);
	System.out.println("elements array b:\n");
	day2_4_2.disp_arr(b);
	System.out.println("elements array c:\n");
	day2_4_2.disp_arr(c);
}
}