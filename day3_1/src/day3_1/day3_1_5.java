package day3_1;
class person {
	String name ;
	int age ;
	person(){
		System.out.println("inside the person parameterless constructor");
		this.name="default";
		this.age=1;
	}
	void show_record() {
		System.out.println("name:"+this.name+"      age:"+this.age);}
	}
class employee1 extends person
{   int id;
    int salary;
    employee1(){
    	System.out.println("inside employee parameterles constructer");
    	this.id=1;
    	this.salary=1;
    }
	void display_record() {
	
		super.show_record();
		System.out.println("id:"+this.id+"    salary:"+this.salary);
	}
}
public class day3_1_5 {
	
public static void main(String[]args) {
employee1 emp =new employee1 ();
emp.display_record();
}
}
