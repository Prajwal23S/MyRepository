interface Addition {
	public int add(int a, int b);
}

class Java8 {
/*
	   public int add(int a,int b) {
	    return a+b; }
	    public static void main(String[]
	   args) { Addition a = new Java8(); System.out.println(a.add(5,5)); }
*/
	public static void main(String[] args) {
		Addition result = (a, b) -> {
			return a + b;
		};
		System.out.println(result.add(10, 10));
	}
}
