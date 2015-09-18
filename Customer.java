import java.util.ArrayList;


public class Customer 
{

	private static int customerId;
	private static String customerFName;
	private static String customerLName;
	private static int customerTelephone;
	private static String customerEmail; 
	private static ArrayList<Unit> unitList= new ArrayList<Unit>();
	
	public Customer()
	{
		setCustomerId(0);
		setCustomerFName(" ");
		setCustomerLName(" ");
		setCustomerTelephone(0);
		setCustomerEmail(" ");
		
	}
	public Customer(int c,String f,String l,int t,String e)
	{
		setCustomerId(c);
		setCustomerFName(f);
		setCustomerLName(l);
		setCustomerTelephone(t);
		setCustomerEmail(e);
	}
	public void setCustomerId(int c)
	{
		customerId=c;
	}
	public void setCustomerFName(String f)
	{
		customerFName=f;
	}
	public void setCustomerLName(String l)
	{
		customerLName=l;
	}
	public void setCustomerTelephone(int t)
	{
		customerTelephone=t;
	}
	public void setCustomerEmail(String e)
	{
		customerEmail=e;
	}
	public void addUnit(Unit c)
	{
		unitList.add(c);
	}
	public static int getCustomerId()
	{
		return customerId;
	}
	public static String getCustomerFName()
	{
		return customerFName;
	}
	public static String getCustomerLName()
	{
		return customerLName;
	}
	public static int getCustomerTelephone()
	{
		return customerTelephone;
	}
	public static String getCustomerEmail()
	{
		return customerEmail;
	}
	public static ArrayList<Unit> getUnitList()
	{
		return unitList;
	}
	public String toString()
	{
		return("Customer ID: " + customerId +" Customer First Name: "+ customerFName + " Customer Last Name: " + customerLName + " Customer Telephone: " + customerTelephone + " Customer Email: " + customerEmail);  
		//" type " + type);
				
	}
	
	public static int getApplicationNumber()
	{
	 	return Application.getApplicationNumber();
	} 
	public static String getApplicationFName()
	{
		return Application.getApplicationFName();
	}
	
	public static String getApplicationLName()
	{
		return Application.getApplicationLName();
	}
	public static int getApplicationTelephone()
	{
		return Application.getApplicationTelephone();
	}
	public static String getApplicationEmail()
	{
		return Application.getApplicationEmail();
	}
	public static int getUnitNumber()
	{
		return Unit.getUnitNumber();
	}
	public static int getPropertyId()
	{
		return Property.getPropertyId();
	}
	public static int getApplicationResidencyNumber()
	{
		return Application.getResidencyNumber();
	}
	
	 
	
}
