import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEg {

	public static void main(String[] args) {
		int[] intArr= {10,15,9,3,6,7};
	    Arrays.sort(intArr);
	    System.out.println("Sorted Array :"+Arrays.toString(intArr));
	    
	    String[] strArr= {"Sona","swetha","nikil","Aarika"};
	    Arrays.sort(strArr);
	    System.out.println("Sorted Array :"+Arrays.toString(strArr));
	    
	    List<String> strList = new ArrayList<String>();
	    strList.add("Hema");
	    strList.add("Ram");
	    strList.add("Swetha");
	    strList.add("Ram");
	    strList.add("Pankaj");
	    
	    Collections.sort(strList);
	    System.out.println("StrList :"+strList);
	    
	    Student[] stuArray = new Student[3];
	    stuArray[0]=new Student(50,"Gautham",90,25);
	    stuArray[1]=new Student(20,"Priya",98,24);
	    stuArray[2]=new Student(30,"Aarika",89,21);
	    
	    Arrays.sort(stuArray);
	    System.out.println("Sorted Student Arr =" + 
	    Arrays.toString(stuArray));
	    
	    Arrays.sort(stuArray,Student.nameComparator);
	    System.out.println("Sorted Student Arr w.r.t names ="+
	    Arrays.toString(stuArray));
	    
	    Arrays.sort(stuArray,Student.marksComparator);
	    System.out.println("Sorted Student Arr w.r.t maks ="+
	    Arrays.toString(stuArray));
	    
	
	}

}
