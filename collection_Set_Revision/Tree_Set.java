package java_prog.collection_Set_Revision;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {

		TreeSet<Car> tree=new TreeSet<Car>();
		
		Car c1=new Car();
		c1.price=12;
		c1.name="mercedese";
		
		Car c2=new Car();
		c2.price=10;
		c2.name="Swift";
		
		tree.add(c1);
		tree.add(c2);
		
		System.out.println(tree);
		
	}
}

class Car implements Comparable<Car>
{
	int price;
	String name;

	@Override
	public int compareTo(Car o) {
		return Integer.compare(this.price, o.price);
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + "]";
	}

	
	
	
}
