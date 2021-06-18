
public class tickets {
	private String Name;
	private long Phone;
	private String FromLocation;
	private String ToLocation;
	private String Services;
	private int Seats;
	private String Date;
	private String time;
	
	public void setName(String n)
	{
		Name=n;
	}
	public void setFrom(String f)
	{
		FromLocation=f;
	}
	public void setTo(String t)
	{
		ToLocation=t;
	}
	public void setPhone(long p)
	{
		Phone=p;
	}
	public void setServices(String s)
	{
		Services=s;
	}
	public void setSeats(int seat)
	{
		Seats=seat;
	}
	public void setDate(String d)
	{
		Date=d;
	}
	public void setTime(String t)
	{
		time=t;
	}
	public String getName()
	{
		return Name;
	}
	public String getFrom()
	{
		return FromLocation;
	}
	public String getTo()
	{
		return ToLocation;
	}
	public long getPhone()
	{
		return Phone;
	}
	public String getService()
	{
		return Services;
	}
	public int getSeats()
	{
		return Seats;
	}
	public String getDate()
	{
		return Date;
	}
	public String getTime()
	{
		return time;
	}

}
