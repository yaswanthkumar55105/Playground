import java.util.Scanner;
class Main{
	public static void main (String[] args)
   {
      int n, c, fact = 1;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      if (n < 0)
         System.out.println("Number should be non-negative.");
      else
      {
         for (c = 1; c <= n; c++)
            fact = fact*c;
     
         System.out.println(fact);
      }
   }
}