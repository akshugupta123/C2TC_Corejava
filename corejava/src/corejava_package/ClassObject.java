package corejava_package;
//program to show class and object
public class ClassObject {
    String make;//Data Member
    int model;
    double cost;
    int yearofpurch;
    
    public void display1()//member function
    {
    	System.out.println("Yearofpurchase" +2021);
    	System.out.println("make"+ "suzuki");
    }
    public void display2()
    {
    	System.out.println("model" +2000);
    	System.out.println("cost" +700000);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObject ob1=new ClassObject();//creation of oject
		ob1.display1();
		ob1.display2();

	}

}
