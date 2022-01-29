package firnas;
import java.util.Scanner;
public class calculator {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a number..:");
	int num1=scan.nextInt();
	System.out.println("Please enter another number..:");
	int num2=scan.nextInt();
	int add=num1+num2;
	int sub=num1-num2;
	int div=num1/num2;
	int mul=num1*num2;
	System.out.println("Addition of two number ..:"+add);
	System.out.println("Subtration of two numbers..:"+sub);
	System.out.println("Multiplication of two numbers..:"+mul);
	System.out.println("Division of two numbers..:"+div);
}
}
