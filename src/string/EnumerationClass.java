package string;

enum Color {
	RED,
	GREEN,
	BLUE;
}

public class EnumerationClass {
	
	enum ColorInClass {
		RED,
		GREEN,
		BLUE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1 = Color.RED;
		System.out.println(c1);
		
		ColorInClass c2 = ColorInClass.GREEN;
		System.out.println(c2);
	}

}