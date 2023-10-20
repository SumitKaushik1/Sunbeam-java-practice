package day4_1;
class test1<T>{
	T obj;
	
	test1 (T obj){
		this.obj=obj;
	}

	public T getObj() {
		return obj;
	}
	
	
	
}
public class day4_1_2 {

	public static void main(String[] args) {
		test1<Integer>t1=new test1<Integer>(40);
		System.out.println(t1.getObj());
		test1<String>t2=new test1<String>("sunbeam");
		System.out.println(t2.getObj());
		test1<Float>t3=new test1<Float>(5.5f);
		System.out.println(t3.getObj());
		

	}

}
