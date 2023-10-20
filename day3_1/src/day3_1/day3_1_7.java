package day3_1;
class person2 {
	String name ;
	int age ;
	person2(){
		System.out.println("inside the person parameterless constructor");
		this.name="default";
		this.age=1;
		}
        person2(String name,int age){
        	System.out.println("inside  person parameterized constructer");
        	this.name=name;
        	this.age=age;
        }
      void disp_record() {
    	  System.out.println("name:"+this.name+"      age:"+this.age);
      }
}

class employee3 extends person2
{   int id;
    int salary;
    employee3(){
    	System.out.println("inside employee parameterless constructer");
    	this.id=1;
    	this.salary=1;
    }
    employee3(String name,int age,int id,int salary){
    	super(name,age);
    	System.out.println("inside  employee parameterized constructer");
         this.id=id;
         this.salary=salary;
    }
    void disp_record() {
    	
		super.disp_record();
		System.out.println("id:"+this.id+"    salary:"+this.salary);
	}
}        
public class day3_1_7 {
	public static void main(String[]args) {
		employee3 emp=new employee3("Akshita",33,1,60000);
		emp.disp_record();

}
}