package test;

public class NormalJavaImplementation {
	
	
	public void before() {
		System.out.println("from before");
	}
	
	public void after() {
		System.out.println("from after");
	}
	
	public void tc1() {
		System.out.println("from tc1");
	}
	
	public void tc2() {
		System.out.println("from tc2");
	}
	
	public static void main(String[] args) {
		NormalJavaImplementation obj = new NormalJavaImplementation();
		obj.before();
		obj.tc1();
		obj.after();
		
		obj.before();
		obj.tc2();
		obj.after();
	}

}
