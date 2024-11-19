package interfacepgms;
interface company
{
	void employeedetails();
	void salarydetails();
}
class company2
{
	void staffdetails()
	{
		System.out.println("Print Staff details");
	}
	void workstationdetails()
	{
		System.out.println("WorkStation details");
	}
}
public class Assignment53 extends company2 implements company
{
public static void main(String[] args) 
	{
		Assignment53 a=new Assignment53();
		a.staffdetails();
		a.workstationdetails();
		a.employeedetails();
		a.salarydetails();
	}
public void employeedetails()
{
	System.out.println("The employee details are");
}
public void salarydetails()
{
	System.out.println("The salary details are");
}
}
