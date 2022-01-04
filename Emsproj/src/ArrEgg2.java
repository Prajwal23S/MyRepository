import java.util.Scanner;

public class ArrEgg2 {

	public static void main(String[] args) {
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many employee details need to be given");
		x=sc.nextInt();
		int[] arr=new int[x];
		String y=null;
		int z=0;
		for(int i=0;i<x;i++) {
		System.out.println("Enter the Employee name");
		y=sc.next();
		System.out.println("Enter salary");
		z=sc.nextInt();
		System.out.println("EmployeeName "+y+" Salary"+z);
		}
		
	}

}
