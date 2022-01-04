public class Test {
	Integer x;
	public static void main(String[] args) {
		new Test().go(5);
	}
	void go(Integer i) {
		System.out.println(x+ ++i);
	}

}
