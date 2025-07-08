package abstraction;

public class FulltimeEmploy extends Employee {

	int payment;
	public static void main(String[] args) {
		
		FulltimeEmploy obj=new FulltimeEmploy(1000);
		Contractor obj1= new Contractor(6,500);
		obj.calculateSalary();
		obj1.calculateSalary();
	}
	public FulltimeEmploy(int payment)
	{ 
		
		this.payment=payment;
	}
	public void calculateSalary()
	{
		int salary=payment*8;
		System.out.println("FulltimeEmploy Salary "+salary);
	}
}
