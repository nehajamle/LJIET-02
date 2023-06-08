import java.util.Scanner;
public class student
{
	String name,branch_name;
	int id;
	public void setMethod()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		name=sc.next();
		System.out.println("Enter branch name");
		branch_name=sc.next();
		System.out.println("Enter student ID");
		id = sc.nextInt();
	}
	public void getMethod()
	{
		System.out.println("-----You Student Details-----");
		System.out.println("Name=" + name);
		System.out.println("Branch=" + branch_name);
		System.out.println("Id=" +id);
	}	
	public static void main(String[] args) 
	{
			student s1[] = new student[5];
			System.out.println("Enter Student Details::");
			int i=1;
			do
			{
				System.out.println(i);
				s1[i]=new student();
				s1[i].setMethod();
				i++;	
			}while(i<=5);
			
			for(i=1;i<=5;i++)
			{
				System.out.println(i);
				s1[i].getMethod();
			}
		}
	}