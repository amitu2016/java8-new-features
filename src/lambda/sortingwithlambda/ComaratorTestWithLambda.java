package lambda.sortingwithlambda;

import java.util.ArrayList;
import java.util.Collections;


public class ComaratorTestWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(5);
		a.add(6);
		a.add(12);
		a.add(1);
		
		System.out.println("Before Sorting"+a);
		Collections.sort(a,(o1,o2) -> (o1 > o2) ? -1 : (o2  <o1) ? 1 : 0);
		System.out.println("After Sorting"+a);

	}

}
