package day3_1;

import java.time.LocalDate;

class date1{
	private int day;
	private int month;
	private int year;
	public date1() {
		LocalDate ldt =LocalDate.now();
            this.day=ldt.getDayOfMonth();
            this.month=ldt.getMonthValue();
            this.year=ldt.getYear();
            
	}
	@Override
	public String toString() {
		return "date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
public class day3_1_3 {
public static void main(String [] args ) {
	date1 arr[]=new date1[3];
	for(int i=0;i<arr.length;i++)
		arr[i]=new date1();
	for(int j=0;j<arr.length;j++)
		System.out.println(arr[j].toString());
	
	
}
}