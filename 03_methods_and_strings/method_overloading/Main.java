public class Main {

	public static void main(String[] args) {
		int x = add(1,2);
		int y = add(1,2,3);
		int z = add(1,2,3,4);

	}
	
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b,int c) {
		System.out.println("metodo que sofreu overload");
		return a+b+c;
		
	}
	static int add(int a, int b,int c, int d) {
		System.out.println("metodo que sofreu overload");
		return a+b+c+d;
	}

}
