//Person.java
//Creates and manipulates a person with a first name, last name and age

public class Person
{
	private String firstName;
	private String lastName;
	private int age;

	public Person( String first, String last, int years )
	{
		firstName = first;
		lastName = last;
		
		if ( years > 0 )
			age = years;
	} 

	public String getFirstName()
	{
		return firstName;
	} // end method getFirstName

	public void setFirstName( String first )
	{
		firstName = first;
	} // end method setFirstName

	public String getLastName()
	{
		return lastName;
	} // end method getLastName

	public void setLastName( String last )
	{
		lastName = last;
	} // end method setLastName

	public int getAge()
	{
		return age;
	} // end method getAge

	public void setAge( int years )
	{
		if ( years > 0 )
			age = years;
	} // end method setAge
} // end class Person
