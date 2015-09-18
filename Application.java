
public class Application 
{

	private static int applicationNumber;
	
	private static String applicationFName;
	private static String applicationLName;
	private static int applicationTelephone;
	private static String applicationEmail;
	private static int residencyNumber;
	
	public Application()
	{
		setApplicationNumber(0);
		setApplicationFName(" ");
		setApplicationLName(" ");
		setApplicationTelephone(0);
		setApplicationEmail(" ");
		setResidencyNumber(0);
	}
	public Application(int n,String f,String l, int t,String e, int r)
	{
		setApplicationNumber(n);
		setApplicationFName(f);
		setApplicationLName(l);
		setApplicationTelephone(t);
		setApplicationEmail(e);
		setResidencyNumber(r);
	}
	public void setApplicationNumber(int n)
	{
		applicationNumber=n;
	}
	public void setApplicationFName(String f)
	{
		applicationFName=f;
	}
	public void setApplicationLName(String l)
	{
		applicationLName=l;
	}
	public void setApplicationTelephone(int t)
	{
		applicationTelephone=t;
	}
	public void setApplicationEmail(String e)
	{
		applicationEmail=e;
	}
	public void setResidencyNumber(int r)
	{
		residencyNumber=r;
	}
	public static int getApplicationNumber()
	{
		return applicationNumber;
	}
	public static String getApplicationFName()
	{
		return applicationFName;
	}
	public static String getApplicationLName()
	{
		return applicationLName;
	}
	public static int getApplicationTelephone()
	{
		return applicationTelephone;
	}
	public static String getApplicationEmail()
	{
		return applicationEmail;
	}
	public static int getResidencyNumber()
	{
		return residencyNumber;
	}
	public static int getCustomerId()
	{
		return Customer.getCustomerId();
	}
	public String toString()
	{
		return("Application Number: " + applicationNumber +  " Customer ID: " + getCustomerId() + " Application First Name: " + applicationFName + " Application Last Name: "+ applicationLName + " Application Telephone: " + applicationTelephone + " Application Email: " + applicationEmail + " Application Residency Number " + residencyNumber );
	}
	
	
}
