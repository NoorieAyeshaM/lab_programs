class Employee1
{
	String empName;
	int empNo;
	String empDesig;
	byte expYrs;
	double basicSalary;
	double netSalary;
	double grossSalary;
	double dearnessAllowance;
	double HRA;
	double PA;
	double IT;
	Employee1()
	{
		empName=null;
		empNo=0;
		empDesig=null;
		expYrs=0;
		basicSalary=0.0d;
	}
	Employee1(String name,int no,String des,byte ex,double basicsalary)
	{
		empName=name;
		empNo=no;
		empDesig=des;
		expYrs=ex;
	    basicSalary=basicsalary;
	}
	Employee1(Employee1 obj1,Employee1 obj2)
	{
		empName=obj1.empName;
		empNo=obj2.empNo;
		empDesig=obj1.empDesig;
		expYrs=obj2.expYrs;
		basicSalary=obj2.basicSalary;
	}
	void getEmployee1()
	{
		dearnessAllowance=basicSalary*0.40;
		HRA=basicSalary*0.25;
		PA=basicSalary*10;
		grossSalary=basicSalary+dearnessAllowance+HRA+PA;
		
		IT=basicSalary*10;
		netSalary=grossSalary-IT;
		
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t"+expYrs+"\t\t"+basicSalary+"\t\t"+grossSalary+"\t\t"+netSalary);
	}
Public class GrossSalary
{
	public static void main(String[] args)
	{
		System.out.println("empName\tempNo\tempDesig\texpYrs\tbasicSalary\tgrossSalary\tnetSalary");
		Employee1 rakesh=new Employee1();
		rakesh.getEmployee1();
		Employee1 rahul=new Employee1("Rahul",100,"PM",(byte)10,10000.0d);
		rahul.getEmployee1();
		Employee1 ramya=new Employee1(rakesh,rahul);
		ramya.getEmployee1();
	}		
}
