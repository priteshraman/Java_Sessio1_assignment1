import java.util.Scanner;
public class Sum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a;
		float b;
		System.out.println("enter integer number");
		a=sc.nextInt();
		System.out.println("enter float number");
		b=sc.nextFloat();
		float sum=(a+b);
		int t=(int) sum;
		System.out.println("the sum of no. is");
		System.out.println(t);
		
		
	}
}