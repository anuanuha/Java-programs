package swapnumber;
import java.util.Scanner;
public class countevennumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();
	int res=sumofnum(num);
	System.out.println(res);
	}
	public static int sumofnum(int num) {
		int count=0;
		while(num!=0) 
		{
			int rem=num%10;//gives remainder
			if(rem%2==0)
			{
			count++;	
		}
			num=num/10;//gives quotient
	}
		return count;
}
}
	