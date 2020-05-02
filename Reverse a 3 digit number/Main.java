import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n1 = in.nextInt();
   int a = (n1%10);
   int b = (n1%100)/10;
   int c = (n1/100);
   System.out.print(a);
   System.out.print(b);
   System.out.print(c);
  }
}