package day3_1;

import java.time.LocalDate;

class date{
	private int day;
	private int month;
	private int year;
	public date() {
		LocalDate ldt =LocalDate.now();
            this.day=ldt.getDayOfMonth();
            this.month=ldt.getMonthValue();
            this.year=ldt.getYear();
            
	}
}
public class day3_1_2 {
public static void main(String [] args ) {
	date arr[]=new date[3];
	for(int i=0;i<arr.length;i++)
		arr[i]=new date();
	for(int j=0;j<arr.length;j++)
		System.out.println(arr[j].toString());
	
	
}
}
