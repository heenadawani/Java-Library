class Student
{
	int s_id;
	int div;
	Student(int a,int b)
	{
		s_id=a;
		div=b;
		System.out.println("Student is created with id"+s_id+"and division :"+div);
	}
	int getSid()
	{
		return s_id;
	}
	int getDiv()
	{
		return div;
	}
}