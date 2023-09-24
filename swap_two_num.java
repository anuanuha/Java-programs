package swapnumber;

public class swap {
	public static void main(String[] args) {
		swapping(20,30);
		
	}
	public static void swapping(int a,int b) 
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}


