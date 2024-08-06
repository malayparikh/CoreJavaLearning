package javabsics;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Learning Java";
		String str2 ="learninG java";
		
		boolean isEqual =str1.equals(str2);
		
		boolean isEq = str1.equalsIgnoreCase(str2);
		
		System.out.println("String are equal : "+isEqual);
		
		System.out.println("String are equal : "+isEq);

	}

}
