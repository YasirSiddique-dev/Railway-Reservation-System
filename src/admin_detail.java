class admin_detail
{
	//creating the private members of the class
	private String fullName;
	private String UserName;
	private int age;
	private long Phone;
	private String password;
	//creating the setters for the private members
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
	//creating the getters for the private members
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




