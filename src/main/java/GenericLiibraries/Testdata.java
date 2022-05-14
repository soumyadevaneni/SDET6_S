package GenericLiibraries;

import com.github.javafaker.Faker;

public class Testdata {

	public String getfirstname() {
		
	Faker faker=new Faker();
	String firstname=faker.name().firstName();
	
		return firstname;

	}
	public String getlastname() {
		Faker faker=new Faker();
		String lastname=faker.name().lastName();
		return lastname;
	}
}
