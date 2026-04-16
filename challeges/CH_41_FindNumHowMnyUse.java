package java_prog.challeges;

public class CH_41_FindNumHowMnyUse {

	  public static void main(String[] args) {

	        int arr[] = {12,23,34,5,55,65,77,89}; //7
	        int delete = 77;

	        for(int i = 0; i < arr.length; i++) {

	            if(arr[i] == delete) {

	                // shift elements using inner loop
	                for(int j = i; j < arr.length - 1; j++) {
	                    arr[j] = arr[j + 1];
	                }

	                break; // stop after deleting
	            }
	        }

	        // print array (one element less)
	        for(int i = 0; i < arr.length - 1; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}

}

