package java_prog.challeges;

public class CH_57_MothDeclaration {

	public static void main(String[] args) {

		int monthNO=3;
		
		String month=switch(monthNO) {
		
		case 1-> "January";
		case 2-> "february";
		case 3-> "March";
		case 4-> "April";
		case 5-> "May";
		case 6-> "June";
		case 7-> "Julay";
		case 8-> "Augast";
		case 9-> "September";
		case 10-> "October";
		case 11-> "November";
		case 12-> "December";
		
		default -> "This month is not present in Earth";
		
		};
		System.out.println(month);
	}

}
