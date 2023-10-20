package day3_1;
class person1 {
	String name ;
	int age ;
	person1(){
		System.out.println("inside the person parameterless constructor");
		this.name="default";
		this.age=1;
		}
        person1(String name,int age){
        	System.out.println("inside  person parameterized constructer");
        	this.name=name;
        	this.age=age;
        }
        void show_record() {
    		System.out.println("name:"+this.name+"      age:"+this.age);}
    	
}

class employee2 extends person1
{   int id;
    int salary;
    employee2(){
    	System.out.println("inside employee parameterless constructer");
    	this.id=1;
    	this.salary=1;
    }
    employee2(String name,int age,int id,int salary){
    	super(name,age);
    	System.out.println("inside  employee parameterized constructer");
         this.id=id;
         this.salary=salary;
    }
    void display_record() {
    	
		super.show_record();
		System.out.println("id:"+this.id+"    salary:"+this.salary);
	}
}
public class day3_1_6 {
public static void main(String[]args) {
	employee2 emp=new employee2("Akshita",33,1,60000);
	emp.display_record();
}
}                        
