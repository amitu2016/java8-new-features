package lambda.sortingwithoutlambda;

import java.util.ArrayList;
import java.util.Collections;

public class CompartorTestWithoutLambda {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(5);
		a.add(6);
		a.add(12);
		a.add(1);
		
		System.out.println("Before Sorting"+a);
		Collections.sort(a,new MyComparator());
		System.out.println("After Sorting"+a);
	}

}
