
public class MyOuter {

	int x=10;
	int y;
	class MyInner extends MyOuter{
		public void Inner() {
			y=12;
			int z=20;
			System.out.println("From Inner Method "+x);
			System.out.println("From Inner Method "+y);
			System.out.println("From Inner Method "+z);
		}
	}
	public void Outer() {
		MyInner mi=new MyInner();
		mi.Inner();
		System.out.println("From Outer Method "+x);
	}
	public static void main(String[] args) {
		MyOuter mo = new MyOuter();
		//mo.Outer();
		//<outerclassname>.<innerclassname> objname = <outerclass instancename>.new <innerclassname>();
		MyOuter.MyInner moi = mo.new MyInner();
		moi.Inner();
		mo.Outer();
	}

}
