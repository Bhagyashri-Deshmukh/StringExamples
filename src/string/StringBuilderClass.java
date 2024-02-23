package string;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilde = new StringBuilder();
		
		System.out.println("Capacity is : "+stringBuilde.capacity());
		
		stringBuilde.append("Hi...");
		stringBuilde.append(", ");
		stringBuilde.append("How you feeling now?");
		
		System.out.println(stringBuilde);
		
		System.out.println("Capacity is : "+stringBuilde.capacity());
		
		System.out.println("length is : "+stringBuilde.length());
		
		System.out.println("last index is : "+stringBuilde.lastIndexOf("H"));
	}

}
