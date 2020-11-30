package oOP;

public class Pet {
	
//These are the fields for my pet along with the properties.
	
	private String name;
	private int years;
	private String location;
	private String type;

// Here are the constructors for my pet.
public Pet(String name, int years, String location, String type)
{
	this.name = name;
	this.years = years;
	this.location = location;
	this.type = type;
}

public Pet()
{
	name = "barkers";
	years = 5;
	location = "Room";
	type = "Schnauzer";
}

//Getters and Setters for specified fields.

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getYears() {
	return years;
}

public void setAge(int years) {
	this.years = years;
}

public String getType() {
	return type;
}

public void setLocation(String location) {
	this.location = location;
}

//Method to run and obtain the return using the constructors.
public static void main(String[] args) {
	
	Pet dog  = new Pet("barkers", 5, "Room","Schnauzer");
	System.out.println("My dog " + dog.name + " is " + dog.years + " years old" + 
	" and a " + dog.type + ".");
	
}

}
