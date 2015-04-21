package javaenum2;

enum test {ONE, TWO}

public class enums2 {

	public static void main(String[] args) {
		
		test t = test.valueOf("ONE9");
		System.out.println(t);
	/*	for (test t : test.values()){
			System.out.println(t.name());
		}*/

	}

}
