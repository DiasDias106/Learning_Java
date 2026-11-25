import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double x ,y,z;
		Scanner scan = new Scanner(System.in);
		System.out.println("introduza o lado x");
		x = scan.nextDouble();
		System.out.println("introduza o lado y");
		y = scan.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("a hipotenusa tem o valor" + z);
		
		scan.close();		
		
		

	}

}
