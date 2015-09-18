
public class Property 
{

	private static int propertyId;
	private static String propertyName; 
	private static int region;
	private static String street;
	private static String city;
	private static String state;
	private static int zip;
	
	public Property()
	{
		setPropertyId(0);
		setPropertyName(" ");
		setRegion(0);
		setStreet(" ");
		setCity(" ");
		setState(" ");
		setZip(0);
	}
	public Property(int p,String n, int r, String str, String c, String s, int z)
	{
		setPropertyId(p);
		setPropertyName(n);
		setRegion(r);
		setStreet(str);
		setCity(c);
		setState(s);
		setZip(z);
	}
	public void setPropertyId(int p)
	{
		propertyId=p;
	}
	public void setPropertyName(String n)
	{
		propertyName=n;
	}
	public void setRegion(int r)
	{
		region=r;
	}
	public void setStreet(String str)
	{
		street=str;
	}
	public void setCity(String c)
	{
		city=c;
	}
	public void setState(String s)
	{
		state=s;
	}
	public void setZip(int z)
	{
		zip=z;
	}
	public static int getPropertyId()
	{
		return propertyId;
		
	}
	public static String getPropertyName()
	{
		return propertyName;
	}
	public static int getRegion()
	{
		return region;
	}
	public static String getStreet()
	{
		return street;
	}
	public static String getCity()
	{
		return city;
	}
	public static String getState()
	{
		return state;
	}
	public static int getZip()
	{
		return zip;
	}
	public static int getEmployeeId()
	{
		return Staff.getEmployeeId();
	}
	public String toString()
	{
		return("Property ID: "+ propertyId + " Property Name: " + propertyName + " Property Region: " + region + " Property Address: " + street + city + state + zip + " Employee Id: " + getEmployeeId());
	}

																																														// getEmployeeID from Staff
	
}
