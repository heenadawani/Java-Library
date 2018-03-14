import java.util.*;
class LibraryDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id");
		int a=sc.nextInt();
		System.out.println("Enter total copies");
		int b=sc.nextInt();
		Lib l1=new Lib(a,b);
		System.out.println("Library object created");
		
		
		/*Book 2 details
		System.out.println("Enter book id");
		a=sc.nextInt();
		System.out.println("Enter total copies");
		b=sc.nextInt();
		Lib l2=new Lib(a,b);*/
		
		//recording student information
		System.out.println("---------------------");
		System.out.println("Enter student id");
		a=sc.nextInt();
		System.out.println("Enter division");
		b=sc.nextInt();
		Student s1=new Student(a,b);
		
		//issue the book
		System.out.println("---------------------");
		int c,d;
		System.out.println("Enter student_id");
		c=sc.nextInt();
		System.out.println("Enter book id");
		d=sc.nextInt();
		Student_Lib sl1;
		if(c==s1.getSid())
		{
			System.out.println("Student exist");
			if(d==l1.getBid())
			{
				
				if(l1.getNoc()>0)
				{
					System.out.println("No of Copies available");
					l1.issueBook();
					sl1=new Student_Lib(c,d);
				}
			}
		}
		System.out.println("Thank you for using library system. Bye bye...");
	}
}