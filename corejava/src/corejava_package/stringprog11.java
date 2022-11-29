package corejava_package;

public class stringprog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = str1.intern();
		String str3 = new String("Java");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str1);

	}

}
