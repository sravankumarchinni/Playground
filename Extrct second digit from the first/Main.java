import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      int sec = 0;
        while(n>9){
          sec = n%10;
          n = n/10;
		}
		System.out.print(sec);
	}
}