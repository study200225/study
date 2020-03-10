package sec01.exam01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value;
	
// value를 초기화하지 않고 사용해서 error
//		int result = value + 10;
		value = 0;
		int result = value + 10;
		
		System.out.println(result);
	}
}
