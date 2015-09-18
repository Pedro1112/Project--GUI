
public class Unit extends Property
{
	private static String unitType;
	private static int unitNumber;
	
	public Unit() 
	{
		super();
		setUnitType(" ");
		setUnitNumber(0);
	}
	public Unit(int p,String n, int r, String str, String c, String s, int z, String ut,int un)
	{
		super(p, n, r, str, c, s, z);
		setUnitType(ut);
		setUnitNumber(un);
	}
	public void setUnitType(String ut)
	{
		unitType=ut;
	}
	public void setUnitNumber(int un)
	{
		unitNumber=un;
	}
	public static String getUnitType()
	{
		return unitType;
	}
	public static int getUnitNumber()
	{
		return unitNumber;
	}
	public String toString()
	{
		return(super.toString() + " Unit Type:" + unitType +" Unit Number:" + unitNumber);
	}

}
