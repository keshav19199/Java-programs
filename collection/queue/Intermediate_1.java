package java_prog.collection.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intermediate_1 {

	public static void main(String[] args) {
		
		//perform-> intermediate-> 
		//filter,map,sorted,peek,reduce,distinct,flatmap,
		//count, limit, skip, foreach, collect, min,max, anymatch,allmatch
		//nonematch, findfirst, findany,

		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0,0,9,7,6,5,4);
		
		//filter()
		list.stream()
		.filter(n-> n%2==0)
		.forEach((i)-> {System.out.println("filter: "+i);});
		System.out.println("********************************");
		
		//map()
		list.stream()
		.map(i->i*3)
		.forEach((k)->{System.out.println("map: "+k);});
		System.out.println("********************************");
		
		//Distinct
		list.stream()
		.distinct()
		.forEach((i)->{System.out.println("Disinct: "+i);});
		System.out.println("********************************");

		//sorted
		list.stream()
		.sorted((a,b)->(Integer.compare(b, a)))
		.forEach((i)->{System.out.println("sorted: "+i);});
		System.out.println("********************************");

		
		//limit()
		list.stream()
		.limit(4)
		.forEach((i)->System.out.println("Limit: "+i));
		System.out.println("********************************");

		// skip()
		list.stream()
		.skip(13)
		.forEach((s)->System.out.println("skip: "+s));
		System.out.println("********************************");

		
		// forEach
		list.stream()
		.forEach((u)->System.out.println("forEach :"+u));
		System.out.println("********************************");

		// count
		long l=list.stream()
		.filter(n -> 6>n)
		.count();
		System.out.println("count: "+l);
		System.out.println("********************************");

		// min
		int min=list.stream()
		.min((n,m) -> (n-m))
		.get();
		
		System.out.println("min: "+min);
		System.out.println("********************************");

		// max
		int max=list.stream()
				.max((n,m) -> (n-m))
				.get();
		System.out.println("Max: "+max);
		System.out.println("********************************");

		// anyMatch
		boolean b=list.stream()
				.anyMatch((n)-> (n>4));
		System.out.println("anyMatch: "+b);
		System.out.println("********************************");

		//Allmatch
		boolean a=list.stream()
				.allMatch((m)-> (m%2==0 ));
		
		System.out.println("allMatch: "+a);
		System.out.println("********************************");

		//noneMatch
		boolean v=list.stream()
				.noneMatch((j)-> (j<0));
		
		System.out.println("nopneMatch: "+v);
		System.out.println("********************************");

		// findFirst
		int first=list.stream()
		.findFirst()
		.get();
		
		System.out.println("findFirst: "+first);
		System.out.println("********************************");

		// findAny
		int any=list.stream()
				.findAny()
				.get();
		
		System.out.println("findAny: "+any);
		
	}

}
