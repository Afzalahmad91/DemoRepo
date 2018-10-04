package alerthand;

public class Employee extends SuperDemo{
	float salary;	
	public Employee(int id, String name, float salary){
		super(id, name);
		this.salary=salary;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	}
