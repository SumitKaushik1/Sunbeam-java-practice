package day3_1;
class day2  {
	int day;
	int month ;
	int year;
	
	public day2() {
	
	}

	public day2(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
class employee{
	int id ;
	int salary;
	day2 doj=new day2();
	public employee() {
		this.id=0;
		this.salary=0;
	   this.doj=new day2();
	}
	public employee(int id, int salary, day2 doj) {
		super();
		this.id = id;
		this.salary = salary;
		this.doj = doj;
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
	public day2 getDoj() {
		return doj;
	}
	public void setDoj(day2 doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
}
public class day3_1_4 {
	public static void main(String[]args) {
		employee emp=new employee();
		emp.setId(20);
		emp.setSalary(70000);
		day2 joindate=new day2(3,9,2021);
		emp.setDoj(joindate);
		joindate=emp.getDoj();
		System.out.println("employee id:"+emp.getId());
		System.out.println("employee salary:"+emp.getSalary());
		System.out.println("employee join day:"+joindate.day+" month:"+joindate.month+" year:"+joindate.year);
        		
	}

}
