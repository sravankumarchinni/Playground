import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
	    for(int row = 1;row <= n; ++row)
	    {
	        for(int space = 1; space <=  n - row; space++)
	        {
	            System.out.print(" ");
	        }
	        for(int col = 1; col <= (2 * row - 1); ++col)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}