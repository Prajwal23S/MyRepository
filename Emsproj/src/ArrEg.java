class Employee {
	 private String ename;
	 private int salary;
	 
	 public Employee()
	 {		 
		 System.out.println("From Employee Constructor");
	 }

	public Employee(String ename,int salary)
	 {		 
		this.ename=ename;
		this.salary=salary;		
	 }
	 public void setEname(String ename)
	 {
		 this.ename=ename;
	 }
	 public String getEname()
	 {
		 return ename;
	 }	 
	 public void setSalary(int salary) {
		 this.salary=salary;
	 }
	 
	 public int getSalary()
	 {
		 return salary;
	 }
	 
	 public String toString()
	 {
	return "Employee  [ " + this.ename +"  " + this.salary+  "  ]";
	 }
	 

}
public class ArrEg {

	private static final Object[] Employee = null;

	public static void main(String[] args) {
		int[] arr=new int[3];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i : arr) {
			System.out.println(i);
		}
		Employee e1=new Employee("Pankaj",25000);
		Employee e2=new Employee("Pank",25001);
		Employee e3=new Employee("Panka",25002);
		
		Employee[] arr2=new Employee[3];
		arr2[0]=e1;
		arr2[1]=e2;
		arr2[2]=e3;
		for(Employee i : arr2) {
			System.out.println(i);
		}
		Employee[] arr3 = { e1,e2,e3 };
		for(Employee i : arr2) {
			System.out.println(i);
		}
		
	}

}
