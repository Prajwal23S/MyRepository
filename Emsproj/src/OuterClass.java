
public class OuterClass {
	static int x = 10;
	int z=20;
	public void method() {
		System.out.println("Outher Method : )");
		System.out.println("x = " + x);
	}

	static class InnerClass extends OuterClass{
		int y=12;
		public void innerMethod() {
			System.out.println("Inner Method : )");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);
		}
	}

	public static void main(String[] args) {
		OuterClass.InnerClass oic = new OuterClass.InnerClass();
		oic.innerMethod();

		OuterClass oc = new OuterClass();
		oc.method();
	}

}
