package hello;

public class Test {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int substract(int a,int b) {
		return a-b;
	}
	public static int mal(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		System.out.println("Main method added and file is pushed from eclipse");
		Employee e = new Employee(114, "Shubham");
		System.out.println(e.getName());
		System.out.println(add(10, 20));
		System.out.println(substract(20, 10));
	}

}
