import java.io.*;
import java.util.*;
class Employee
{
	int empno;
	String empname,city;
	float salary;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee number: ");
		empno=sc.nextInt();
		System.out.print("Enter employee name: ");
		empname=sc.next();
		System.out.print("Enter employee city: ");
		city=sc.next();
		System.out.print("Enter employee salary: ");
		salary=sc.nextFloat();
	}
	void display()
	{
		System.out.println("");
		System.out.println("Employee number: "+empno);
		System.out.println("Employee name: "+empname);
		System.out.println("Employee city: "+city);
		System.out.println("Employee salary: "+salary);
	}
	//void search(){}
	//void salary(){}
}
class lab12ex
{
	public static void main(String args[])
	{
		int ch,k;
		char c;
		int j=0;
		Employee ob[]=new Employee[10];
		for(k=0;k<10;k++)
		{
			ob[k]=new Employee();
		}
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("1. Input employee information. ");
			System.out.println("2. Display all employee information.");
			System.out.println("3. Search the emplopyee who is staying in valsad.");
			System.out.println("4. Display all employee who have earned salary more than 5000.");
			System.out.println("5. Exit.");
			System.out.print("Enter your choice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					ob[j].input();
					j++;
					break;
				case 2:
					for(int d=0;d<j;d++)
					{
						ob[d].display();
					}
					break;
				case 3:
					for(int s1=0;s1<j;s1++)
					{
						if(ob[s1].city=="valsad")
						{
							ob[s1].display();
						}
						else
						{
							System.out.println("City is not valsad for object "+s1);
						}
					}
					break;
				case 4:
					for(int s2=0;s2<j;s2++)
					{
						if(ob[s2].salary>=5000)
						{
							ob[s2].display();
						}
						else
						{
							System.out.println("City is not valsad for object "+s2);
						}
					}
					break;
				case 5:
					break;
				default :
					System.out.println("Wrong choice.");
					break;
			}
			System.out.print("Do you want to continue?(y/n): ");
			c=s.next().charAt(0);
		}while(c=='y');
	}
}