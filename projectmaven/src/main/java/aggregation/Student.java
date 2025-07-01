package aggregation;

public class Student {
	
	String name;
	int rollnumber;
	Address address;
	
	public Student(String name, int rollnumber, Address address) {
		this.name = name;
		this.rollnumber = rollnumber;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name: " +name);
		System.out.println("RollNumber: " +rollnumber);
		System.out.println("City: " +address.city);
		System.out.println("State: " +address.state);
	}

	public static void main(String[] args) {
		Address addr = new Address("Alappuzha","Kerala");
		Student std = new Student("Sabana",12,addr);
		std.display();
		

	}

}
