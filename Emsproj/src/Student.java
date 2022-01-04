import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int sid;
	private String sname;
	private int marks;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int marks, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.age = age;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return this.sid - s1.sid;
	}
	//Anonymous Class
	public static Comparator<Student> nameComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.getSname().compareTo(s2.getSname());
		}
		
	};
	
	public static Comparator<Student> marksComparator = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.getMarks()-s2.getMarks();
		}
		
	};

}
