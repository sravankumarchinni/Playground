import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(sumofanumber(n));
	}
  public static int sumofanumber(int s)
  {
   int sum = s*s; 
    return sum;
  }
}