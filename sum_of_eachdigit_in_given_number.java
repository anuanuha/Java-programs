public class sumofnum {
	public static void main(String[] args) {
		int res=sumnum(123457);
		System.out.println(res);
	}
	public static int sumnum(int num) {
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
