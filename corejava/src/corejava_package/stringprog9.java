package corejava_package;

public class stringprog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Java");
		String str2 = new String("Java");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode() == str2.hashCode());
	}

}
