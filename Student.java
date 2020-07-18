package JavaSessions;

public class Student {
	
	public void getCity(){
		System.out.println("get city");
	}
	
	public void getAddress(){
		System.out.println("get city");
		getCity();
	}
	
	public static void getMarks(){
		System.out.println("get marks");
		getValue();
	}
	
	public static void getValue(){
		System.out.println("get value");
		
	}

	public static void main(String[] args) {

		getMarks();
		
		
		
		
	}

}
