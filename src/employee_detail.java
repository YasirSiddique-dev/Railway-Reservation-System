
class employee_detail
{
	//creating private members for data
	private String fullName;
	private String UserName;
	private int age;
	private long Phone;
	private String password;
	//creating setters for private members
	public void setName(String n)
	{
		fullName=n;
	}
	public void setUser(String u)
	{
		UserName=u;
	}
	public void setAge(int a)
	{
		age=a;
	}
	public void setPhone(long p)
	{
		Phone=p;
	}
	public void setPass(String pass)
	{
		password=pass;
	}
	//creating getter for members
	public String getName()
	{
		return fullName;
	}
	public String getUser()
	{
		return UserName;
	}
	public int getAge()
	{
		return age;
	}
	public long getPhone()
	{
		return Phone;
	}
	public String getPassword()
	{
		return password;
	}
		
}




