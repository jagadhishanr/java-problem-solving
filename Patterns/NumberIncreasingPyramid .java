import java.util.Scanner;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter input");
		    int n = scan.nextInt();
		    for(int i=1; i<=n;i++) {
		    	for(int j=1; j<=i; j++) {
		    		System.out.print(i);
		    	}
		    	System.out.println();
		    }

		}

	
	}


