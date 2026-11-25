import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int num1,num2,num3=0;
	  boolean feito = false;
      System.out.println("introduza uma opcao");
     String op = scan.nextLine();
     switch(op) {
     case "+" :
    	 System.out.println("introduza um numero");
    	  num1 = scan.nextInt();
    	 scan.nextLine();
    	 System.out.println("introduza outro numero");
    	  num2 = scan.nextInt();
    	 scan.nextLine();
    	  num3 = num1 + num2;
    	  feito = true;
    	 break;
     case "-" :
    	 System.out.println("introduza um numero");
    	  num1 = scan.nextInt();
    	 scan.nextLine();
    	 System.out.println("introduza outro numero");
    	  num2 = scan.nextInt();
    	 scan.nextLine();
    	  num3 = num1 - num2;
    	  feito = true;
    	 break;
     case "*" :
    	 System.out.println("introduza um numero");
    	  num1 = scan.nextInt();
    	 scan.nextLine();
    	 System.out.println("introduza outro numero");
    	  num2 = scan.nextInt();
    	 scan.nextLine();
    	  num3 = num1 * num2;
    	  feito = true;
    	 break;
     case "/" :
    	 System.out.println("introduza um numero");
    	  num1 = scan.nextInt();
    	 scan.nextLine();
    	 System.out.println("introduza outro numero");
    	  num2 = scan.nextInt();
    	 scan.nextLine();
    	  num3 = num1 / num2;
    	  feito = true;
    	 break;
     case "%" :
    	 System.out.println("introduza um numero");
    	  num1 = scan.nextInt();
    	 scan.nextLine();
    	 System.out.println("introduza outro numero");
    	  num2 = scan.nextInt();
    	 scan.nextLine();
    	  num3 = num1 % num2;
    	  feito = true;
    	 break;
    default:
    	  System.out.println("operacao invalida");
    	  break;
     }
     if(feito == true) {
     
      System.out.println("A operacao realizada resultou em " + num3);
	}

}
}
