
public class MouterClass {
	int x = 10;

	public void method() {
		int y = 12;
		  class MinnerClass {
			  int z = 20;
			void innerMethod() {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("z = " + z);
			}
		}
		MinnerClass mic = new MinnerClass();
		mic.innerMethod();
		
	}

	public static void main(String[] args) {
		MouterClass moc = new MouterClass();
		moc.method();
	}

}
