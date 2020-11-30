package oOP;

public class Truck extends Pet {

//These are the fields for truck along with the properties.
	
	private int Year;
	private String Make;
	private String Model;
	private int MPG;
	private int Doors;

// Here are the constructors for my Truck.	
public Truck(String Make, String Model) {
	
	this.Make = Make;
	this.Model = Model;
}

public Truck(int Year, String Make, String Model, int MPG, int Doors)
{
	this.Year = Year;
	this.Make = Make;
	this.Model = Model;
	this.MPG = MPG;
	this.Doors = Doors;
}

public Truck()
{
	Year = 1999;
	Make = "Chevrolet";
	Model = "Silverado";
	MPG = 20;
	Doors = 4;
}

// The Getters and Setters for all fields in Truck
public int getYear() {
	return Year;
}

public void setYear(int year) {
	Year = year;
}

public String getMake() {
	return Make;
}

public void setMake(String make) {
	Make = make;
}

public String getModel() {
	return Model;
}

public void setModel(String model) {
	Model = model;
}

public int getMPG() {
	return MPG;
}

public void setMPG(int mPG) {
	MPG = mPG;
}

public int getDoors() {
	return Doors;
}

public void setDoors(int doors) {
	Doors = doors;
}

//Method to run and obtain the return using the constructors.
public static void main(String[] args) {
	
	Truck slick  = new Truck(1999, "Chevrolet","Silverado",20, 4);
	System.out.println("My truck is a " + slick.Year + " " + slick.Make + " " + slick.Model +
			" that has " + slick.Doors + " doors " + "and makes " + slick.MPG + " MPG.");
}
	


}


