 import java.util.Scanner;
 public class calculat
 {
	 public static void main(String[]args)
	 {
		 double a, b,c;
		 System.out.print("enter any two number:");
		 Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 b=s.nextInt();
		 c=a+b;
		 double d=a-b;
		 double e=a*b;
		 double f=a/b;
		 System.out.println("sum two number:"+c);
		 System.out.println("subtract two number:"+d);
		 System.out.println("multiple two number:"+e);
		 System.out.println("divaid two number:"+f);
	 }
 }