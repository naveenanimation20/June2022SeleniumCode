package seleniumsessions;

public class test {

	public static void main(String[] args) {

		String s5="            Hello      Everyone";
		
		System.out.println(s5.length());
//		String s6 = s5.replaceAll("\\s+", " ");
//		
//		System.out.println(s6);
		
		//System.out.println(s5.replaceAll("\\s+"," ")); // Hello      Everyone //not working
		
		String s6=s5.replaceAll("\\p{Zs}+", " ");
		System.out.println(s6);
	}

}
