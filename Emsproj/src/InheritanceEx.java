class Employee2{
	String name="Prajwal";
	String salary ="30000";
	Employee2(){
		this("Bangalore");
	System.out.println("Employee Constructer");
}
	Employee2(String city) {
		System.out.println("Employee is from "+city );
	}
	Employee2(String city, String state){
		System.out.println("Employee blongs to "+state+" state and "+city+" city");
	}
	public String getDetails(){
		return name + salary;
	}
}
class Manager extends Employee2{
	public String dept="IT";
	Manager(){
		super("Bangalore","Karnataka");
		System.out.println("Manager Constructer");
	}
	public String getDetails(){
		return super.getDetails() + dept;
	}
	
}

public class InheritanceEx {

	public static void main(String[] args) {
		Employee2 emp=new Employee2();
		System.out.println(emp.getDetails());
		
		Manager mg=new Manager();
		System.out.println(mg.getDetails());

	}

}
