class Lib
{
	int b_id;
	int noc;
	Lib(int a,int b)
	{
			b_id=a;
			noc=b;
			System.out.println("Book is created with id:"+b_id+" and No of copies :"+noc);
	}
	int getBid()
	{
		return b_id;
	}
	int getNoc()
	{
		return noc;
	}
	void issueBook()
	{
		noc=noc-1;
		System.out.println("No of Copies are :"+noc);
	}
	void returnBook()
	{
		noc=noc+1;
		System.out.println("No of Copies are :"+noc);
	}
}