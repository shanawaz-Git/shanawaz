package firnas;

import java.util.Scanner;

public class printingName {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your name");
	String name= scan.next();
	String name1=name.toUpperCase();
	System.out.println("Hello !"+name1);
}
}
