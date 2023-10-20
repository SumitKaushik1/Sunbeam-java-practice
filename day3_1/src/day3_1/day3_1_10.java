package day3_1;

public class day3_1_10 {
	public static void main(String[]args) {
		String str="sunbeam Infotech";
		str.toLowerCase();
		System.out.println("string:"+str);
		 String s1=str.toLowerCase();
		System.out.println("string:"+s1);
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));	
		System.out.println(s1.contains("sun"));
		String s2="soon";
		String s3=s2.replace('s','m');
		System.out.println("string:"+s2+" string:"+s3);
		String s4="soon";
		String s5=s4.replace("soon","moon");
		System.out.println("string:"+s4+" string:"+s5);
         
	}

}
