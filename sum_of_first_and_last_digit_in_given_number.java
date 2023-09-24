package swapnumber;
import java.util.Scanner;
public class sumoffirstandlast {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();
	int res=sumofnum(num);
	System.out.println(res);
	}
	public static int sumofnum(int num) {
		int first_digit=0;
		int last_digit=num%10;//gives remainder
		while(num!=0) 
		{
			
			first_digit=num%10;
			num=num/10;//gives quotient
	}
		return first_digit+last_digit;
}
}
