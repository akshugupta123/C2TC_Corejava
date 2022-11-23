package corejava_package;
class withdraw//inhertence concept parent class
{
	int amt_with=1000;//data member of parent class
}
public class atm extends withdraw {//child class
  int amt_left=15000;//dm of child class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm ob=new atm();
		System.out.println("amt_with" +ob.amt_with);
		System.out.println("amt_left" +ob.amt_left);

	}

}
