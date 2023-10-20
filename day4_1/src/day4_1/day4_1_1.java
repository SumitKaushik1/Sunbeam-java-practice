package day4_1;
class test{
	int num ;
	
	test(int num){
		this.num=num;
	}
	void print_data() {
  System.out.println("num:"+num);
}
}
public  class day4_1_1 {
public static void main(String[]args) {
	test tobj=new test(40);
	tobj.print_data();
}
}
