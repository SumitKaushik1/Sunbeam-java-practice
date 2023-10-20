package day4_1;
public class day4_1_4 {
	static <T> void genericdisplay(T i) {
		System.out.println(i.getClass().getName()+" value:"+i);
	}

	public static void main(String[] args) {

		genericdisplay(11);
		genericdisplay("sunbeam infotech");
		genericdisplay(5.0);
		
				
	}

}
