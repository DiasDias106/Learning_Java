import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		System.out.println("qual e o teu nome");
		String nome = scaner.nextLine();
		System.out.println("qual e a tua idade\t");
	    int idade = scaner.nextInt();
	    scaner.nextLine();
		System.out.println("ola " + nome);
		System.out.println("ele tem " + idade + "  anos");
		

	}

}
