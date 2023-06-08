import java.util.Scanner;
public class employee 
{
	int emp_id,dept_id;
	String name,dept_name;
	public void set_emp_details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id");
		emp_id=sc.nextInt();
		System.out.println("Enter dept id");
		dept_id=sc.nextInt();
		System.out.println("Enter emp name");
		name = sc.next();
		System.out.println("Enter dept name");
		dept_name = sc.next();
	}
	public void show_details()
	{
		System.out.println("-----You employee Details-----");
		System.out.println(emp_id);
		System.out.println(dept_id);
		System.out.println(name);
		System.out.println(dept_name);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		employee emp[] = new employee[5];
		System.out.println("Enter employee Details:");
		String answer="";
		int number = 0 ;
		int i = 0;
		do
		{
			System.out.println("Do want to add employees ? Y/N");
			answer = sc.next();
			if(answer.equals("Y") || answer.equals("y") )
			{
				System.out.println("\nEnter Data of employee "+i);
				emp[i]=new employee();
				emp[i].set_emp_details();	
				number++;
			}
			else
			{
				break;
			}
			i++;
		}while(i<5);
		
		System.out.println("\nTotal number of emloyees are : "+number+"\n");
		 
		if(number>0)
		{
			for(i=0;i<number;i++)
			{
				System.out.println("Details of emp------" + i);
				emp[i].show_details();
			}
		}
	}
}