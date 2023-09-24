
package swapnumber;
import java.util.Scanner;
public class sumofnumbyuserinput {
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
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		return sum;
	}
}
