import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner on = new Scanner(System.in);
      int n = on.nextInt();
      int m = on.nextInt();
      int k = on.nextInt();
      if(n>m && n>k)
      {
      System.out.println(n);
      }
      else if(m>k && m>n)
      {
      System.out.println(m);
      }
        else
          System.out.println(k);
    }
}