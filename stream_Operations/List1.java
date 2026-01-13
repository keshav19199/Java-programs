package java_prog.stream_Operations;

import java.util.List;
import java.util.function.Consumer;

public class List1 {

	public static void main(String[] args) {

		List<Integer> list=List.of(12,13,52,43,13,52,21);	//DIRECT Print value
//		System.out.println(list);	
		
		list.stream().forEach(new Int_consum());
	}
}
class Int_consum implements Consumer<Integer>
{
	public void accept(Integer t)
	{
		System.out.println(t+3+" Hello");
	}

}

