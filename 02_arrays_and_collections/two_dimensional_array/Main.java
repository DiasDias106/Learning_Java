import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String[][] carros = new String [3][3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.println("introduza carros");
				carros[i][j] =  scan.nextLine();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
              System.out.println(carros[i][j]);
			}
		}

	}

}
