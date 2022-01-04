package com.mph.lambda;

import java.util.function.*;

public class OtherFI {

	public static void main(String[] args) {
	BiPredicate<String,String> res=(un,pw)->un.equals(pw);
	System.out.println(res.test("Priya","Priya"));
	
	if(res.test("Priya","Priya")) {
		System.out.println("Welcome ");
	}else {
		System.out.println("Welcome Guest");
	}
	
	BiPredicate<Long,Long> res2 =(x,y)->x>y;
	BiPredicate<Long,Long> res3=(x,y)->x==y;
	
	System.out.println(res2.or(res3).test(101l,201l));
	
	Supplier<String> s = ()->{ return "Priya";};
	
	System.out.println(s.get());

	Supplier<Integer> s1 =()->{return 123;};
	System.out.println(s1.get());
	
	Function<Integer, String> evenorodd=(num)->{
		if(num%2==0)
		{
			return num+" is Even.";	
		}
		else
		{
			return num+" is Odd";
		}
	};
	System.out.println(evenorodd.apply(60));
	}
}
