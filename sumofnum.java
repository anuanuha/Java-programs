package sample
import java.util.Scanner;
public class sumofnumbyuserinput {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num1");
        double num1=sc.nextDouble();
        Scanner sc=new Scanner(System.in);
	System.out.println("enter the num2");
	double num2=sc.nextDouble();
	int res=sumofnum(num1,num2);
	System.out.println(res);
	}
	public static double sumofnum(double num1,double num2) {
		    return num1+num2;
	
		}
		
	}


