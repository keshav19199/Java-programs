package java_prog.challeges.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CH_94_PriorityQueue {

	private static class Student
	{
		
		private  String name;
		private  char grade;
		
		public Student(String name, char grade)
		{
			this.name=name;
			this.grade=grade;
		}

		public String getName() {
			return name;
		}

		public char getGrade() {
			return grade;
		}
		
		public String toString()
		{
			return name+": "+grade;
		}

	}
	public static void main(String[] args) {
		
		PriorityQueue<Student> pq=new PriorityQueue<>(new Comparator<>() {

			@Override
			public int compare(Student t1, Student t2) {
				// TODO Auto-generated method stub
				return t1.getGrade() - t2.getGrade();
			}			
		});
		
		pq.offer(new Student("Ram", 'D'));	
		pq.offer(new Student("Karan",'C'));
		pq.offer(new Student("Keshav",'A'));
		
		System.out.println(pq);
		

		System.out.println("Order: "+pq.poll());
		System.out.println("Order: "+pq.poll());
		System.out.println("Order: "+pq.poll());
		
		
	}

}
