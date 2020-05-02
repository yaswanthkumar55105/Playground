import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
     int sum = 0;
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     for(int num = 1; num<=n; num = num+1)
     {
     sum = sum + num;
     }
    System.out.println(sum);
   }
}