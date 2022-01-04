import java.util.Scanner;
public class Activity7{

public static void main(String[] args) {
System.out.println("Welcome User");
String c=null;			
do {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number");
double x=sc.nextDouble();
System.out.println("Enter second number");
double y=sc.nextDouble();
System.out.println("Enter your choice");
System.out.println("1=Add");
System.out.println("2=sub");
System.out.println("3=mul");
System.out.println("4=div");
int choice = sc.nextInt();
switch(choice) {
case 1:{
	System.out.println(x+y);
	break;
	}
case 2:{
	System.out.println(x-y);
	 break;
	}
case 3:{
	System.out.println(x*y);
	 break;
	}
case 4:{
	System.out.println(x/y);
	 break;
	}
default:{
	System.out.println("Enter the right option");
	}
}
System.out.println("Do you want to continue? Y or y");
c=sc.next();
}while(c.equals("y") || c.equals("Y"));
	System.out.println("Exited from application");
	System.exit(0);
}
}