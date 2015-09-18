
import javax.swing.*;

public class WaitingListGUITest 
{
	
	public static void main(String []args)
	{
		WaitingListGUI wl = new WaitingListGUI();
		wl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wl.setSize(900,450);
		wl.setLocationRelativeTo(null);
		wl.setVisible(true);
		
		/*
		//method to test calling values from Staff.java and Property.java
		returnStaffValues();
		System.out.println();
		returnPropertyValues();
		System.out.println();
		returnApplicationNumber();
		*/
		
/*
		//testing toStrings
		System.out.println("Printing toStrings");
		System.out.println();
		System.out.println("Staff");
		System.out.println();
		Staff staff = new Staff();
		System.out.println(staff.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("Property");
		System.out.println();
		Property property = new Property();
		System.out.println(property.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("Unit");
		System.out.println();
		Unit unit = new Unit();
		System.out.println(unit.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("Customer");
		System.out.println();
		Customer customer = new Customer();
		System.out.println(customer.toString());
		System.out.println();
		
		System.out.println();
		System.out.println("Application");
		System.out.println();
		Application application = new Application();
		System.out.println(application.toString());
	
	*/	
	}
	
	/*
	 
	 
	//testing calling values from Staff.java
	public static int returnStaffValues()
	{
		System.out.println("Testing calling values from Staff.java");
		System.out.println(Staff.getEmployeeId());
		System.out.println(Staff.getStaffFName());
		System.out.println(Staff.getStaffLname());
		return Staff.getEmployeeId();
	}
	
	//testing calling values from Property.java
	public static String returnPropertyValues()
	{
		System.out.println("testing calling values from Property.java");
		System.out.println(Property.getPropertyName());
		System.out.println(Property.getStreet());
		System.out.println(Property.getCity());
		System.out.println(Property.getState());
		return Property.getPropertyName();
		
	}
	
	//testing calling application Number from Customer class
	public static int returnApplicationNumber()
	{
		System.out.println("testing calling application Number from Customer class");
		System.out.println(Customer.getApplicationNumber());
		return Customer.getApplicationNumber();
	}  
	*/
	
	
	
	
	
	
	
	
	
}
