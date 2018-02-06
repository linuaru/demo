package collection;

import java.util.*;

public class arraylistex {
	
	public static void main(String args[])
	{
		ArrayList<Student> arr = new ArrayList<Student>();
		Student s1 = new Student(1,"abc");
		Student s2 = new Student(2,"xyz");
		Student s3 = new Student(3,"pqr");
		Student s4 = new Student(4,"mno");
		Student s7 = new Student(11,"asd");
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s7);
		ArrayList<Student> arr1 = new ArrayList<Student>();
		
		Student s5 = new Student(1,"abc");
		Student s6 = new Student(4,"mno");
		
		
		arr1.add(s5);
		arr1.add(s6);
		
		
		
		//arr.addAll(arr1);
		
		Iterator<Student> itr = arr.iterator();
		while(itr.hasNext())
			
		{
			Student st = (Student)itr.next();
		System.out.println("rno= "+st.rno+"name = "+st.name);
	}
		
		arr.retainAll(arr1);
		System.out.println("after retain all");
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}
	
}
class Student
{
	int rno;
	String name;
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
