package swapnumber;
import java.util.Scanner;
public class sumofaddnum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();
	int res=sumofnum(num);
	System.out.println(res);
	}
	public static int sumofnum(int num) {
		int sum=0;
		while(num!=0) 
		{
			int rem=num%10;//gives remainder
			if(rem%2!=0)
			{
			sum=sum+rem;
			
		}
			num=num/10;//gives quotient
	}
		return sum;
}
}