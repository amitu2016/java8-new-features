package lambda.example1;

public class Test {
		
	
	public static void main(String[] args) {
		
		Intref i = s -> s.length();
		
		System.out.println(i.getLength("Hello")); 
		System.out.println( i.getLength("Lambda Implementaion"));
		
	}

}
