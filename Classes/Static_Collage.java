//Static variable do not copy it's shearing the value. And last assing value is declared.

package java_prog.Classes;

public class Static_Collage {

	public static void main(String[] args) {
	
		Collage ctbora=new Collage();
		Collage mulika=new Collage();
		
		ctbora.id=1111;
		ctbora.name="Shirur";
		ctbora.pincode=414200;
		
		mulika.id=1111;
		mulika.name="Nighoj";
		mulika.pincode=414306;
		
		System.out.println(Collage.pincode);
		System.out.println(ctbora.pincode);
		System.out.println(mulika.pincode);
		
	}

}
class Collage
{
	int id;
	String name;
	static int pincode;
}
