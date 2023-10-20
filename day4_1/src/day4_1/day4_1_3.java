package day4_1;
class test3<T,U>{
	T obj1;
	U obj2;
	test3(T obj1,U obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print_data() {
		System.out.println("\t"+obj1);
		System.out.println("\t"+obj2);
	}
}

public class day4_1_3 {

	public static void main(String[] args) {
       test3<Integer,String> t1 =new test3<Integer,String>(33,"Aksita");
       test3<Integer,Integer> t2 =new test3<Integer,Integer>(33,44);
       test3<Integer,Float> t3 =new test3<Integer,Float>(33,5.5f);
       t1.print_data();
       t2.print_data();
       t3.print_data();
	}

}
