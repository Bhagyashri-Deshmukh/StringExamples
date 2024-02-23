package string;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = new String( "abcd");
		System.out.println(s1.equals(s2)); // checks the content
		
		System.out.println(s1==s2); // checks the reference
	}

}
