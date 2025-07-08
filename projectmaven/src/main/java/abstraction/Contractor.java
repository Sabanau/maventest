package abstraction;

public class Contractor extends Employee{
	int hour;
	int payment;
	
	public Contractor(int h,int p)
	{
		
		this.hour=h;
		this.payment=p;
	}
	public void calculateSalary()
		{
			int salary=hour*payment;
			System.out.println("Contractor Salry "+salary);
		}

}
