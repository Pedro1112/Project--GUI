
public class Staff 
{
	private static int employeeId;
	private static String staffFName;
	private static String staffLName;
	//private String type;


	public Staff()
	{
		setEmployeeId(0);
		setStaffFName(" ");
		setStaffLName(" ");
		//setType("");
	}
	public Staff(int ei, String fn,String ln)
	{
		setEmployeeId(ei);
		setStaffFName(fn);
		setStaffLName(ln);
		//setType(t);
	}
	public void setEmployeeId(int ei)
	{
		employeeId=ei;
	}
	public void setStaffFName(String fn)
	{
		staffFName=fn;
	}
	public void setStaffLName(String ln)
	{
		staffLName=ln;
	}
	
	/*public void setType(String t)
	{
		type=t;
	} */
	
	public static int getEmployeeId()
	{
		return employeeId;
	}
	public static String getStaffFName()
	{
		return staffFName;
	}
	public static String getStaffLname()
	{
		return staffLName;
	}
	/*
	public static String getType()
	{
		return type;    what type?
	}  */
	
	public String toString()
	{
		return("Employee ID: " + employeeId +" First Name: "+ staffFName + " Last Name: " + staffLName );  
		//" type " + type);     
				
	}

}


